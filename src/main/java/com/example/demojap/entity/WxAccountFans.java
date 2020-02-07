package com.example.demojap.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Objects;

/**
 * WxAccountFans
 *
 * @author yangy
 * @date 2020-02-07
 */
@Entity
@Table(name = "t_wx_account_fans", schema = "coffeewx_admin", catalog = "")
public class WxAccountFans {
    private int id;
    private String openid;
    private String subscribeStatus;
    private Timestamp subscribeTime;
    private byte[] nickname;
    private String gender;
    private String language;
    private String country;
    private String province;
    private String city;
    private String headimgUrl;
    private String remark;
    private String wxAccountId;
    private String wxAccountAppid;
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
    @Column(name = "subscribe_status")
    public String getSubscribeStatus() {
        return subscribeStatus;
    }

    public void setSubscribeStatus(String subscribeStatus) {
        this.subscribeStatus = subscribeStatus;
    }

    @Basic
    @Column(name = "subscribe_time")
    public Timestamp getSubscribeTime() {
        return subscribeTime;
    }

    public void setSubscribeTime(Timestamp subscribeTime) {
        this.subscribeTime = subscribeTime;
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
    @Column(name = "gender")
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Basic
    @Column(name = "language")
    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Basic
    @Column(name = "country")
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Basic
    @Column(name = "province")
    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    @Basic
    @Column(name = "city")
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
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
    @Column(name = "remark")
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
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
    @Column(name = "wx_account_appid")
    public String getWxAccountAppid() {
        return wxAccountAppid;
    }

    public void setWxAccountAppid(String wxAccountAppid) {
        this.wxAccountAppid = wxAccountAppid;
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
        WxAccountFans that = (WxAccountFans) o;
        return id == that.id &&
                Objects.equals(openid, that.openid) &&
                Objects.equals(subscribeStatus, that.subscribeStatus) &&
                Objects.equals(subscribeTime, that.subscribeTime) &&
                Arrays.equals(nickname, that.nickname) &&
                Objects.equals(gender, that.gender) &&
                Objects.equals(language, that.language) &&
                Objects.equals(country, that.country) &&
                Objects.equals(province, that.province) &&
                Objects.equals(city, that.city) &&
                Objects.equals(headimgUrl, that.headimgUrl) &&
                Objects.equals(remark, that.remark) &&
                Objects.equals(wxAccountId, that.wxAccountId) &&
                Objects.equals(wxAccountAppid, that.wxAccountAppid) &&
                Objects.equals(createTime, that.createTime) &&
                Objects.equals(updateTime, that.updateTime);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(id, openid, subscribeStatus, subscribeTime, gender, language, country, province, city, headimgUrl, remark, wxAccountId, wxAccountAppid, createTime, updateTime);
        result = 31 * result + Arrays.hashCode(nickname);
        return result;
    }
}
