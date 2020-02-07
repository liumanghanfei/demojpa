package com.example.demojap.dto;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;

/**
 * AdvertisementBasic
 *
 * @author yangy
 * @date 2020-02-07
 */
@Data
@ToString
public class AdvertisementBasicDto {
    private int advertisementid;
    private String advertisementname;
    private int advertisementclassifyId;
    private String phonepicture;
    private String phoneadvertisementurl;
    private String pcpicture;
    private String pcurl;
    private String desced;
    private String sort;
}
