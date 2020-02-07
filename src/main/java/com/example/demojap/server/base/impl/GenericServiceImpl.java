package com.example.demojap.server.base.impl;

import java.util.List;

import com.example.demojap.dao.base.GenericDao;
import com.example.demojap.server.base.GenericService;
import com.example.demojap.utils.sql.Grammar;
import org.springframework.transaction.annotation.Transactional;


/**
 * 
 *同意service 层 方法实现
 * @param <T> 实体类型
 */
public abstract class GenericServiceImpl<T> implements GenericService<T> {


	

	@Override
	@Transactional
	public T create(T entity) {
		return this.getGenericDao().create(entity);
	}


	@Transactional
	@Override
	public void delete(Object id) {
		this.getGenericDao().delete(id);
	}


	@Override
	public T find(Object id) {
		
		return this.getGenericDao().find(id);
	}

	@Override
	public void refresh(T id) {
		this.getGenericDao().refresh(id);
		
	}

	@Transactional
	@Override
	public T update(T entity) {
		
		return this.getGenericDao().update(entity);
	}


	@Override
	public T find(Grammar grammar) {
		
		return this.getGenericDao().find(grammar);
	}


	@Override
	public long count(Grammar grammar) {
	
		return this.getGenericDao().count(grammar);
	}


	@Override
	public List<T> search(Grammar grammar) {
		
		return this.getGenericDao().search(grammar);
	}


	@Override
	public long count(String hql) {
		return this.getGenericDao().count(new StringBuilder(hql));
	}


	@Override
	public List<T> search(String hql, int begin, int end) {
		
		return this.getGenericDao().search(new StringBuilder(hql), begin, end);
	}


	@Override
	public long countByNative(String sql) {
		
		return this.getGenericDao().countByNativeSql(sql);
	}


	@Override
	public List<T> searchByNative(String sql, int begin, int end) {
		return this.getGenericDao().searchByNativeSql(sql, begin, end);
	}


	@Override
	public void executeUpdate(String jpaql) {
		this.getGenericDao().getEntityManager().createQuery(jpaql).executeUpdate();
	}


	protected abstract GenericDao<T> getGenericDao();
	
}
