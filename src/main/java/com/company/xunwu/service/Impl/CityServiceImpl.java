package com.company.xunwu.service.Impl;

import com.company.xunwu.dao.CityMapper;
import com.company.xunwu.entity.City;
import com.company.xunwu.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CityServiceImpl implements CityService {

    @Autowired
    private CityMapper cityMapper;

    @Override
    public void insert(City city) {
        System.out.println(city.getName());
        cityMapper.insert(city);
    }
}
