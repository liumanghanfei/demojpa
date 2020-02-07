package com.example.demojap.server.base;

import java.util.List;

import com.example.demojap.utils.sql.Grammar;


/**
 *同意service 层 方法
 * @param <T> 实体类型
 */
public interface GenericService<T> {
	
	T create(T entity);

	void delete(Object id);

	T find(Object id);
	
	void refresh(T id);
	
	T update(T entity);
	

	T find(Grammar grammar);
	
	long count(Grammar grammar);
	
	List<T> search(Grammar grammar);

	long count(String hql);
	
	List<T> search(String hql,int begin,int end);
	

	long countByNative(String sql);
	
	List<T> searchByNative(String sql,int begin,int end);
	
	void executeUpdate(String jpaql);
}
