package com.example.demojap.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * WxMediaUpload
 *
 * @author yangy
 * @date 2020-02-07
 */
@Entity
@Table(name = "t_wx_media_upload", schema = "coffeewx_admin", catalog = "")
public class WxMediaUpload {
    private int id;
    private String type;
    private String url;
    private String mediaId;
    private String thumbMediaId;
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
    @Column(name = "type")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Basic
    @Column(name = "url")
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Basic
    @Column(name = "media_id")
    public String getMediaId() {
        return mediaId;
    }

    public void setMediaId(String mediaId) {
        this.mediaId = mediaId;
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
        WxMediaUpload that = (WxMediaUpload) o;
        return id == that.id &&
                Objects.equals(type, that.type) &&
                Objects.equals(url, that.url) &&
                Objects.equals(mediaId, that.mediaId) &&
                Objects.equals(thumbMediaId, that.thumbMediaId) &&
                Objects.equals(wxAccountId, that.wxAccountId) &&
                Objects.equals(createTime, that.createTime) &&
                Objects.equals(updateTime, that.updateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, type, url, mediaId, thumbMediaId, wxAccountId, createTime, updateTime);
    }
}
