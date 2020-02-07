package com.example.demojap.dao.base;

import com.example.demojap.utils.jpa.JpaClousure;
import com.example.demojap.utils.page.Page;
import com.example.demojap.utils.page.PageDto;

import java.math.BigDecimal;
import java.util.Map;

import javax.persistence.EntityManager;



/**
 * 通用 dao 层 方法
 */
public interface GenericDao<T> extends VoidDao<T>, EntityDao<T>, ListDao<T>,
	LongDao<T>, ObjectDao<T> {

    /**
     * 获得JPA实体管理器（不建议使用，因为数据库的实现可能不是JPA，比如
     * @return JPA实体管理器
     */
    EntityManager getEntityManager();

    /**
     * 分页查询
     * 
     * @param page
     * @param map
     *            属性名-值对
     * @return
     */
    public PageDto<T> findByPage(Page page, Map<String, Object> map);

    /**
     * 分页查询
     * @param page
     * @return
     */
    PageDto<T> findByPage(Page page);
    
    /**
     * 闭包查询
     * @param page 分页条件
     * @param clousure 闭包
     * @return
     */
    PageDto<T> findByPage(Page page, JpaClousure<T> clousure);
    /**
     * 通过原始SQL获取int
     * @param sql
     * @return
     */
    int getIntByNativeSQL(String sql);

    /***
     * 通过原始ＳＱＬ获取BigDecimal
     * @param sql
     * @return
     */
	BigDecimal getBigDecimalByNativeSQL(String sql);

	void clear();
	
	
	
    /**
     * 分页查询
     * 
     * @param page
     * @param restrictions
     *            限制条件
     * @return
     */
    //public PageDto<T> findByPage(Page page, Predicate... restrictions);
    /**
     * 闭包查询
     * @param page 分页条件
     * @param clousure 闭包
     * @return
     */
    //PageDto<T> findByPage(Page page, JpaClousure<T> clousure);
}