package com.company.xunwu.service.Impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.company.xunwu.base.ServiceMultiResult;
import com.company.xunwu.dao.SupportAddressMapper;
import com.company.xunwu.entity.SupportAddress;
import com.company.xunwu.model.SupportAddressDTO;
import com.company.xunwu.service.SupportAddressService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SupportAddressServiceImpl implements SupportAddressService {

    @Autowired
    private SupportAddressMapper supportAddressMapper;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public ServiceMultiResult<SupportAddressDTO> findAllCities() {

        QueryWrapper<SupportAddress> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("level", SupportAddress.Level.CITY);
        List<SupportAddress> supportAddresses  = supportAddressMapper.selectList(queryWrapper);
        List<SupportAddressDTO> supportAddressDTOS = new ArrayList<>();
        for (SupportAddress s : supportAddresses) {
            supportAddressDTOS.add(modelMapper.map(s, SupportAddressDTO.class));
        }
        return new ServiceMultiResult<>(supportAddressDTOS.size(), supportAddressDTOS);
    }

    @Override
    public ServiceMultiResult<SupportAddressDTO> findReginsByBelongTo(String cityEnName) {
        QueryWrapper<SupportAddress> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("belong_to", cityEnName);
        List<SupportAddress> supportAddresses = supportAddressMapper.selectList(queryWrapper);
        List<SupportAddressDTO> supportAddressDTOS = new ArrayList<>();

        for (SupportAddress s:supportAddresses) {
            supportAddressDTOS.add(modelMapper.map(s, SupportAddressDTO.class));
        }

        return new ServiceMultiResult<>(supportAddressDTOS.size(), supportAddressDTOS);
    }
}
