package com.example.demojap.entity;

import javax.persistence.*;
import java.util.Objects;

/**
 * WxUserMemberrank
 *
 * @author yangy
 * @date 2020-02-07
 */
@Entity
@Table(name = "t_wx_user_memberrank", schema = "coffeewx_admin", catalog = "")
public class WxUserMemberrank {
    private int memberrankid;
    private String memberrank;
    private Integer memberrankcode;

    @Id
    @Column(name = "memberrankid")
    public int getMemberrankid() {
        return memberrankid;
    }

    public void setMemberrankid(int memberrankid) {
        this.memberrankid = memberrankid;
    }

    @Basic
    @Column(name = "memberrank")
    public String getMemberrank() {
        return memberrank;
    }

    public void setMemberrank(String memberrank) {
        this.memberrank = memberrank;
    }

    @Basic
    @Column(name = "memberrankcode")
    public Integer getMemberrankcode() {
        return memberrankcode;
    }

    public void setMemberrankcode(Integer memberrankcode) {
        this.memberrankcode = memberrankcode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WxUserMemberrank that = (WxUserMemberrank) o;
        return memberrankid == that.memberrankid &&
                Objects.equals(memberrank, that.memberrank) &&
                Objects.equals(memberrankcode, that.memberrankcode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(memberrankid, memberrank, memberrankcode);
    }
}
