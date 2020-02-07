package com.example.demojap.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Objects;

/**
 * WxFansMsg
 *
 * @author yangy
 * @date 2020-02-07
 */
@Entity
@Table(name = "t_wx_fans_msg", schema = "coffeewx_admin", catalog = "")
public class WxFansMsg {
    private int id;
    private String openid;
    private byte[] nickname;
    private String headimgUrl;
    private String wxAccountId;
    private String msgType;
    private String content;
    private String resContent;
    private String isRes;
    private String mediaId;
    private String picUrl;
    private String picPath;
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
    @Column(name = "nickname")
    public byte[] getNickname() {
        return nickname;
    }

    public void setNickname(byte[] nickname) {
        this.nickname = nickname;
    }

    @Basic
    @Column(name = "headimg_url")
    public String getHeadimgUrl() {
        return headimgUrl;
    }

    public void setHeadimgUrl(String headimgUrl) {
        this.headimgUrl = headimgUrl;
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
    @Column(name = "msg_type")
    public String getMsgType() {
        return msgType;
    }

    public void setMsgType(String msgType) {
        this.msgType = msgType;
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
    @Column(name = "res_content")
    public String getResContent() {
        return resContent;
    }

    public void setResContent(String resContent) {
        this.resContent = resContent;
    }

    @Basic
    @Column(name = "is_res")
    public String getIsRes() {
        return isRes;
    }

    public void setIsRes(String isRes) {
        this.isRes = isRes;
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
    @Column(name = "pic_url")
    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
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
        WxFansMsg wxFansMsg = (WxFansMsg) o;
        return id == wxFansMsg.id &&
                Objects.equals(openid, wxFansMsg.openid) &&
                Arrays.equals(nickname, wxFansMsg.nickname) &&
                Objects.equals(headimgUrl, wxFansMsg.headimgUrl) &&
                Objects.equals(wxAccountId, wxFansMsg.wxAccountId) &&
                Objects.equals(msgType, wxFansMsg.msgType) &&
                Objects.equals(content, wxFansMsg.content) &&
                Objects.equals(resContent, wxFansMsg.resContent) &&
                Objects.equals(isRes, wxFansMsg.isRes) &&
                Objects.equals(mediaId, wxFansMsg.mediaId) &&
                Objects.equals(picUrl, wxFansMsg.picUrl) &&
                Objects.equals(picPath, wxFansMsg.picPath) &&
                Objects.equals(createTime, wxFansMsg.createTime) &&
                Objects.equals(updateTime, wxFansMsg.updateTime);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(id, openid, headimgUrl, wxAccountId, msgType, content, resContent, isRes, mediaId, picUrl, picPath, createTime, updateTime);
        result = 31 * result + Arrays.hashCode(nickname);
        return result;
    }
}
