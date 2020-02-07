package com.example.demojap.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * PolicyInsured
 *
 * @author yangy
 * @date 2020-02-07
 */
@Entity
@Table(name = "policy_insured", schema = "coffeewx_admin", catalog = "")
public class PolicyInsured {
    private int insuredid;
    private String relationtoapp;
    private String insuredname;
    private String insuredgender;
    private String insuredbirthday;
    private String insuredcardtype;
    private String insuredcardno;
    private Timestamp insuredvalstartdate;
    private Timestamp insuredvalenddate;
    private String insurednationality;
    private String insuredoccupation;
    private String insuredmobile;
    private String insuredemail;
    private String insuredheight;
    private String insuredweight;
    private String insuredaddresstype;
    private String insuredprovince;
    private String insuredcity;
    private String insuredcounty;
    private String insuredaddressdetail;
    private String insuredpostcode;
    private String proposalno;

    @Id
    @Column(name = "insuredid")
    public int getInsuredid() {
        return insuredid;
    }

    public void setInsuredid(int insuredid) {
        this.insuredid = insuredid;
    }

    @Basic
    @Column(name = "relationtoapp")
    public String getRelationtoapp() {
        return relationtoapp;
    }

    public void setRelationtoapp(String relationtoapp) {
        this.relationtoapp = relationtoapp;
    }

    @Basic
    @Column(name = "insuredname")
    public String getInsuredname() {
        return insuredname;
    }

    public void setInsuredname(String insuredname) {
        this.insuredname = insuredname;
    }

    @Basic
    @Column(name = "insuredgender")
    public String getInsuredgender() {
        return insuredgender;
    }

    public void setInsuredgender(String insuredgender) {
        this.insuredgender = insuredgender;
    }

    @Basic
    @Column(name = "insuredbirthday")
    public String getInsuredbirthday() {
        return insuredbirthday;
    }

    public void setInsuredbirthday(String insuredbirthday) {
        this.insuredbirthday = insuredbirthday;
    }

    @Basic
    @Column(name = "insuredcardtype")
    public String getInsuredcardtype() {
        return insuredcardtype;
    }

    public void setInsuredcardtype(String insuredcardtype) {
        this.insuredcardtype = insuredcardtype;
    }

    @Basic
    @Column(name = "insuredcardno")
    public String getInsuredcardno() {
        return insuredcardno;
    }

    public void setInsuredcardno(String insuredcardno) {
        this.insuredcardno = insuredcardno;
    }

    @Basic
    @Column(name = "insuredvalstartdate")
    public Timestamp getInsuredvalstartdate() {
        return insuredvalstartdate;
    }

    public void setInsuredvalstartdate(Timestamp insuredvalstartdate) {
        this.insuredvalstartdate = insuredvalstartdate;
    }

    @Basic
    @Column(name = "insuredvalenddate")
    public Timestamp getInsuredvalenddate() {
        return insuredvalenddate;
    }

    public void setInsuredvalenddate(Timestamp insuredvalenddate) {
        this.insuredvalenddate = insuredvalenddate;
    }

    @Basic
    @Column(name = "insurednationality")
    public String getInsurednationality() {
        return insurednationality;
    }

    public void setInsurednationality(String insurednationality) {
        this.insurednationality = insurednationality;
    }

    @Basic
    @Column(name = "insuredoccupation")
    public String getInsuredoccupation() {
        return insuredoccupation;
    }

    public void setInsuredoccupation(String insuredoccupation) {
        this.insuredoccupation = insuredoccupation;
    }

    @Basic
    @Column(name = "insuredmobile")
    public String getInsuredmobile() {
        return insuredmobile;
    }

    public void setInsuredmobile(String insuredmobile) {
        this.insuredmobile = insuredmobile;
    }

    @Basic
    @Column(name = "insuredemail")
    public String getInsuredemail() {
        return insuredemail;
    }

    public void setInsuredemail(String insuredemail) {
        this.insuredemail = insuredemail;
    }

    @Basic
    @Column(name = "insuredheight")
    public String getInsuredheight() {
        return insuredheight;
    }

    public void setInsuredheight(String insuredheight) {
        this.insuredheight = insuredheight;
    }

    @Basic
    @Column(name = "insuredweight")
    public String getInsuredweight() {
        return insuredweight;
    }

    public void setInsuredweight(String insuredweight) {
        this.insuredweight = insuredweight;
    }

    @Basic
    @Column(name = "insuredaddresstype")
    public String getInsuredaddresstype() {
        return insuredaddresstype;
    }

    public void setInsuredaddresstype(String insuredaddresstype) {
        this.insuredaddresstype = insuredaddresstype;
    }

    @Basic
    @Column(name = "insuredprovince")
    public String getInsuredprovince() {
        return insuredprovince;
    }

    public void setInsuredprovince(String insuredprovince) {
        this.insuredprovince = insuredprovince;
    }

    @Basic
    @Column(name = "insuredcity")
    public String getInsuredcity() {
        return insuredcity;
    }

    public void setInsuredcity(String insuredcity) {
        this.insuredcity = insuredcity;
    }

    @Basic
    @Column(name = "insuredcounty")
    public String getInsuredcounty() {
        return insuredcounty;
    }

    public void setInsuredcounty(String insuredcounty) {
        this.insuredcounty = insuredcounty;
    }

    @Basic
    @Column(name = "insuredaddressdetail")
    public String getInsuredaddressdetail() {
        return insuredaddressdetail;
    }

    public void setInsuredaddressdetail(String insuredaddressdetail) {
        this.insuredaddressdetail = insuredaddressdetail;
    }

    @Basic
    @Column(name = "insuredpostcode")
    public String getInsuredpostcode() {
        return insuredpostcode;
    }

    public void setInsuredpostcode(String insuredpostcode) {
        this.insuredpostcode = insuredpostcode;
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
        PolicyInsured that = (PolicyInsured) o;
        return insuredid == that.insuredid &&
                Objects.equals(relationtoapp, that.relationtoapp) &&
                Objects.equals(insuredname, that.insuredname) &&
                Objects.equals(insuredgender, that.insuredgender) &&
                Objects.equals(insuredbirthday, that.insuredbirthday) &&
                Objects.equals(insuredcardtype, that.insuredcardtype) &&
                Objects.equals(insuredcardno, that.insuredcardno) &&
                Objects.equals(insuredvalstartdate, that.insuredvalstartdate) &&
                Objects.equals(insuredvalenddate, that.insuredvalenddate) &&
                Objects.equals(insurednationality, that.insurednationality) &&
                Objects.equals(insuredoccupation, that.insuredoccupation) &&
                Objects.equals(insuredmobile, that.insuredmobile) &&
                Objects.equals(insuredemail, that.insuredemail) &&
                Objects.equals(insuredheight, that.insuredheight) &&
                Objects.equals(insuredweight, that.insuredweight) &&
                Objects.equals(insuredaddresstype, that.insuredaddresstype) &&
                Objects.equals(insuredprovince, that.insuredprovince) &&
                Objects.equals(insuredcity, that.insuredcity) &&
                Objects.equals(insuredcounty, that.insuredcounty) &&
                Objects.equals(insuredaddressdetail, that.insuredaddressdetail) &&
                Objects.equals(insuredpostcode, that.insuredpostcode) &&
                Objects.equals(proposalno, that.proposalno);
    }

    @Override
    public int hashCode() {
        return Objects.hash(insuredid, relationtoapp, insuredname, insuredgender, insuredbirthday, insuredcardtype, insuredcardno, insuredvalstartdate, insuredvalenddate, insurednationality, insuredoccupation, insuredmobile, insuredemail, insuredheight, insuredweight, insuredaddresstype, insuredprovince, insuredcity, insuredcounty, insuredaddressdetail, insuredpostcode, proposalno);
    }
}
