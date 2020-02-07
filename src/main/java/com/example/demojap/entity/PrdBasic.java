package com.example.demojap.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * PrdBasic
 *
 * @author yangy
 * @date 2020-02-07
 */
@Entity
@Table(name = "prd_basic", schema = "coffeewx_admin", catalog = "")
public class PrdBasic {
    private int productid;
    private String productcode;
    private String productname;
    private String producttitle;
    private String premium;
    private String premratetable;
    private String classifyid;
    private String categoryid;
    private String brandid;
    private String area;
    private String sort;
    private String recommend;
    private String hotsell;
    private String upshelf;
    private Timestamp createTime;
    private Timestamp updateTime;
    private String insertby;
    private String updateBy;

    @Id
    @Column(name = "productid")
    public int getProductid() {
        return productid;
    }

    public void setProductid(int productid) {
        this.productid = productid;
    }

    @Basic
    @Column(name = "productcode")
    public String getProductcode() {
        return productcode;
    }

    public void setProductcode(String productcode) {
        this.productcode = productcode;
    }

    @Basic
    @Column(name = "productname")
    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }

    @Basic
    @Column(name = "producttitle")
    public String getProducttitle() {
        return producttitle;
    }

    public void setProducttitle(String producttitle) {
        this.producttitle = producttitle;
    }

    @Basic
    @Column(name = "premium")
    public String getPremium() {
        return premium;
    }

    public void setPremium(String premium) {
        this.premium = premium;
    }

    @Basic
    @Column(name = "premratetable")
    public String getPremratetable() {
        return premratetable;
    }

    public void setPremratetable(String premratetable) {
        this.premratetable = premratetable;
    }

    @Basic
    @Column(name = "classifyid")
    public String getClassifyid() {
        return classifyid;
    }

    public void setClassifyid(String classifyid) {
        this.classifyid = classifyid;
    }

    @Basic
    @Column(name = "categoryid")
    public String getCategoryid() {
        return categoryid;
    }

    public void setCategoryid(String categoryid) {
        this.categoryid = categoryid;
    }

    @Basic
    @Column(name = "brandid")
    public String getBrandid() {
        return brandid;
    }

    public void setBrandid(String brandid) {
        this.brandid = brandid;
    }

    @Basic
    @Column(name = "area")
    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    @Basic
    @Column(name = "sort")
    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    @Basic
    @Column(name = "recommend")
    public String getRecommend() {
        return recommend;
    }

    public void setRecommend(String recommend) {
        this.recommend = recommend;
    }

    @Basic
    @Column(name = "hotsell")
    public String getHotsell() {
        return hotsell;
    }

    public void setHotsell(String hotsell) {
        this.hotsell = hotsell;
    }

    @Basic
    @Column(name = "upshelf")
    public String getUpshelf() {
        return upshelf;
    }

    public void setUpshelf(String upshelf) {
        this.upshelf = upshelf;
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
    public String getInsertby() {
        return insertby;
    }

    public void setInsertby(String insertby) {
        this.insertby = insertby;
    }

    @Basic
    @Column(name = "updateBy")
    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PrdBasic prdBasic = (PrdBasic) o;
        return productid == prdBasic.productid &&
                Objects.equals(productcode, prdBasic.productcode) &&
                Objects.equals(productname, prdBasic.productname) &&
                Objects.equals(producttitle, prdBasic.producttitle) &&
                Objects.equals(premium, prdBasic.premium) &&
                Objects.equals(premratetable, prdBasic.premratetable) &&
                Objects.equals(classifyid, prdBasic.classifyid) &&
                Objects.equals(categoryid, prdBasic.categoryid) &&
                Objects.equals(brandid, prdBasic.brandid) &&
                Objects.equals(area, prdBasic.area) &&
                Objects.equals(sort, prdBasic.sort) &&
                Objects.equals(recommend, prdBasic.recommend) &&
                Objects.equals(hotsell, prdBasic.hotsell) &&
                Objects.equals(upshelf, prdBasic.upshelf) &&
                Objects.equals(createTime, prdBasic.createTime) &&
                Objects.equals(updateTime, prdBasic.updateTime) &&
                Objects.equals(insertby, prdBasic.insertby) &&
                Objects.equals(updateBy, prdBasic.updateBy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productid, productcode, productname, producttitle, premium, premratetable, classifyid, categoryid, brandid, area, sort, recommend, hotsell, upshelf, createTime, updateTime, insertby, updateBy);
    }
}
