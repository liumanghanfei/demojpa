package com.example.demojap.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * WxAccount
 *
 * @author yangy
 * @date 2020-02-07
 */
@Entity
@Table(name = "t_wx_account", schema = "coffeewx_admin", catalog = "")
public class WxAccount {
    private int id;
    private String name;
    private String account;
    private String appid;
    private String appsecret;
    private String url;
    private String token;
    private String aeskey;
    private String qrUrl;
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
    @Column(name = "account")
    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    @Basic
    @Column(name = "appid")
    public String getAppid() {
        return appid;
    }

    public void setAppid(String appid) {
        this.appid = appid;
    }

    @Basic
    @Column(name = "appsecret")
    public String getAppsecret() {
        return appsecret;
    }

    public void setAppsecret(String appsecret) {
        this.appsecret = appsecret;
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
    @Column(name = "token")
    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    @Basic
    @Column(name = "aeskey")
    public String getAeskey() {
        return aeskey;
    }

    public void setAeskey(String aeskey) {
        this.aeskey = aeskey;
    }

    @Basic
    @Column(name = "qr_url")
    public String getQrUrl() {
        return qrUrl;
    }

    public void setQrUrl(String qrUrl) {
        this.qrUrl = qrUrl;
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
        WxAccount wxAccount = (WxAccount) o;
        return id == wxAccount.id &&
                Objects.equals(name, wxAccount.name) &&
                Objects.equals(account, wxAccount.account) &&
                Objects.equals(appid, wxAccount.appid) &&
                Objects.equals(appsecret, wxAccount.appsecret) &&
                Objects.equals(url, wxAccount.url) &&
                Objects.equals(token, wxAccount.token) &&
                Objects.equals(aeskey, wxAccount.aeskey) &&
                Objects.equals(qrUrl, wxAccount.qrUrl) &&
                Objects.equals(createTime, wxAccount.createTime) &&
                Objects.equals(updateTime, wxAccount.updateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, account, appid, appsecret, url, token, aeskey, qrUrl, createTime, updateTime);
    }
}
