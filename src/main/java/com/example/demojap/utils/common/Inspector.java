package com.example.demojap.utils.common;

import org.springframework.util.StringUtils;

import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 */
public class Inspector {
    /**
     * 检验是否为空字符
     * 
     * @param str
     * @return
     */
    public static boolean isEmpty(String str) {
	if (str == null) {
	    return true;
	} else if (str.length() < 1) {
	    return true;
	} else {
	    return str.trim().length() < 1;
	}
    }

    /**
     * 是否 为空数组
     * 
     * @param
     * @return
     */
    public static boolean isEmptyArray(Object obj) {
	if (obj == null) {
	    return true;
	}
	if (Array.getLength(obj) < 1) {
	    return true;
	}
	return false;
    }

    /**
     * 是否为空集合
     * 
     * @param
     * @return
     */
    public static boolean isEmptyCollection(Collection<?> collection) {
	if (collection == null || collection.size() < 1) {
	    return true;
	}
	return false;
    }

    /**
     * 是否 是email 地址 使用了此正则表达�?^[0-9a-zA-Z\_\.]+@(([0-9a-zA-Z]+)[.])+[a-z]{2,4}$
     * 
     * @param str
     * @return
     */
    public static boolean isEmailAddress(String str) {
    	return matcher(str, "^[0-9a-zA-Z\\_\\.]+@(([0-9a-zA-Z]+)[.])+[a-z]{2,4}$");
    }
    /**
     * 验证是否是手机号  使用了此正则表达 ： ^[1][3,4,5,7,8][0-9]{9}$
     * @param str
     * @return
     */
    public static boolean isMobile(String str) {
    	return matcher(str, "^[1][3,4,5,7,8][0-9]{9}$");
    }
    
    /**
     * 正则匹配
     * @param String -- 要验证的文字
     * @param test --- 正则表达式
     * @return
     */
    public static boolean matcher(String String, String test){
    	if (isEmpty(String)) {
    	    return false;
    	}
    	Pattern pattern = Pattern.compile(test);
    		Matcher matcher = pattern.matcher(String);
    		return matcher.matches();
    }

    /**
     * 归避 html标签
     * 
     * @param string
     * @return
     */
    public static String escapeHtml(String string) {
	if (isEmpty(string))
	    return string;
	string = StringUtils.replace(string, "<", "&lt;");
	return StringUtils.replace(string, ">", "&gt;");
    }

    /**
     * 归避 javascript 脚本标签
     * 
     * @param string
     * @return
     */
    public static String escapeScript(String string) {
	if (isEmpty(string))
	    return string;
	return StringUtils.replace(string, "<script", "&lt;script");
    }

    /**
     * 将byte[] 打印成 十六进制 字符串
     * 
     * @param source
     * @param capital
     * @return
     */
    public static String toHexString(byte[] bytes, String decollator) {
	if (bytes == null || bytes.length < 1) {
	    return "";
	}
	StringBuilder sb = new StringBuilder();
	boolean first = true;
	for (int i = 0; i < bytes.length; i++) {
	    if (first) {
		first = false;
	    } else {
		sb.append(decollator);
	    }
	    int a = bytes[i] & 0xff;
	    String str = Integer.toHexString(a);
	    if (str.length() > 1) {
		sb.append(str);
	    } else {
		sb.append("0" + str);
	    }
	}
	return sb.toString();
    }

    /**
     * 字符用unicode 显示
     * 
     * @param str
     * @return
     */
    public static String toUnicode(String str) {
	StringBuilder sb = new StringBuilder();
	for (int i = 0; i < str.length(); i++) {
	    sb.append("\\u" + Integer.toHexString(str.charAt(i)));
	}
	return sb.toString();
    }

    /**
     * 判断该字符是否为中文字符
     * 
     * @param c
     * @return
     */
    public static boolean isChineseCharacter(char c) {
	int i = (int) c;
	return (i >= 0x4e00 && i <= 0x9fa5);
    }

    /**
     * 从一个list中获取重复的元素 比如下面这个list里存了五个String:<br/>
     * "1", "2", "1", "3", "4" 返回结果就是两个"1"组成的List
     * 
     * @param list
     *            数组列表
     * 
     * @return 数组列表中重复的对象
     */
    public static <T> List<T> getRepeat(List<T> list) {
	if (list == null || list.size() < 1) {
	    return null;
	}
	boolean[] boolArr = new boolean[list.size()];
	for (int i = 0; i < list.size() - 1; i++) {

	    for (int j = i + 1; j < list.size(); j++) {

		if (list.get(i).equals(list.get(j))) {
		    boolArr[i] = true;
		    boolArr[j] = true;
		}
	    }
	}

	List<T> result = new ArrayList<T>();
	for (int i = 0; i < list.size(); i++) {
	    if (boolArr[i]) {
		result.add(list.get(i));
	    }
	}

	return result;
    }
    
    
    public static String isEmptyZero(Object str){
    	if(str==null || "".equals(str)){
    		return "0";
    	}
    	return str.toString();
    }
    
    public static String isThenZero(Object str){
    	BigDecimal temp = new BigDecimal(isEmptyZero(str));
    	if(temp.compareTo(new BigDecimal(0)) < 0){
    		return "0";
    	}
    	return str.toString();
    }
    
    public static void main(String[] args){
    	String s = Inspector.isThenZero(0);
    	System.out.println(s);
    }
    
}
