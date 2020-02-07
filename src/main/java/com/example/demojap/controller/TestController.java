package com.example.demojap.controller;

import com.example.demojap.dto.AdvertisementClassifyDto;
import com.example.demojap.entity.AdvertisementClassify;
import com.example.demojap.server.AdvertisementClassifyService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * TestController
 *
 * @author yangy
 * @date 2020-02-07
 */
@Controller
@RequestMapping(value = "/api")
public class TestController {

    @Autowired
    private AdvertisementClassifyService advertisementClassifyService;


    @RequestMapping(value = "test", method = RequestMethod.POST, produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public List<AdvertisementClassifyDto> test(){
        List<AdvertisementClassify> advertisementClassifyList = advertisementClassifyService.listAdvertisementClassifies();
        List<AdvertisementClassifyDto> advertisementClassifyDtos = new ArrayList<>();
        AdvertisementClassifyDto advertisementClassifyDto;
        for (AdvertisementClassify advertisementClassify : advertisementClassifyList) {
            advertisementClassifyDto = new AdvertisementClassifyDto();
            BeanUtils.copyProperties(advertisementClassify, advertisementClassifyDto);
            advertisementClassifyDto.setAdvertisementBasicId(advertisementClassify.getAdvertisementBasic().getAdvertisementid());
            advertisementClassifyDto.setAdvertisementclassifyid(advertisementClassify.getAdvertisementclassifyid());
            advertisementClassifyDtos.add(advertisementClassifyDto);
        }

        return advertisementClassifyDtos;
    }

}
