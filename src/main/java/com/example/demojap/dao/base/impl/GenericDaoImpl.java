package com.example.demojap.dao.base.impl;

/**
 *通用 dao 层 方法实现
 * @param <T> 实体类对象
 */
import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;


import com.example.demojap.dao.base.GenericDao;
import com.example.demojap.utils.common.TextUtils;
import com.example.demojap.utils.jpa.JpaClousure;
import com.example.demojap.utils.jpa.POJOTransfer;
import com.example.demojap.utils.page.Page;
import com.example.demojap.utils.page.PageDto;
import com.example.demojap.utils.sql.Grammar;
import org.springframework.beans.BeanUtils;
import org.springframework.core.convert.converter.Converter;
import org.springframework.util.CollectionUtils;

public abstract class GenericDaoImpl<T> implements GenericDao<T> {

	final org.slf4j.Logger _log = org.slf4j.LoggerFactory.getLogger(getClass());

	@PersistenceContext()
	protected EntityManager em;
	private Class<T> type;

	public void setEntityManager(EntityManager em) {
		this.em = em;
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public GenericDaoImpl() {
		Type t = getClass().getGenericSuperclass();
		ParameterizedType pt = (ParameterizedType) t;
		type = (Class) (pt.getActualTypeArguments()[0]);
	}

	@Override
	public T create(final T entity) {
		this.em.persist(entity);
		return entity;
	}

	@Override
	public T create(Object obj, Converter<Object, T> convertor) {
		T entity = convertor.convert((Object) obj);
		return this.create(entity);
	}

	@Override
	public void delete(final Object id) {
		this.em.remove(this.em.getReference(type, id));
	}

	@Override
	public void flush() {
		this.em.flush();
	}
	
	
	@Override
	public void clear() {
		this.em.clear();
	}

	@Override
	public T find(final Object id) {
		return (T) this.em.find(type, id);
	}

	public void refresh(final T id) {
		this.em.refresh(id);
	}

	@Override
	public T update(final T entity) {
		return this.em.merge(entity);
	}

	@Override
	public List<T> search(final Map<String, Object> params, int pageStart, int pageSize) {
		final StringBuilder queryString = new StringBuilder("SELECT o FROM ");
		queryString.append(type.getSimpleName()).append(" o ");

		this.buildQueryClauses(params, queryString);
		return this.search(queryString, pageStart, pageSize);
	}

	@Override
	public long count(final Map<String, Object> params) {
		final StringBuilder queryString = new StringBuilder("SELECT COUNT(o) FROM ");
		queryString.append(type.getSimpleName()).append(" o ");

		this.buildQueryClauses(params, queryString);

		return this.count(queryString);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public List<T> search(final StringBuilder queryString, int pageStart, int pageSize) {
		final Query query = this.em.createQuery(queryString.toString());
		this.setPage(query, pageStart, pageSize);
		return (List) query.getResultList();
	}

	@Override
	public long count(StringBuilder queryString) {
		final Query query = this.em.createQuery(queryString.toString());
		return (Long) query.getSingleResult();
	}

	@Override
	public long countByNativeSql(String conditions) {
		StringBuffer newConditions = new StringBuffer();
		newConditions.append("select count(*) from ( ");
		newConditions.append(conditions);
		newConditions.append(") a");
		final Query query = this.em.createNativeQuery(newConditions.toString());
		BigInteger bi = (BigInteger) query.getSingleResult();
		return bi.longValue();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<T> searchByNativeSql(String conditions, int pageStart, int pageSize) {
		Query query = this.em.createNativeQuery(conditions, type);
		this.setPage(query, pageStart, pageSize);
		return query.getResultList();
	}

	public void buildQueryClauses(final Map<String, Object> params, StringBuilder queryString) {
		boolean needWhereClause = true;
		if (params == null) {
			return;
		}
		for (String key : params.keySet()) {
			if (needWhereClause) {
				queryString.append(" WHERE o.").append(key).append("='").append(params.get(key)).append("' ");
				needWhereClause = false;
			} else {
				queryString.append(" AND o.").append(key).append("='").append(params.get(key)).append("' ");
			}
		}

	}

	@Override
	public EntityManager getEntityManager() {
		return em;
	}

	@Override
	public Object genericNativeSql(String conditions) {
		Query query = this.em.createNativeQuery(conditions);
		Object obj = null;
		try {
			obj = query.getSingleResult();
		} catch (NoResultException e) {
			return null;
		}
		return obj;
	}

	@Override
	public Object genericHql(Grammar grammar) {
		grammar.setClass(type);
		Query query = this.em.createQuery(grammar.forCustom());
		Object obj = null;
		try {
			obj = query.getSingleResult();
		} catch (NoResultException e) {
			return null;
		}
		return obj;
	}

	public Class<T> getType() {
		return type;
	}

	@SuppressWarnings("unchecked")
	@Override
	public T find(Grammar grammar) {
		grammar.setClass(type);
		Query query = this.em.createQuery(grammar.forSearch());
		Object obj = null;
		try {
			obj = query.getSingleResult();
		} catch (NoResultException e) {
			return null;
		}
		return (T) obj;
	}

	@Override
	public long count(Grammar grammar) {
		grammar.setClass(type);
		Query query = this.em.createQuery(grammar.forCount());
		Long l = 0L;
		try {
			l = (Long) query.getSingleResult();
		} catch (NoResultException e) {
			return 0;
		}
		return l;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<T> search(Grammar grammar) {

		grammar.setClass(type);
		Query query = this.em.createQuery(grammar.forSearch());
		setPage(query, grammar.getBegin(), grammar.getEnd());
		return (List<T>) query.getResultList();
	}

	@Override
	public List<T> findListByPage(int firstRow, int maxRow, Map<String, Object> modelMap) {
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<T> cq = cb.createQuery(type);
		Root<T> root = cq.from(type);
		if (!CollectionUtils.isEmpty(modelMap)) {
			Predicate[] predicates = new Predicate[modelMap.size()];
			int i = 0;
			for (Entry<String, Object> entry : modelMap.entrySet()) {
				predicates[i++] = cb.equal(root.get(entry.getKey()), entry.getValue());
			}
			cq.where(predicates);
		}
		TypedQuery<T> tq = em.createQuery(cq);
		this.setPage(tq, firstRow, maxRow);
		return tq.getResultList();
	}


	@Override
	public long count(Predicate... restrictions) {
		CriteriaBuilder cb = getEntityManager().getCriteriaBuilder();
		CriteriaQuery<Long> cq = cb.createQuery(Long.class);
		cq.select(cb.countDistinct(cq.from(type))).where(restrictions);
		TypedQuery<Long> tq = getEntityManager().createQuery(cq);
		return tq.getSingleResult();
	}

	public List<T> findListByPage(Page page, Predicate... restrictions) {
		CriteriaBuilder cb = getEntityManager().getCriteriaBuilder();
		CriteriaQuery<T> cq = cb.createQuery(type).where(restrictions);
		cq.from(type);
		return getEntityManager().createQuery(cq).setFirstResult(page.getFirstRow()).setMaxResults(page.getPageSize()).getResultList();
	}

	@Override
	public PageDto<T> findByPage(Page page) {
		// find count
		long count = count();
		// find list
		List<T> list = findListByPage(page);
		page.setRowCount((int) count);
		return new PageDto<T>(list, page);
	}

	@Override
	public long count(JpaClousure<T> clousure) {
		CriteriaBuilder cb = getEntityManager().getCriteriaBuilder();
		CriteriaQuery<Long> cq = cb.createQuery(Long.class);
		Root<T> root = cq.from(type);
		cq.select(cb.countDistinct(root));
		Predicate[] ps = clousure.doLogic(cb, root, cq);
		cq.where(ps);
		TypedQuery<Long> tq = getEntityManager().createQuery(cq);
		return tq.getSingleResult();
	}

	@Override
	public List<T> search(JpaClousure<T> clousure, int rowBegin, int size) {
		CriteriaBuilder cb = getEntityManager().getCriteriaBuilder();
		CriteriaQuery<T> cq = cb.createQuery(type);
		Root<T> root = cq.from(type);
		Predicate[] ps = clousure.doLogic(cb, root, cq);
		cq.where(ps);
		TypedQuery<T> tq = getEntityManager().createQuery(cq);
		this.setPage(tq, rowBegin, size);
		return tq.getResultList();
	}

	@Override
	public List<T> search(JpaClousure<T> clousure) {
		CriteriaBuilder cb = getEntityManager().getCriteriaBuilder();
		CriteriaQuery<T> cq = cb.createQuery(type);
		Root<T> root = cq.from(type);
		clousure.doLogic(cb, root, cq);
		TypedQuery<T> tq = getEntityManager().createQuery(cq);
		return tq.getResultList();
	}

	@Override
	public PageDto<T> findByPage(Page page, Map<String, Object> map) {
		// find count
		long count = count(map);
		// find list
		List<T> list = findListByPage(page, map);
		page.setRowCount((int) count);
		return new PageDto<T>(list, page);
	}


	protected CriteriaQuery<T> createCriteriaQuery() {
		CriteriaBuilder criteriaBuilder = em.getCriteriaBuilder();
		return criteriaBuilder.createQuery(type);
	}

	/**
	 * 设置查询页数
	 * 
	 * @param query
	 *            查询实体
	 * @param rowStart
	 *            查询开始行数
	 * @param pageSize
	 *            查询结果数量
	 */
	protected void setPage(final Query query, final int rowStart, final int pageSize) {
		if (rowStart >= 0) {
			query.setFirstResult(rowStart);
		}
		if (pageSize > 0) {
			query.setMaxResults(pageSize);
		}
	}

	protected CriteriaQuery<T> getCriteriaQuery() {
		CriteriaBuilder cb = getEntityManager().getCriteriaBuilder();
		CriteriaQuery<T> cq = cb.createQuery(type);
		return cq;
	}

	private List<T> findListByPage(Page page, Map<String, Object> modelMap) {
		CriteriaBuilder cb = getEntityManager().getCriteriaBuilder();
		CriteriaQuery<T> cq = cb.createQuery(type);
		Root<T> root = cq.from(type);
		if (!CollectionUtils.isEmpty(modelMap)) {
			for (Entry<String, Object> entry : modelMap.entrySet()) {
				cq.where(cb.equal(root.get(entry.getKey()), entry.getValue()));
			}
		}
		TypedQuery<T> tq = getEntityManager().createQuery(cq);
		this.setPage(tq, page.getFirstRow(), page.getPageSize());
		return tq.getResultList();
	}

	@Override
	public PageDto<T> findByPage(Page page, JpaClousure<T> clousure) {
		// find count
		long count = count(clousure);
		// find list
		List<T> list = search(clousure, page.getRowBegin(), page.getPageSize());
		page.setRowCount((int) count);
		return new PageDto<T>(list, page);
	}

	@Override
	public List<T> searchByConstructorForLimit(String jpql, int start, int size) {
		String select = "SELECT";
		String from = "FROM";
		int selectIndex = TextUtils.indexOfWithIgnoreCase(jpql, select);
		int fromIndex = TextUtils.indexOfWithIgnoreCase(jpql, from);
		if (selectIndex >= 0 && fromIndex > selectIndex) {
			String temp = jpql.substring(selectIndex + select.length(), fromIndex);
			temp = temp.trim();
			temp = " new " + type.getSimpleName() + "(" + temp + ") ";
			jpql = select + temp + jpql.substring(fromIndex);
			TypedQuery<T> tq = this.em.createQuery(jpql, type);
			this.setPage(tq, start, size);
			return tq.getResultList();
		} else {
			throw new IllegalArgumentException("不合法的 jpql 语句！！！");
		}
	}

	@Override
	@SuppressWarnings("unchecked")
	public <E> List<E> searchForLimit(String jpql, int start, int size, POJOTransfer transfer) {
		Query q = this.em.createQuery(jpql);
		this.setPage(q, start, size);
		List<Object> list = q.getResultList();
		List<E> result = new ArrayList<E>();
		for (Iterator<Object> it = list.iterator(); it.hasNext();) {
			Object temp = it.next();
			Object[] buf = null;
			if (temp.getClass().isArray()) {
				buf = (Object[]) temp;
			} else {
				buf = new Object[] { temp };
			}
			result.add((E) (transfer.convert(buf)));
		}
		return result;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<T> searchForLimit(Grammar grammar) {
		grammar.setClass(type);
		Query q = this.em.createQuery(grammar.forCustom());
		this.setPage(q, grammar.getBegin(), grammar.getEnd());
		List<Object> list = q.getResultList();
		List<T> result = new ArrayList<T>();
		for (Iterator<Object> it = list.iterator(); it.hasNext();) {
			Object temp = it.next();
			Object[] buf = null;
			if (temp.getClass().isArray()) {
				buf = (Object[]) temp;
			} else {
				buf = new Object[] { temp };
			}
			result.add((T) injectToEntity(grammar.getViews(), buf));
		}
		return result;
	}

	private Object injectToEntity(String[] labels, Object[] buf) {
		try {
			Object entity = type.newInstance();
			for (int i = 0; i < labels.length; i++) {
				String temp = labels[i];
				injectToEntity(temp, entity, buf[i]);
			}
			return entity;
		} catch (Exception e) {
			throw new IllegalArgumentException("注入失败:" + e.getMessage());
		}

	}

	private void injectToEntity(String label, Object current, Object value) throws Exception {
		if (TextUtils.isText(label)) {
			String temp = "";
			boolean hasKid = false;
			if ((hasKid = label.indexOf(".") >= 0)) {
				temp = label.substring(0, label.indexOf("."));
			} else {
				temp = label;
			}
			PropertyDescriptor pd = BeanUtils.getPropertyDescriptor(current.getClass(), temp);
			Method write = null;
			if (pd != null && (write = pd.getWriteMethod()) != null) {
				Object around = null;
				if (isBasic(pd.getPropertyType())) {
					write.invoke(current, value);
				} else {
					around = findEntity(pd, current);
					write.invoke(current, around);
				}
				if (hasKid) {
					temp = label.substring(label.indexOf(".") + 1, label.length());
					injectToEntity(temp, around, value);
				}
			} else {
				throw new IllegalArgumentException("没有找到" + temp + "属性在：" + current.getClass().getName());
			}
		}
	}

	private Object findEntity(PropertyDescriptor pd, Object current) throws Exception {
		Method read = pd.getReadMethod();
		Object obj = read.invoke(current);
		if (obj == null) {
			obj = pd.getPropertyType().newInstance();
		}
		return obj;
	}

	@Override
	public int getIntByNativeSQL(String sql) {
		Query query = this.em.createNativeQuery(sql);
		Object object = query.getSingleResult();
		if (object == null)
			return 0;
		String result = object.toString();
		return new java.math.BigDecimal(result).intValue();
	}
	
	@Override
	public BigDecimal getBigDecimalByNativeSQL(String sql) {
		Query query = this.em.createNativeQuery(sql);
		Object object = query.getSingleResult();
		if (object == null)
			return BigDecimal.ZERO;
		String result = object.toString();
		return new java.math.BigDecimal(result);
	}

	@Override
	public Object genericHql(String hql) {
		Query query = em.createQuery(hql);
		Object object;
		try {
			object = query.getSingleResult();
		} catch (NoResultException e) {
			return null;
		}
		return object;
	}
	
	
	/**
	 * 是否为 @Basic 所认同的 web 基础类型
	 */
	private static boolean isBasic(Class<?> clazz){
		if(clazz==null)return false;
		if(!clazz.isArray()){
			if(clazz.isPrimitive()||
					Date.class.isAssignableFrom(clazz)||
					clazz.equals(String.class)||
					Number.class.isAssignableFrom(clazz)||
					Character.class.equals(clazz)||
					Boolean.class.equals(clazz)){
				return true;
			}
		}else{
			Class<?> sub = clazz.getComponentType();
			if(Character.class.equals(sub)||
					byte.class.equals(sub)||
					Byte.class.equals(sub)||
					char.class.equals(sub)){
				return true;
			}
		}
		return false;
	}

}