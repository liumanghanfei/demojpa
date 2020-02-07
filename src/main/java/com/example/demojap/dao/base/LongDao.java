package com.example.demojap.dao.base;

import java.util.Map;

import javax.persistence.criteria.Predicate;

import com.example.demojap.utils.jpa.JpaClousure;
import com.example.demojap.utils.sql.Grammar;


public interface LongDao<T> {
    /**
     * 根据条件统计数量
     * 
     * @param grammar
     *            JPAQL语法对象
     * @return
     */
    long count(Grammar grammar);

    /**
     * 使用拼接JPAQL的方式进行统计查询，统计记录数量
     * 
     * @param params
     *            参数列表
     * @return 符合条件的记录数量
     */
    long count(Map<String, Object> params);

    /**
     * 使用JPAQL进行查询，统计记录数量
     * 
     * @param queryString
     *            JPAQL查询语句
     * @return 符合条件的记录数量
     */
    long count(StringBuilder queryString);

    /**
     * 使用本地化的查询语句（SQL）统计记录数量,查询参数用法，如 select count(*) from CMS_NEWS cn where
     * cn.CREATED_BY = '1';
     * 
     * @param conditions
     *            使用本地化SQL进行查询（不建议使用），
     * 
     * @return 使用本地化查询语句统计的记录数量
     */
    public long countByNativeSql(String conditions);

    /**
     * 根据约束条件进行查询
     * 
     * @param restrictions
     *            约束条件
     * @return 统计的数量
     */
    public long count(Predicate... restrictions);
    /**
     * 闭包统计
     * @param clousure
     * @return
     */
    public long count(JpaClousure<T> clousure);
}
