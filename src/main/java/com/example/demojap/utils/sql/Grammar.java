package com.example.demojap.utils.sql;

/**
 */
public interface Grammar {

    /**
     * 查询的 class
     * 
     * @param type
     */
    void setClass(Class<?> type);

    /**
     * 添加显示列
     */
    void setViews(String[] views);
    
    /**
     * 获得显示列
     */
    String[] getViews();
    
    /**
     * 查询count
     * 
     * @return JPAQL语句
     */
    String forCount();

    /**
     * 查询list
     * 
     * @return JPAQL语句
     */
    String forSearch();

    /**
     * 定制查询
     * 
     * @return JPAQL语句
     */
    String forCustom();

    /**
     * 获得开始
     * 
     * @return 开始记录数
     */
    int getBegin();

    /**
     * 获得结束
     * 
     * @return 结束记录数
     */
    int getEnd();
}
