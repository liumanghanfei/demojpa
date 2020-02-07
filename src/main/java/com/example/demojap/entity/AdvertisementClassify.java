package com.example.demojap.entity;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import java.util.Objects;

/**
 * AdvertisementClassify
 *
 * @author yangy
 * @date 2020-02-07
 */
@Data
@ToString
@Entity
@Table(name = "advertisement_classify")
public class AdvertisementClassify {
    @Id
    @Column(name = "advertisementclassifyid")
    private int advertisementclassifyid;
    @Column(name = "advertisementclassify")
    private String advertisementclassify;
    @Column(name = "desced")
    private String desced;
    @Column(name = "sort")
    private String sort;

    @Column(name = "showflage")
    private String showflage;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy="advertisementclassify")
    private AdvertisementBasic advertisementBasic;



}
