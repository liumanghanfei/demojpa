package com.example.demojap.dao.base;

import java.util.List;
import java.util.Map;

import com.example.demojap.utils.jpa.JpaClousure;
import com.example.demojap.utils.jpa.POJOTransfer;
import com.example.demojap.utils.sql.Grammar;


public interface ListDao<T> {

    /**
     * 查询list
     * 
     * @param grammar
     *            JPAQL语法对象
     * @return 实体的list
     */
    List<T> search(Grammar grammar);
    
    
    /**
     * 部分字段查询，使用构造函数注入部分字段
     * 要求：需要有对应构造函数 ,注入时间 平均 750/50 (每50个需花 750毫秒)
     * demo:select o.id,o.userName from user
     * 应用场景：大数据，超过100个级一次 推荐使用
     * 不支持 集合属性、不支持 复杂属性的多级部分查询
     */
    List<T>	searchByConstructorForLimit(String jpql,int start,int size);
    
    /**
     * 部分字段查询，使用POJOTransfer将值进行转化
     * demo: select o.user.userName,o.title from bid 
     * 应用场景：小数据量 使用，如：分页场景 ,注入时间 平均  687/50 (每50个需花 687毫秒)
     * 不支持  集合属性、支持复杂属性的多级部分查询
     */
    <E> List<E> searchForLimit(String jpql, int start, int size, POJOTransfer transfer);
    
    /**
     * 部分字段查询，将查询出来的字段注入到实体类中
     * demo：grammar.setViews(new String[]{"user.userName","title"});
     * 应用场景：小数据量 使用，如：分页场景,注入时间 平均 750/50 (每50个需花 750毫秒)
     * 不支持 集合属性、支持复杂属性的多级部分查询
     */
    List<T> searchForLimit(Grammar grammar);
    
    /**
     * 使用拼接JPAQL的方式进行查询
     * 
     * @param params
     *            参数列表，最好传入String
     * @param pageStart
     *            开始记录数
     * @param pageSize
     *            最大记录数量
     * @return 符合条件的记录数量
     */
    List<T> search(Map<String, Object> params, int pageStart, int pageSize);

    /**
     * 使用JPAQL进行查询，查询记录列表
     * 
     * @param queryString
     *            JPAQL查询语句
     * @param pageStart
     *            开始记录数
     * @param pageSize
     *            最大记录数
     * @return 记录列表
     */
    List<T> search(StringBuilder queryString, int pageStart, int pageSize);

    /**
     * 本方法使用安全的criteria查询，所以不是拼接HQL的形式， 使用时必须特别注意，必须用对象
     * <ol>
     * <li>插入时间map.put(''date',new Date())，不需要转换成yyyy-MM-dd HH:mm:ss字符串形式</li>
     * <li>级联查询map.put("user",user)，不需要调用user.getId()</li>
     * <li>插入字符串map.put(''userName",userName)，不需要使用单引号包起来</li>
     * </ol>
     * <b>本方法只支持ID排序，自定义排序方法请参考其他方法</b>
     * <strong>本方法默认使用eq（=）进行比较，不支持此其余运算符</strong>
     * 
     * @param firstRow
     *            开始记录数
     * @param maxRow
     *            最大记录数
     * @param map
     *            查询参数
     * @return 返回查询出来的list
     */
    List<T> findListByPage(int firstRow, int maxRow, Map<String, Object> map);
    
    /**
     * 使用本地化的查询语句进行列表查询
     * @param conditions 本地化查询语句(SQL)
     * @param pageStart 开始记录数
     * @param pageSize 最大记录数
     * @return 查询出的结果集（List）
     */
    public List<T> searchByNativeSql(String conditions, int pageStart,
	    int pageSize);
    /**
     * 闭包搜索
     * @param clousure
     * @return
     */
    public List<T> search(JpaClousure<T> clousure);
    /**
     * 闭包分页搜索
     * @param clousure
     * @param rowBegin
     * @param size
     * @return
     */
    public List<T> search(JpaClousure<T> clousure,int rowBegin,int size);
}
