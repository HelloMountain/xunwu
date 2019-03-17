package com.company.xunwu.service.Impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.company.xunwu.base.ServiceMultiResult;
import com.company.xunwu.dao.SubwayMapper;
import com.company.xunwu.entity.Subway;
import com.company.xunwu.model.SubwayDTO;
import com.company.xunwu.service.SubwayService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SubwayServiceImpl implements SubwayService {


    @Autowired
    private SubwayMapper subwayMapper;

    @Autowired
    private ModelMapper modelMapper;
    @Override
    public ServiceMultiResult<SubwayDTO> findByCityName(String cityEnName) {
        QueryWrapper<Subway> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("city_en_name", cityEnName);
        List<Subway> subways = subwayMapper.selectList(queryWrapper);
        List<SubwayDTO> subwayDTOS = new ArrayList<>();
        for (Subway s: subways){
            subwayDTOS.add(modelMapper.map(s, SubwayDTO.class));
        }
        return new ServiceMultiResult<>(subwayDTOS.size(), subwayDTOS);
    }
}
