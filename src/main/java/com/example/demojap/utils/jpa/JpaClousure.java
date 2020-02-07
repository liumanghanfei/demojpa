package com.example.demojap.utils.jpa;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

/**
 * 
 * JPA闭包
 *
 */
public interface JpaClousure<T> {
    /**
     * 闭包逻辑
     * @param cb
     * @param root
     * @param cq
     * @return
     */
    Predicate[] doLogic(CriteriaBuilder cb, Root<T> root, CriteriaQuery<?> cq);
}
