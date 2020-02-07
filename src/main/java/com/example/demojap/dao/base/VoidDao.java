package com.example.demojap.dao.base;

/**
 * 返回值为void的DAO接口
 * @author --
 *
 * @param <T> 实体类
 */
public interface VoidDao<T> {
    /**
     * 删除实体
     * 
     * @param id
     *            主键一般为int和long
     */
    void delete(Object id);
    
    /**
     * 极少使用的方法，不建议使用
     * 
     * @param id
     */
    void refresh(T id);
    
    /**
     * 在一个事务中使用，刷新实体管理器到数据库中，建议在批量添加或删除时使用，以代替JDBC Batch
     */
    void flush();
}
