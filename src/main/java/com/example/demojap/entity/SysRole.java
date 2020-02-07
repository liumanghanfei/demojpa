package com.example.demojap.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * SysRole
 *
 * @author yangy
 * @date 2020-02-07
 */
@Entity
@Table(name = "sys_role", schema = "coffeewx_admin", catalog = "")
public class SysRole {
    private int id;
    private String code;
    private String name;
    private String remarks;
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
    @Column(name = "code")
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
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
    @Column(name = "remarks")
    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
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
        SysRole sysRole = (SysRole) o;
        return id == sysRole.id &&
                Objects.equals(code, sysRole.code) &&
                Objects.equals(name, sysRole.name) &&
                Objects.equals(remarks, sysRole.remarks) &&
                Objects.equals(createTime, sysRole.createTime) &&
                Objects.equals(updateTime, sysRole.updateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, code, name, remarks, createTime, updateTime);
    }
}
