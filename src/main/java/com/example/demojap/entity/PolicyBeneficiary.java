package com.example.demojap.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * PolicyBeneficiary
 *
 * @author yangy
 * @date 2020-02-07
 */
@Entity
@Table(name = "policy_beneficiary", schema = "coffeewx_admin", catalog = "")
public class PolicyBeneficiary {
    private int beneficiaryid;
    private String relationtoinsured;
    private String beneficiaryname;
    private String beneficiarycardno;
    private Timestamp beneficiaryvalstartdate;
    private Timestamp beneficiaryvalenddate;
    private String beneficiaryoccupation;
    private String benefitratio;
    private String beneficiarymobile;
    private String beneficiaryrank;
    private Integer proposalno;

    @Id
    @Column(name = "beneficiaryid")
    public int getBeneficiaryid() {
        return beneficiaryid;
    }

    public void setBeneficiaryid(int beneficiaryid) {
        this.beneficiaryid = beneficiaryid;
    }

    @Basic
    @Column(name = "relationtoinsured")
    public String getRelationtoinsured() {
        return relationtoinsured;
    }

    public void setRelationtoinsured(String relationtoinsured) {
        this.relationtoinsured = relationtoinsured;
    }

    @Basic
    @Column(name = "beneficiaryname")
    public String getBeneficiaryname() {
        return beneficiaryname;
    }

    public void setBeneficiaryname(String beneficiaryname) {
        this.beneficiaryname = beneficiaryname;
    }

    @Basic
    @Column(name = "beneficiarycardno")
    public String getBeneficiarycardno() {
        return beneficiarycardno;
    }

    public void setBeneficiarycardno(String beneficiarycardno) {
        this.beneficiarycardno = beneficiarycardno;
    }

    @Basic
    @Column(name = "beneficiaryvalstartdate")
    public Timestamp getBeneficiaryvalstartdate() {
        return beneficiaryvalstartdate;
    }

    public void setBeneficiaryvalstartdate(Timestamp beneficiaryvalstartdate) {
        this.beneficiaryvalstartdate = beneficiaryvalstartdate;
    }

    @Basic
    @Column(name = "beneficiaryvalenddate")
    public Timestamp getBeneficiaryvalenddate() {
        return beneficiaryvalenddate;
    }

    public void setBeneficiaryvalenddate(Timestamp beneficiaryvalenddate) {
        this.beneficiaryvalenddate = beneficiaryvalenddate;
    }

    @Basic
    @Column(name = "beneficiaryoccupation")
    public String getBeneficiaryoccupation() {
        return beneficiaryoccupation;
    }

    public void setBeneficiaryoccupation(String beneficiaryoccupation) {
        this.beneficiaryoccupation = beneficiaryoccupation;
    }

    @Basic
    @Column(name = "benefitratio")
    public String getBenefitratio() {
        return benefitratio;
    }

    public void setBenefitratio(String benefitratio) {
        this.benefitratio = benefitratio;
    }

    @Basic
    @Column(name = "beneficiarymobile")
    public String getBeneficiarymobile() {
        return beneficiarymobile;
    }

    public void setBeneficiarymobile(String beneficiarymobile) {
        this.beneficiarymobile = beneficiarymobile;
    }

    @Basic
    @Column(name = "beneficiaryrank")
    public String getBeneficiaryrank() {
        return beneficiaryrank;
    }

    public void setBeneficiaryrank(String beneficiaryrank) {
        this.beneficiaryrank = beneficiaryrank;
    }

    @Basic
    @Column(name = "proposalno")
    public Integer getProposalno() {
        return proposalno;
    }

    public void setProposalno(Integer proposalno) {
        this.proposalno = proposalno;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PolicyBeneficiary that = (PolicyBeneficiary) o;
        return beneficiaryid == that.beneficiaryid &&
                Objects.equals(relationtoinsured, that.relationtoinsured) &&
                Objects.equals(beneficiaryname, that.beneficiaryname) &&
                Objects.equals(beneficiarycardno, that.beneficiarycardno) &&
                Objects.equals(beneficiaryvalstartdate, that.beneficiaryvalstartdate) &&
                Objects.equals(beneficiaryvalenddate, that.beneficiaryvalenddate) &&
                Objects.equals(beneficiaryoccupation, that.beneficiaryoccupation) &&
                Objects.equals(benefitratio, that.benefitratio) &&
                Objects.equals(beneficiarymobile, that.beneficiarymobile) &&
                Objects.equals(beneficiaryrank, that.beneficiaryrank) &&
                Objects.equals(proposalno, that.proposalno);
    }

    @Override
    public int hashCode() {
        return Objects.hash(beneficiaryid, relationtoinsured, beneficiaryname, beneficiarycardno, beneficiaryvalstartdate, beneficiaryvalenddate, beneficiaryoccupation, benefitratio, beneficiarymobile, beneficiaryrank, proposalno);
    }
}
