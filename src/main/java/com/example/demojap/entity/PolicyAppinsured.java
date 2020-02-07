package com.example.demojap.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * PolicyAppinsured
 *
 * @author yangy
 * @date 2020-02-07
 */
@Entity
@Table(name = "policy_appinsured", schema = "coffeewx_admin", catalog = "")
public class PolicyAppinsured {
    private int appinsuredid;
    private String appinsuredname;
    private String appinsuredgender;
    private String appinsuredbirthday;
    private String appinsuredcardtype;
    private String appinsuredcardno;
    private Timestamp appinsuredvalstartdate;
    private Timestamp appinsuredvalenddate;
    private String appinsurednationality;
    private String appinsuredoccupation;
    private String appinsuredmobile;
    private String appinsuredemail;
    private String appinsuredaddresstype;
    private String appinsuredprovince;
    private String appinsuredcity;
    private String appinsuredcounty;
    private String appinsuredaddressdetail;
    private String appinsuredpostcode;
    private String proposalno;

    @Id
    @Column(name = "appinsuredid")
    public int getAppinsuredid() {
        return appinsuredid;
    }

    public void setAppinsuredid(int appinsuredid) {
        this.appinsuredid = appinsuredid;
    }

    @Basic
    @Column(name = "appinsuredname")
    public String getAppinsuredname() {
        return appinsuredname;
    }

    public void setAppinsuredname(String appinsuredname) {
        this.appinsuredname = appinsuredname;
    }

    @Basic
    @Column(name = "appinsuredgender")
    public String getAppinsuredgender() {
        return appinsuredgender;
    }

    public void setAppinsuredgender(String appinsuredgender) {
        this.appinsuredgender = appinsuredgender;
    }

    @Basic
    @Column(name = "appinsuredbirthday")
    public String getAppinsuredbirthday() {
        return appinsuredbirthday;
    }

    public void setAppinsuredbirthday(String appinsuredbirthday) {
        this.appinsuredbirthday = appinsuredbirthday;
    }

    @Basic
    @Column(name = "appinsuredcardtype")
    public String getAppinsuredcardtype() {
        return appinsuredcardtype;
    }

    public void setAppinsuredcardtype(String appinsuredcardtype) {
        this.appinsuredcardtype = appinsuredcardtype;
    }

    @Basic
    @Column(name = "appinsuredcardno")
    public String getAppinsuredcardno() {
        return appinsuredcardno;
    }

    public void setAppinsuredcardno(String appinsuredcardno) {
        this.appinsuredcardno = appinsuredcardno;
    }

    @Basic
    @Column(name = "appinsuredvalstartdate")
    public Timestamp getAppinsuredvalstartdate() {
        return appinsuredvalstartdate;
    }

    public void setAppinsuredvalstartdate(Timestamp appinsuredvalstartdate) {
        this.appinsuredvalstartdate = appinsuredvalstartdate;
    }

    @Basic
    @Column(name = "appinsuredvalenddate")
    public Timestamp getAppinsuredvalenddate() {
        return appinsuredvalenddate;
    }

    public void setAppinsuredvalenddate(Timestamp appinsuredvalenddate) {
        this.appinsuredvalenddate = appinsuredvalenddate;
    }

    @Basic
    @Column(name = "appinsurednationality")
    public String getAppinsurednationality() {
        return appinsurednationality;
    }

    public void setAppinsurednationality(String appinsurednationality) {
        this.appinsurednationality = appinsurednationality;
    }

    @Basic
    @Column(name = "appinsuredoccupation")
    public String getAppinsuredoccupation() {
        return appinsuredoccupation;
    }

    public void setAppinsuredoccupation(String appinsuredoccupation) {
        this.appinsuredoccupation = appinsuredoccupation;
    }

    @Basic
    @Column(name = "appinsuredmobile")
    public String getAppinsuredmobile() {
        return appinsuredmobile;
    }

    public void setAppinsuredmobile(String appinsuredmobile) {
        this.appinsuredmobile = appinsuredmobile;
    }

    @Basic
    @Column(name = "appinsuredemail")
    public String getAppinsuredemail() {
        return appinsuredemail;
    }

    public void setAppinsuredemail(String appinsuredemail) {
        this.appinsuredemail = appinsuredemail;
    }

    @Basic
    @Column(name = "appinsuredaddresstype")
    public String getAppinsuredaddresstype() {
        return appinsuredaddresstype;
    }

    public void setAppinsuredaddresstype(String appinsuredaddresstype) {
        this.appinsuredaddresstype = appinsuredaddresstype;
    }

    @Basic
    @Column(name = "appinsuredprovince")
    public String getAppinsuredprovince() {
        return appinsuredprovince;
    }

    public void setAppinsuredprovince(String appinsuredprovince) {
        this.appinsuredprovince = appinsuredprovince;
    }

    @Basic
    @Column(name = "appinsuredcity")
    public String getAppinsuredcity() {
        return appinsuredcity;
    }

    public void setAppinsuredcity(String appinsuredcity) {
        this.appinsuredcity = appinsuredcity;
    }

    @Basic
    @Column(name = "appinsuredcounty")
    public String getAppinsuredcounty() {
        return appinsuredcounty;
    }

    public void setAppinsuredcounty(String appinsuredcounty) {
        this.appinsuredcounty = appinsuredcounty;
    }

    @Basic
    @Column(name = "appinsuredaddressdetail")
    public String getAppinsuredaddressdetail() {
        return appinsuredaddressdetail;
    }

    public void setAppinsuredaddressdetail(String appinsuredaddressdetail) {
        this.appinsuredaddressdetail = appinsuredaddressdetail;
    }

    @Basic
    @Column(name = "appinsuredpostcode")
    public String getAppinsuredpostcode() {
        return appinsuredpostcode;
    }

    public void setAppinsuredpostcode(String appinsuredpostcode) {
        this.appinsuredpostcode = appinsuredpostcode;
    }

    @Basic
    @Column(name = "proposalno")
    public String getProposalno() {
        return proposalno;
    }

    public void setProposalno(String proposalno) {
        this.proposalno = proposalno;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PolicyAppinsured that = (PolicyAppinsured) o;
        return appinsuredid == that.appinsuredid &&
                Objects.equals(appinsuredname, that.appinsuredname) &&
                Objects.equals(appinsuredgender, that.appinsuredgender) &&
                Objects.equals(appinsuredbirthday, that.appinsuredbirthday) &&
                Objects.equals(appinsuredcardtype, that.appinsuredcardtype) &&
                Objects.equals(appinsuredcardno, that.appinsuredcardno) &&
                Objects.equals(appinsuredvalstartdate, that.appinsuredvalstartdate) &&
                Objects.equals(appinsuredvalenddate, that.appinsuredvalenddate) &&
                Objects.equals(appinsurednationality, that.appinsurednationality) &&
                Objects.equals(appinsuredoccupation, that.appinsuredoccupation) &&
                Objects.equals(appinsuredmobile, that.appinsuredmobile) &&
                Objects.equals(appinsuredemail, that.appinsuredemail) &&
                Objects.equals(appinsuredaddresstype, that.appinsuredaddresstype) &&
                Objects.equals(appinsuredprovince, that.appinsuredprovince) &&
                Objects.equals(appinsuredcity, that.appinsuredcity) &&
                Objects.equals(appinsuredcounty, that.appinsuredcounty) &&
                Objects.equals(appinsuredaddressdetail, that.appinsuredaddressdetail) &&
                Objects.equals(appinsuredpostcode, that.appinsuredpostcode) &&
                Objects.equals(proposalno, that.proposalno);
    }

    @Override
    public int hashCode() {
        return Objects.hash(appinsuredid, appinsuredname, appinsuredgender, appinsuredbirthday, appinsuredcardtype, appinsuredcardno, appinsuredvalstartdate, appinsuredvalenddate, appinsurednationality, appinsuredoccupation, appinsuredmobile, appinsuredemail, appinsuredaddresstype, appinsuredprovince, appinsuredcity, appinsuredcounty, appinsuredaddressdetail, appinsuredpostcode, proposalno);
    }
}
