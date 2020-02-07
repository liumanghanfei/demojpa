package com.example.demojap.entity;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import java.util.Objects;

/**
 * AdvertisementBasic
 *
 * @author yangy
 * @date 2020-02-07
 */
@Data
@ToString
@Entity
@Table(name = "advertisement_basic")
public class AdvertisementBasic {
    @Id
    @Column(name = "advertisementid")
    private int advertisementid;
    @Column(name = "advertisementname")
    private String advertisementname;

    @OneToOne
    @JoinColumn(name="advertisementclassifyid")
    private AdvertisementClassify advertisementclassify;

    @Column(name = "phonepicture")
    private String phonepicture;
    @Column(name = "phoneadvertisementurl")
    private String phoneadvertisementurl;
    @Column(name = "pcpicture")
    private String pcpicture;
    @Column(name = "pcurl")
    private String pcurl;
    @Column(name = "desced")
    private String desced;
    @Column(name = "sort")
    private String sort;
}
