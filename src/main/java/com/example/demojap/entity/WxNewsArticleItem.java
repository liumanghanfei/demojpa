package com.example.demojap.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * WxNewsArticleItem
 *
 * @author yangy
 * @date 2020-02-07
 */
@Entity
@Table(name = "t_wx_news_article_item", schema = "coffeewx_admin", catalog = "")
public class WxNewsArticleItem {
    private int id;
    private String title;
    private String digest;
    private String author;
    private String showCoverPic;
    private String thumbMediaId;
    private String content;
    private String contentSourceUrl;
    private Integer orderNo;
    private String picPath;
    private String needOpenComment;
    private String onlyFansCanComment;
    private String newsId;
    private String wxAccountId;
    private Timestamp createTime;
    private Timestamp updateTime;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
    @Column(name = "digest")
    public String getDigest() {
        return digest;
    }

    public void setDigest(String digest) {
        this.digest = digest;
    }

    @Basic
    @Column(name = "author")
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Basic
    @Column(name = "show_cover_pic")
    public String getShowCoverPic() {
        return showCoverPic;
    }

    public void setShowCoverPic(String showCoverPic) {
        this.showCoverPic = showCoverPic;
    }

    @Basic
    @Column(name = "thumb_media_id")
    public String getThumbMediaId() {
        return thumbMediaId;
    }

    public void setThumbMediaId(String thumbMediaId) {
        this.thumbMediaId = thumbMediaId;
    }

    @Basic
    @Column(name = "content")
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Basic
    @Column(name = "content_source_url")
    public String getContentSourceUrl() {
        return contentSourceUrl;
    }

    public void setContentSourceUrl(String contentSourceUrl) {
        this.contentSourceUrl = contentSourceUrl;
    }

    @Basic
    @Column(name = "order_no")
    public Integer getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(Integer orderNo) {
        this.orderNo = orderNo;
    }

    @Basic
    @Column(name = "pic_path")
    public String getPicPath() {
        return picPath;
    }

    public void setPicPath(String picPath) {
        this.picPath = picPath;
    }

    @Basic
    @Column(name = "need_open_comment")
    public String getNeedOpenComment() {
        return needOpenComment;
    }

    public void setNeedOpenComment(String needOpenComment) {
        this.needOpenComment = needOpenComment;
    }

    @Basic
    @Column(name = "only_fans_can_comment")
    public String getOnlyFansCanComment() {
        return onlyFansCanComment;
    }

    public void setOnlyFansCanComment(String onlyFansCanComment) {
        this.onlyFansCanComment = onlyFansCanComment;
    }

    @Basic
    @Column(name = "news_id")
    public String getNewsId() {
        return newsId;
    }

    public void setNewsId(String newsId) {
        this.newsId = newsId;
    }

    @Basic
    @Column(name = "wx_account_id")
    public String getWxAccountId() {
        return wxAccountId;
    }

    public void setWxAccountId(String wxAccountId) {
        this.wxAccountId = wxAccountId;
    }

    @Basic
    @Column(name = "create_time")
    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    @Basic
    @Column(name = "update_time")
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
        WxNewsArticleItem that = (WxNewsArticleItem) o;
        return id == that.id &&
                Objects.equals(title, that.title) &&
                Objects.equals(digest, that.digest) &&
                Objects.equals(author, that.author) &&
                Objects.equals(showCoverPic, that.showCoverPic) &&
                Objects.equals(thumbMediaId, that.thumbMediaId) &&
                Objects.equals(content, that.content) &&
                Objects.equals(contentSourceUrl, that.contentSourceUrl) &&
                Objects.equals(orderNo, that.orderNo) &&
                Objects.equals(picPath, that.picPath) &&
                Objects.equals(needOpenComment, that.needOpenComment) &&
                Objects.equals(onlyFansCanComment, that.onlyFansCanComment) &&
                Objects.equals(newsId, that.newsId) &&
                Objects.equals(wxAccountId, that.wxAccountId) &&
                Objects.equals(createTime, that.createTime) &&
                Objects.equals(updateTime, that.updateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, digest, author, showCoverPic, thumbMediaId, content, contentSourceUrl, orderNo, picPath, needOpenComment, onlyFansCanComment, newsId, wxAccountId, createTime, updateTime);
    }
}
