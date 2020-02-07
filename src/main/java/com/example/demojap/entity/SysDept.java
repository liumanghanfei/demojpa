package com.example.demojap.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * SysDept
 *
 * @author yangy
 * @date 2020-02-07
 */
@Entity
@Table(name = "sys_dept", schema = "coffeewx_admin", catalog = "")
public class SysDept {
    private int id;
    private String name;
    private Integer level;
    private Integer orderNo;
    private String remarks;
    private String parentId;
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
    @Column(name = "level")
    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    @Basic
    @Column(name = "order_no")
    public Integer getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(Integer orderNo) {
        this.orderNo = orderNo;
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
    @Column(name = "parent_id")
    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
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
        SysDept sysDept = (SysDept) o;
        return id == sysDept.id &&
                Objects.equals(name, sysDept.name) &&
                Objects.equals(level, sysDept.level) &&
                Objects.equals(orderNo, sysDept.orderNo) &&
                Objects.equals(remarks, sysDept.remarks) &&
                Objects.equals(parentId, sysDept.parentId) &&
                Objects.equals(createTime, sysDept.createTime) &&
                Objects.equals(updateTime, sysDept.updateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, level, orderNo, remarks, parentId, createTime, updateTime);
    }
}
