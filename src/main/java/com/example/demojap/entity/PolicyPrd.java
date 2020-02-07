package com.example.demojap.entity;

import javax.persistence.*;
import java.util.Objects;

/**
 * PolicyPrd
 *
 * @author yangy
 * @date 2020-02-07
 */
@Entity
@Table(name = "policy_prd", schema = "coffeewx_admin", catalog = "")
public class PolicyPrd {
    private int policyprdid;
    private String proposalno;
    private String productcode;
    private String premium;
    private String wxuserid;

    @Id
    @Column(name = "policyprdid")
    public int getPolicyprdid() {
        return policyprdid;
    }

    public void setPolicyprdid(int policyprdid) {
        this.policyprdid = policyprdid;
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
    @Column(name = "productcode")
    public String getProductcode() {
        return productcode;
    }

    public void setProductcode(String productcode) {
        this.productcode = productcode;
    }

    @Basic
    @Column(name = "premium")
    public String getPremium() {
        return premium;
    }

    public void setPremium(String premium) {
        this.premium = premium;
    }

    @Basic
    @Column(name = "wxuserid")
    public String getWxuserid() {
        return wxuserid;
    }

    public void setWxuserid(String wxuserid) {
        this.wxuserid = wxuserid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PolicyPrd policyPrd = (PolicyPrd) o;
        return policyprdid == policyPrd.policyprdid &&
                Objects.equals(proposalno, policyPrd.proposalno) &&
                Objects.equals(productcode, policyPrd.productcode) &&
                Objects.equals(premium, policyPrd.premium) &&
                Objects.equals(wxuserid, policyPrd.wxuserid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(policyprdid, proposalno, productcode, premium, wxuserid);
    }
}
