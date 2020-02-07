package com.example.demojap.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * ArticleClassify
 *
 * @author yangy
 * @date 2020-02-07
 */
@Entity
@Table(name = "article_classify", schema = "coffeewx_admin", catalog = "")
public class ArticleClassify {
    private int articleclassifyid;
    private String articleclassify;
    private String articlenumber;
    private Timestamp createTime;
    private Timestamp updateTime;

    @Id
    @Column(name = "articleclassifyid")
    public int getArticleclassifyid() {
        return articleclassifyid;
    }

    public void setArticleclassifyid(int articleclassifyid) {
        this.articleclassifyid = articleclassifyid;
    }

    @Basic
    @Column(name = "articleclassify")
    public String getArticleclassify() {
        return articleclassify;
    }

    public void setArticleclassify(String articleclassify) {
        this.articleclassify = articleclassify;
    }

    @Basic
    @Column(name = "articlenumber")
    public String getArticlenumber() {
        return articlenumber;
    }

    public void setArticlenumber(String articlenumber) {
        this.articlenumber = articlenumber;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ArticleClassify that = (ArticleClassify) o;
        return articleclassifyid == that.articleclassifyid &&
                Objects.equals(articleclassify, that.articleclassify) &&
                Objects.equals(articlenumber, that.articlenumber) &&
                Objects.equals(createTime, that.createTime) &&
                Objects.equals(updateTime, that.updateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(articleclassifyid, articleclassify, articlenumber, createTime, updateTime);
    }
}
