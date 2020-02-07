package com.example.demojap.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * SysUser
 *
 * @author yangy
 * @date 2020-02-07
 */
@Entity
@Table(name = "sys_user", schema = "coffeewx_admin", catalog = "")
public class SysUser {
    private int id;
    private String username;
    private String pwd;
    private String nickName;
    private String sex;
    private String phone;
    private String email;
    private String avatar;
    private String flag;
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
    @Column(name = "username")
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Basic
    @Column(name = "pwd")
    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    @Basic
    @Column(name = "nick_name")
    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    @Basic
    @Column(name = "sex")
    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Basic
    @Column(name = "phone")
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Basic
    @Column(name = "email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "avatar")
    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    @Basic
    @Column(name = "flag")
    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
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
        SysUser sysUser = (SysUser) o;
        return id == sysUser.id &&
                Objects.equals(username, sysUser.username) &&
                Objects.equals(pwd, sysUser.pwd) &&
                Objects.equals(nickName, sysUser.nickName) &&
                Objects.equals(sex, sysUser.sex) &&
                Objects.equals(phone, sysUser.phone) &&
                Objects.equals(email, sysUser.email) &&
                Objects.equals(avatar, sysUser.avatar) &&
                Objects.equals(flag, sysUser.flag) &&
                Objects.equals(createTime, sysUser.createTime) &&
                Objects.equals(updateTime, sysUser.updateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, username, pwd, nickName, sex, phone, email, avatar, flag, createTime, updateTime);
    }
}
