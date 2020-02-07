package com.example.demojap.dto;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;

/**
 * AdvertisementClassify
 *
 * @author yangy
 * @date 2020-02-07
 */
@Data
@ToString
public class AdvertisementClassifyDto {
    private int advertisementclassifyid;
    private String advertisementclassify;
    private String desced;
    private String sort;
    private String showflage;
    private int advertisementBasicId;
}
