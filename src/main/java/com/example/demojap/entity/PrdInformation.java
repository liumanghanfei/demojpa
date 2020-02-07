package com.example.demojap.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * PrdInformation
 *
 * @author yangy
 * @date 2020-02-07
 */
@Entity
@Table(name = "prd_information", schema = "coffeewx_admin", catalog = "")
public class PrdInformation {
    private int id;
    private Integer productid;
    private String advantageweb;
    private String advantagemobile;
    private String clause;
    private String notification;
    private String claim;
    private String health;
    private String productpicture;
    private String phoneheadpicture;
    private String commission;
    private Timestamp createTime;
    private Timestamp updateTime;
    private Integer insertby;
    private Integer updateby;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "productid")
    public Integer getProductid() {
        return productid;
    }

    public void setProductid(Integer productid) {
        this.productid = productid;
    }

    @Basic
    @Column(name = "advantageweb")
    public String getAdvantageweb() {
        return advantageweb;
    }

    public void setAdvantageweb(String advantageweb) {
        this.advantageweb = advantageweb;
    }

    @Basic
    @Column(name = "advantagemobile")
    public String getAdvantagemobile() {
        return advantagemobile;
    }

    public void setAdvantagemobile(String advantagemobile) {
        this.advantagemobile = advantagemobile;
    }

    @Basic
    @Column(name = "clause")
    public String getClause() {
        return clause;
    }

    public void setClause(String clause) {
        this.clause = clause;
    }

    @Basic
    @Column(name = "notification")
    public String getNotification() {
        return notification;
    }

    public void setNotification(String notification) {
        this.notification = notification;
    }

    @Basic
    @Column(name = "claim")
    public String getClaim() {
        return claim;
    }

    public void setClaim(String claim) {
        this.claim = claim;
    }

    @Basic
    @Column(name = "health")
    public String getHealth() {
        return health;
    }

    public void setHealth(String health) {
        this.health = health;
    }

    @Basic
    @Column(name = "productpicture")
    public String getProductpicture() {
        return productpicture;
    }

    public void setProductpicture(String productpicture) {
        this.productpicture = productpicture;
    }

    @Basic
    @Column(name = "phoneheadpicture")
    public String getPhoneheadpicture() {
        return phoneheadpicture;
    }

    public void setPhoneheadpicture(String phoneheadpicture) {
        this.phoneheadpicture = phoneheadpicture;
    }

    @Basic
    @Column(name = "commission")
    public String getCommission() {
        return commission;
    }

    public void setCommission(String commission) {
        this.commission = commission;
    }

    @Basic
    @Column(name = "createTime")
    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    @Basic
    @Column(name = "updateTime")
    public Timestamp getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
    }

    @Basic
    @Column(name = "insertby")
    public Integer getInsertby() {
        return insertby;
    }

    public void setInsertby(Integer insertby) {
        this.insertby = insertby;
    }

    @Basic
    @Column(name = "updateby")
    public Integer getUpdateby() {
        return updateby;
    }

    public void setUpdateby(Integer updateby) {
        this.updateby = updateby;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PrdInformation that = (PrdInformation) o;
        return id == that.id &&
                Objects.equals(productid, that.productid) &&
                Objects.equals(advantageweb, that.advantageweb) &&
                Objects.equals(advantagemobile, that.advantagemobile) &&
                Objects.equals(clause, that.clause) &&
                Objects.equals(notification, that.notification) &&
                Objects.equals(claim, that.claim) &&
                Objects.equals(health, that.health) &&
                Objects.equals(productpicture, that.productpicture) &&
                Objects.equals(phoneheadpicture, that.phoneheadpicture) &&
                Objects.equals(commission, that.commission) &&
                Objects.equals(createTime, that.createTime) &&
                Objects.equals(updateTime, that.updateTime) &&
                Objects.equals(insertby, that.insertby) &&
                Objects.equals(updateby, that.updateby);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, productid, advantageweb, advantagemobile, clause, notification, claim, health, productpicture, phoneheadpicture, commission, createTime, updateTime, insertby, updateby);
    }
}
