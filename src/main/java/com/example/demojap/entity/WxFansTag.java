package com.example.demojap.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * WxFansTag
 *
 * @author yangy
 * @date 2020-02-07
 */
@Entity
@Table(name = "t_wx_fans_tag", schema = "coffeewx_admin", catalog = "")
public class WxFansTag {
    private int id;
    private String name;
    private Integer count;
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
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "count")
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
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
        WxFansTag wxFansTag = (WxFansTag) o;
        return id == wxFansTag.id &&
                Objects.equals(name, wxFansTag.name) &&
                Objects.equals(count, wxFansTag.count) &&
                Objects.equals(wxAccountId, wxFansTag.wxAccountId) &&
                Objects.equals(createTime, wxFansTag.createTime) &&
                Objects.equals(updateTime, wxFansTag.updateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, count, wxAccountId, createTime, updateTime);
    }
}
