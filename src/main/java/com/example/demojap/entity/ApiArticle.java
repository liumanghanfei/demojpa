package com.example.demojap.entity;

import javax.persistence.*;
import java.util.Objects;

/**
 * ApiArticle
 *
 * @author yangy
 * @date 2020-02-07
 */
@Entity
@Table(name = "t_api_article", schema = "coffeewx_admin", catalog = "")
public class ApiArticle {
    private int articleid;
    private Integer topicid;
    private String article;

    @Id
    @Column(name = "articleid")
    public int getArticleid() {
        return articleid;
    }

    public void setArticleid(int articleid) {
        this.articleid = articleid;
    }

    @Basic
    @Column(name = "topicid")
    public Integer getTopicid() {
        return topicid;
    }

    public void setTopicid(Integer topicid) {
        this.topicid = topicid;
    }

    @Basic
    @Column(name = "article")
    public String getArticle() {
        return article;
    }

    public void setArticle(String article) {
        this.article = article;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ApiArticle that = (ApiArticle) o;
        return articleid == that.articleid &&
                Objects.equals(topicid, that.topicid) &&
                Objects.equals(article, that.article);
    }

    @Override
    public int hashCode() {
        return Objects.hash(articleid, topicid, article);
    }
}
