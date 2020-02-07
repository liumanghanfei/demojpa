package com.example.demojap.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * WxFansMsgRes
 *
 * @author yangy
 * @date 2020-02-07
 */
@Entity
@Table(name = "t_wx_fans_msg_res", schema = "coffeewx_admin", catalog = "")
public class WxFansMsgRes {
    private int id;
    private String fansMsgId;
    private String resContent;
    private String userId;
    private String userName;
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
    @Column(name = "fans_msg_id")
    public String getFansMsgId() {
        return fansMsgId;
    }

    public void setFansMsgId(String fansMsgId) {
        this.fansMsgId = fansMsgId;
    }

    @Basic
    @Column(name = "res_content")
    public String getResContent() {
        return resContent;
    }

    public void setResContent(String resContent) {
        this.resContent = resContent;
    }

    @Basic
    @Column(name = "user_id")
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "user_name")
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
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
        WxFansMsgRes that = (WxFansMsgRes) o;
        return id == that.id &&
                Objects.equals(fansMsgId, that.fansMsgId) &&
                Objects.equals(resContent, that.resContent) &&
                Objects.equals(userId, that.userId) &&
                Objects.equals(userName, that.userName) &&
                Objects.equals(createTime, that.createTime) &&
                Objects.equals(updateTime, that.updateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, fansMsgId, resContent, userId, userName, createTime, updateTime);
    }
}
