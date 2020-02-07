package com.example.demojap.entity;

import javax.persistence.*;
import java.util.Objects;

/**
 * WxUserPromoter
 *
 * @author yangy
 * @date 2020-02-07
 */
@Entity
@Table(name = "t_wx_user_promoter", schema = "coffeewx_admin", catalog = "")
public class WxUserPromoter {
    private int promoterid;
    private String openid;
    private String promoter;
    private String ticket;
    private String qrcode;

    @Id
    @Column(name = "promoterid")
    public int getPromoterid() {
        return promoterid;
    }

    public void setPromoterid(int promoterid) {
        this.promoterid = promoterid;
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
    @Column(name = "promoter")
    public String getPromoter() {
        return promoter;
    }

    public void setPromoter(String promoter) {
        this.promoter = promoter;
    }

    @Basic
    @Column(name = "ticket")
    public String getTicket() {
        return ticket;
    }

    public void setTicket(String ticket) {
        this.ticket = ticket;
    }

    @Basic
    @Column(name = "qrcode")
    public String getQrcode() {
        return qrcode;
    }

    public void setQrcode(String qrcode) {
        this.qrcode = qrcode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WxUserPromoter that = (WxUserPromoter) o;
        return promoterid == that.promoterid &&
                Objects.equals(openid, that.openid) &&
                Objects.equals(promoter, that.promoter) &&
                Objects.equals(ticket, that.ticket) &&
                Objects.equals(qrcode, that.qrcode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(promoterid, openid, promoter, ticket, qrcode);
    }
}
