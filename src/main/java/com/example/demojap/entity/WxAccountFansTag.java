package com.example.demojap.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * WxAccountFansTag
 *
 * @author yangy
 * @date 2020-02-07
 */
@Entity
@Table(name = "t_wx_account_fans_tag", schema = "coffeewx_admin", catalog = "")
public class WxAccountFansTag {
    private int id;
    private String openid;
    private String tagId;
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
    @Column(name = "openid")
    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    @Basic
    @Column(name = "tag_id")
    public String getTagId() {
        return tagId;
    }

    public void setTagId(String tagId) {
        this.tagId = tagId;
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
        WxAccountFansTag that = (WxAccountFansTag) o;
        return id == that.id &&
                Objects.equals(openid, that.openid) &&
                Objects.equals(tagId, that.tagId) &&
                Objects.equals(wxAccountId, that.wxAccountId) &&
                Objects.equals(createTime, that.createTime) &&
                Objects.equals(updateTime, that.updateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, openid, tagId, wxAccountId, createTime, updateTime);
    }
}
