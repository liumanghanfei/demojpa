package com.example.demojap.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * PolicyDetails
 *
 * @author yangy
 * @date 2020-02-07
 */
@Entity
@Table(name = "policy_details", schema = "coffeewx_admin", catalog = "")
public class PolicyDetails {
    private int policyid;
    private String proposalno;
    private String policyno;
    private String totalprem;
    private Timestamp appdate;
    private String mainproduccode;
    private Timestamp cvalidate;
    private Timestamp enddate;
    private String payintv;
    private String payyears;
    private String payyearsintv;
    private String insuretype;
    private String insureyears;
    private String insureyearsintv;
    private String isselfflag;
    private String islegalbnf;

    @Id
    @Column(name = "policyid")
    public int getPolicyid() {
        return policyid;
    }

    public void setPolicyid(int policyid) {
        this.policyid = policyid;
    }

    @Basic
    @Column(name = "proposalno")
    public String getProposalno() {
        return proposalno;
    }

    public void setProposalno(String proposalno) {
        this.proposalno = proposalno;
    }

    @Basic
    @Column(name = "policyno")
    public String getPolicyno() {
        return policyno;
    }

    public void setPolicyno(String policyno) {
        this.policyno = policyno;
    }

    @Basic
    @Column(name = "totalprem")
    public String getTotalprem() {
        return totalprem;
    }

    public void setTotalprem(String totalprem) {
        this.totalprem = totalprem;
    }

    @Basic
    @Column(name = "appdate")
    public Timestamp getAppdate() {
        return appdate;
    }

    public void setAppdate(Timestamp appdate) {
        this.appdate = appdate;
    }

    @Basic
    @Column(name = "mainproduccode")
    public String getMainproduccode() {
        return mainproduccode;
    }

    public void setMainproduccode(String mainproduccode) {
        this.mainproduccode = mainproduccode;
    }

    @Basic
    @Column(name = "cvalidate")
    public Timestamp getCvalidate() {
        return cvalidate;
    }

    public void setCvalidate(Timestamp cvalidate) {
        this.cvalidate = cvalidate;
    }

    @Basic
    @Column(name = "enddate")
    public Timestamp getEnddate() {
        return enddate;
    }

    public void setEnddate(Timestamp enddate) {
        this.enddate = enddate;
    }

    @Basic
    @Column(name = "payintv")
    public String getPayintv() {
        return payintv;
    }

    public void setPayintv(String payintv) {
        this.payintv = payintv;
    }

    @Basic
    @Column(name = "payyears")
    public String getPayyears() {
        return payyears;
    }

    public void setPayyears(String payyears) {
        this.payyears = payyears;
    }

    @Basic
    @Column(name = "payyearsintv")
    public String getPayyearsintv() {
        return payyearsintv;
    }

    public void setPayyearsintv(String payyearsintv) {
        this.payyearsintv = payyearsintv;
    }

    @Basic
    @Column(name = "insuretype")
    public String getInsuretype() {
        return insuretype;
    }

    public void setInsuretype(String insuretype) {
        this.insuretype = insuretype;
    }

    @Basic
    @Column(name = "insureyears")
    public String getInsureyears() {
        return insureyears;
    }

    public void setInsureyears(String insureyears) {
        this.insureyears = insureyears;
    }

    @Basic
    @Column(name = "insureyearsintv")
    public String getInsureyearsintv() {
        return insureyearsintv;
    }

    public void setInsureyearsintv(String insureyearsintv) {
        this.insureyearsintv = insureyearsintv;
    }

    @Basic
    @Column(name = "isselfflag")
    public String getIsselfflag() {
        return isselfflag;
    }

    public void setIsselfflag(String isselfflag) {
        this.isselfflag = isselfflag;
    }

    @Basic
    @Column(name = "islegalbnf")
    public String getIslegalbnf() {
        return islegalbnf;
    }

    public void setIslegalbnf(String islegalbnf) {
        this.islegalbnf = islegalbnf;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PolicyDetails that = (PolicyDetails) o;
        return policyid == that.policyid &&
                Objects.equals(proposalno, that.proposalno) &&
                Objects.equals(policyno, that.policyno) &&
                Objects.equals(totalprem, that.totalprem) &&
                Objects.equals(appdate, that.appdate) &&
                Objects.equals(mainproduccode, that.mainproduccode) &&
                Objects.equals(cvalidate, that.cvalidate) &&
                Objects.equals(enddate, that.enddate) &&
                Objects.equals(payintv, that.payintv) &&
                Objects.equals(payyears, that.payyears) &&
                Objects.equals(payyearsintv, that.payyearsintv) &&
                Objects.equals(insuretype, that.insuretype) &&
                Objects.equals(insureyears, that.insureyears) &&
                Objects.equals(insureyearsintv, that.insureyearsintv) &&
                Objects.equals(isselfflag, that.isselfflag) &&
                Objects.equals(islegalbnf, that.islegalbnf);
    }

    @Override
    public int hashCode() {
        return Objects.hash(policyid, proposalno, policyno, totalprem, appdate, mainproduccode, cvalidate, enddate, payintv, payyears, payyearsintv, insuretype, insureyears, insureyearsintv, isselfflag, islegalbnf);
    }
}
