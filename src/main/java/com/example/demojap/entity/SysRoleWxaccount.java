package com.example.demojap.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * SysRoleWxaccount
 *
 * @author yangy
 * @date 2020-02-07
 */
@Entity
@Table(name = "sys_role_wxaccount", schema = "coffeewx_admin", catalog = "")
public class SysRoleWxaccount {
    private int id;
    private String roleId;
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
    @Column(name = "role_id")
    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
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
        SysRoleWxaccount that = (SysRoleWxaccount) o;
        return id == that.id &&
                Objects.equals(roleId, that.roleId) &&
                Objects.equals(wxAccountId, that.wxAccountId) &&
                Objects.equals(createTime, that.createTime) &&
                Objects.equals(updateTime, that.updateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, roleId, wxAccountId, createTime, updateTime);
    }
}
