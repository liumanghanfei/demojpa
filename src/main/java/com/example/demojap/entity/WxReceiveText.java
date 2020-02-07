package com.example.demojap.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * WxReceiveText
 *
 * @author yangy
 * @date 2020-02-07
 */
@Entity
@Table(name = "t_wx_receive_text", schema = "coffeewx_admin", catalog = "")
public class WxReceiveText {
    private int id;
    private String receiveText;
    private String msgType;
    private String tplId;
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
    @Column(name = "receive_text")
    public String getReceiveText() {
        return receiveText;
    }

    public void setReceiveText(String receiveText) {
        this.receiveText = receiveText;
    }

    @Basic
    @Column(name = "msg_type")
    public String getMsgType() {
        return msgType;
    }

    public void setMsgType(String msgType) {
        this.msgType = msgType;
    }

    @Basic
    @Column(name = "tpl_id")
    public String getTplId() {
        return tplId;
    }

    public void setTplId(String tplId) {
        this.tplId = tplId;
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
        WxReceiveText that = (WxReceiveText) o;
        return id == that.id &&
                Objects.equals(receiveText, that.receiveText) &&
                Objects.equals(msgType, that.msgType) &&
                Objects.equals(tplId, that.tplId) &&
                Objects.equals(wxAccountId, that.wxAccountId) &&
                Objects.equals(createTime, that.createTime) &&
                Objects.equals(updateTime, that.updateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, receiveText, msgType, tplId, wxAccountId, createTime, updateTime);
    }
}
