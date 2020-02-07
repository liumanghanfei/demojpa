package com.example.demojap.utils.sql;

import com.example.demojap.utils.common.Inspector;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * 本类 主要的功能是 帮助开发者 生成 hql
 */
public class Hql implements Grammar{
	

	private String order;
	private int begin;
	private int end;
	private Class<?> clazz;
	private String group;
	private List<String> params;
	private String result;
	private String[] views;
	
	private String otherHql="";
	
	public Hql(){
		params = new ArrayList<String>();
	}

	/**
	 * �?param 默认排序
	 * @param param 用于排序的属�?
	 */
	public Hql setOrder(String param){
		return setOrder(param, "");
	}
	
	public Hql setGroupBy(String groupBy) {
		group = " GROUP BY o."+groupBy;
		return this;
	}
	/**
	 * 按param by排序
	 * @param param 用于排序的属�?
	 * @param by 升降�?
	 */
	public Hql setOrder(String param,String by){
		order =" ORDER BY o."+param+" "+by; 
		return this;
	}
	
	
	public Hql setBegin(int begin){
		this.begin = begin;
		return this;
	}
	
	public Hql setEnd(int end){
		this.end=end;
		return this;
	}
	
	public void setClass(Class<?> clazz){
		this.clazz = clazz;
	}
	
	public Hql add(String key,Object value){
		return add(key, value,null);
	}
	public Hql add(String key,Object value,String operator){
		operator = Inspector.isEmpty(operator)?"=":operator;
		if(operator.equals("like")){
			add(key + " " + operator + " '%" + value + "%'");
		}
		else{
			add(key + operator + "'" + value + "'");
		}
		return this;
	}
	
	public void add(String string) {
		if(!params.contains(string)){
			params.add(string);
		}
	}

	
	public Hql useCount(){
		result = " COUNT(o) ";
		return this;
	}
	
	public Hql useSearch(){
		result =" o ";
		return this;
	}
	
	public Hql useSum(String column){
		result =" SUM(o."+column+") ";
		return this;
	}
	
	
	public Hql useCustom(String type,String column){
		result =" "+type+"(o."+column+") ";
		return this;
	}
	
	public String getStatement(){
		result = Inspector.isEmpty(result)?" o ":result;
		String hql = "SELECT "+result+"FROM "+clazz.getSimpleName()+" o"+build();
		return hql;
	}
	

	public String[] getViews() {
		return views;
	}

	public void setViews(String[] views) {
		if(views!=null && views.length>0){
			boolean isFirst = true;
			StringBuilder sb = new StringBuilder();
			for(String s:views){
				if(!StringUtils.containsWhitespace(s)){
					if(isFirst){
						isFirst = false;
					}
					else{
						sb.append(",");
					}
					sb.append("o."+s);
				}else{
					throw new IllegalArgumentException("属性不能存在空格！");
				}
			}
			result = " "+sb.toString()+" ";
			this.views = views;
		}
	}

	private String build(){
		loadWhere();
		StringBuilder sb = new StringBuilder();
		
		sb.append(" WHERE 1=1 ");
		
		for(String s:params){
			sb.append(" AND ");
			sb.append("o.").append(s);
		}
		
		if(otherHql!=null){
			sb.append(otherHql);
		}
		
		
		if(group!=null){
			sb.append(group);
		}
		if(order!=null){
			sb.append(order);
		}
		return sb.toString();
	}
	public int getBegin() {
		return begin;
	}
	public int getEnd() {
		return end;
	}
	
	protected void loadWhere() {
		
	}

	@Override
	public String forCount() {
		
		return this.useCount().getStatement();
	}

	@Override
	public String forSearch() {
		
		return this.useSearch().getStatement();
	}

	@Override
	public String forCustom() {
		return this.getStatement();
	}

	public String getOtherHql() {
		return otherHql;
	}

	public void setOtherHql(String otherHql) {
		this.otherHql += otherHql;
	}
	
}
