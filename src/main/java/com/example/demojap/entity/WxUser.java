package com.example.demojap.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * WxUser
 *
 * @author yangy
 * @date 2020-02-07
 */
@Entity
@Table(name = "t_wx_user", schema = "coffeewx_admin", catalog = "")
public class WxUser {
    private int userid;
    private String openid;
    private String wxuserid;
    private String referralcode;
    private String wxusername;
    private String phone;
    private String memberrankcode;
    private String staffclassifycode;
    private String sharerreferralcode;
    private String agentreferralcode;
    private String examine;
    private Timestamp createtime;
    private String fansof;

    @Id
    @Column(name = "userid")
    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
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
    @Column(name = "wxuserid")
    public String getWxuserid() {
        return wxuserid;
    }

    public void setWxuserid(String wxuserid) {
        this.wxuserid = wxuserid;
    }

    @Basic
    @Column(name = "referralcode")
    public String getReferralcode() {
        return referralcode;
    }

    public void setReferralcode(String referralcode) {
        this.referralcode = referralcode;
    }

    @Basic
    @Column(name = "wxusername")
    public String getWxusername() {
        return wxusername;
    }

    public void setWxusername(String wxusername) {
        this.wxusername = wxusername;
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
    @Column(name = "memberrankcode")
    public String getMemberrankcode() {
        return memberrankcode;
    }

    public void setMemberrankcode(String memberrankcode) {
        this.memberrankcode = memberrankcode;
    }

    @Basic
    @Column(name = "staffclassifycode")
    public String getStaffclassifycode() {
        return staffclassifycode;
    }

    public void setStaffclassifycode(String staffclassifycode) {
        this.staffclassifycode = staffclassifycode;
    }

    @Basic
    @Column(name = "sharerreferralcode")
    public String getSharerreferralcode() {
        return sharerreferralcode;
    }

    public void setSharerreferralcode(String sharerreferralcode) {
        this.sharerreferralcode = sharerreferralcode;
    }

    @Basic
    @Column(name = "agentreferralcode")
    public String getAgentreferralcode() {
        return agentreferralcode;
    }

    public void setAgentreferralcode(String agentreferralcode) {
        this.agentreferralcode = agentreferralcode;
    }

    @Basic
    @Column(name = "examine")
    public String getExamine() {
        return examine;
    }

    public void setExamine(String examine) {
        this.examine = examine;
    }

    @Basic
    @Column(name = "createtime")
    public Timestamp getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Timestamp createtime) {
        this.createtime = createtime;
    }

    @Basic
    @Column(name = "fansof")
    public String getFansof() {
        return fansof;
    }

    public void setFansof(String fansof) {
        this.fansof = fansof;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WxUser wxUser = (WxUser) o;
        return userid == wxUser.userid &&
                Objects.equals(openid, wxUser.openid) &&
                Objects.equals(wxuserid, wxUser.wxuserid) &&
                Objects.equals(referralcode, wxUser.referralcode) &&
                Objects.equals(wxusername, wxUser.wxusername) &&
                Objects.equals(phone, wxUser.phone) &&
                Objects.equals(memberrankcode, wxUser.memberrankcode) &&
                Objects.equals(staffclassifycode, wxUser.staffclassifycode) &&
                Objects.equals(sharerreferralcode, wxUser.sharerreferralcode) &&
                Objects.equals(agentreferralcode, wxUser.agentreferralcode) &&
                Objects.equals(examine, wxUser.examine) &&
                Objects.equals(createtime, wxUser.createtime) &&
                Objects.equals(fansof, wxUser.fansof);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userid, openid, wxuserid, referralcode, wxusername, phone, memberrankcode, staffclassifycode, sharerreferralcode, agentreferralcode, examine, createtime, fansof);
    }
}
