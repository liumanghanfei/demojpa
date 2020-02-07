package com.example.demojap.server.impl;

import com.example.demojap.dao.AdvertisementClassifyDao;
import com.example.demojap.dao.base.GenericDao;
import com.example.demojap.entity.AdvertisementClassify;
import com.example.demojap.server.AdvertisementClassifyService;
import com.example.demojap.server.base.impl.GenericServiceImpl;
import com.example.demojap.utils.sql.Hql;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * AdvertisementClassifyServiceImpl
 *
 * @author yangy
 * @date 2020-02-07
 */
@Service
public class AdvertisementClassifyServiceImpl extends GenericServiceImpl<AdvertisementClassify> implements AdvertisementClassifyService {
    @Override
    protected GenericDao<AdvertisementClassify> getGenericDao() {
        return null;
    }
    @Autowired
    private AdvertisementClassifyDao advertisementClassifyDao;
    @Override
    public List<AdvertisementClassify> listAdvertisementClassifies() {

        List<AdvertisementClassify> search = advertisementClassifyDao.search(new Hql());

        return search;
    }
}
