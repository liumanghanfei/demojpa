package com.example.demojap.utils.sql;

import com.example.demojap.utils.common.Inspector;

public class SearchHql extends Hql {

	public Hql addOr(String key1,String key2,Object value,String operator){
		operator = Inspector.isEmpty(operator)?"=":operator;
		if(operator.equals("like")){			
			this.setOtherHql(" and (o."+key1+" "+operator+" '%"+value+"%' or o."+key2+" "+operator+" '%"+value+"%') ");
		}else{
			this.setOtherHql(" and (o."+key1+"='"+value+"' or o."+key2+"='"+value+"')");
		}
		return this;
	}
	public Hql addOr(String key1,String key2,String key3,Object value,String operator){
		operator = Inspector.isEmpty(operator)?"=":operator;
		if(operator.equals("like")){
			add(key1+" "+operator+" '%"+value+"%' or "+key2+" "+operator+" '%"+value+"%' or "+key3+" "+operator+" '%"+value+"%'");
		}else{
		add(key1+operator+"'"+value+"' or "+key2+operator+"'"+value+"' or "+key3+operator+"'"+value+"'");
		}
		return this;
	}
}
