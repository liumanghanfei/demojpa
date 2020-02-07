package com.example.demojap.entity;

import javax.persistence.*;
import java.util.Objects;

/**
 * TWxUserStaffClassify
 *
 * @author yangy
 * @date 2020-02-07
 */
@Entity
@Table(name = "t_wx_user_staff_classify", schema = "coffeewx_admin", catalog = "")
public class WxUserStaffClassify {
    private int staffclassifyid;
    private String staffclassify;
    private Integer staffclassifycode;

    @Id
    @Column(name = "staffclassifyid")
    public int getStaffclassifyid() {
        return staffclassifyid;
    }

    public void setStaffclassifyid(int staffclassifyid) {
        this.staffclassifyid = staffclassifyid;
    }

    @Basic
    @Column(name = "staffclassify")
    public String getStaffclassify() {
        return staffclassify;
    }

    public void setStaffclassify(String staffclassify) {
        this.staffclassify = staffclassify;
    }

    @Basic
    @Column(name = "staffclassifycode")
    public Integer getStaffclassifycode() {
        return staffclassifycode;
    }

    public void setStaffclassifycode(Integer staffclassifycode) {
        this.staffclassifycode = staffclassifycode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WxUserStaffClassify that = (WxUserStaffClassify) o;
        return staffclassifyid == that.staffclassifyid &&
                Objects.equals(staffclassify, that.staffclassify) &&
                Objects.equals(staffclassifycode, that.staffclassifycode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(staffclassifyid, staffclassify, staffclassifycode);
    }
}
