package com.example.demojap.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * ArticleBasic
 *
 * @author yangy
 * @date 2020-02-07
 */
@Entity
@Table(name = "article_basic", schema = "coffeewx_admin", catalog = "")
public class ArticleBasic {
    private int articleid;
    private String title;
    private String article;
    private String articlenumber;
    private String desced;
    private Timestamp createTime;
    private Timestamp updateTime;

    @Id
    @Column(name = "articleid")
    public int getArticleid() {
        return articleid;
    }

    public void setArticleid(int articleid) {
        this.articleid = articleid;
    }

    @Basic
    @Column(name = "title")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Basic
    @Column(name = "article")
    public String getArticle() {
        return article;
    }

    public void setArticle(String article) {
        this.article = article;
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
    @Column(name = "desced")
    public String getDesced() {
        return desced;
    }

    public void setDesced(String desced) {
        this.desced = desced;
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
        ArticleBasic that = (ArticleBasic) o;
        return articleid == that.articleid &&
                Objects.equals(title, that.title) &&
                Objects.equals(article, that.article) &&
                Objects.equals(articlenumber, that.articlenumber) &&
                Objects.equals(desced, that.desced) &&
                Objects.equals(createTime, that.createTime) &&
                Objects.equals(updateTime, that.updateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(articleid, title, article, articlenumber, desced, createTime, updateTime);
    }
}
