package com.example.demojap.dao.base;

import com.example.demojap.utils.sql.Grammar;
import org.springframework.core.convert.converter.Converter;


/**
 * 返回值为实体的DAO
 * @param <T>
 */
public interface EntityDao<T> {
    /**
     * 创建
     * 
     * @param entity
     *            实体对象，id必须为0，以适应平台的主键策略
     * @return
     */
    T create(T entity);
    /**
     * 使用闭包转化器来保存实体
     * @param obj form对象
     * @param convertor 转换器
     * @return 保存后的实体
     */
    T create(Object obj, Converter<Object, T> convertor);
    /**
     * 根据id查询
     * 
     * @param id
     *            主键
     * @return
     */
    T find(Object id);


    /**
     * 修改实体，如果是从页面接收的对象（比如拿实体类作为FORM对象，QUERY对象或者REQUEST对象），<br/>
     * 必须提交版本字段，否则更新必定失败,具体原因参照JPA乐观锁
     * 
     * @param entity
     *            实体
     * @return
     */
    T update(T entity);

    /**
     * 根据条件查询唯一实体
     * 
     * @param grammar
     *            JPAQL语法对象
     * @return
     */
    T find(Grammar grammar);
}
