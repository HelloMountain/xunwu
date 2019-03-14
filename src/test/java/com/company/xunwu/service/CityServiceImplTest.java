package com.company.xunwu.service;

import com.company.xunwu.XunwuApplicationTests;
import com.company.xunwu.entity.City;
import com.company.xunwu.service.Impl.CityServiceImpl;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class CityServiceImplTest extends XunwuApplicationTests {

    @Autowired
    private CityServiceImpl cityService;
    @Test
    public void insert() {
        City city = new City("北京");
        cityService.insert(city);
    }
}