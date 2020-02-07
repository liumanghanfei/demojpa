package com.example.demojap.server;

import com.example.demojap.entity.AdvertisementClassify;
import com.example.demojap.server.base.GenericService;

import java.util.List;

public interface AdvertisementClassifyService extends GenericService<AdvertisementClassify> {
    List<AdvertisementClassify> listAdvertisementClassifies();
}
