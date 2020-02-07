package com.example.demojap.dao.base;

import com.example.demojap.utils.sql.Grammar;

public interface ObjectDao<T> {
    /**
     * 调用Grammar类的forSearch方法（一条JPAQL语句），查询出一个对象（可能是Long，也可能是Object[]）
     * 不建议使用此方法
     * @param grammar 语法对象
     * @return 未知的返回值
     */
    Object genericHql(Grammar grammar);
    
    Object genericHql(String hql);
    
    /**
     * 使用SQL查询出一个未知的对象（不建议使用）
     * @param conditions
     * @return
     */
    Object genericNativeSql(String conditions);
}
