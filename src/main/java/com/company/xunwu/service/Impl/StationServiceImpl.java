package com.company.xunwu.service.Impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.company.xunwu.base.ServiceMultiResult;
import com.company.xunwu.dao.SubwayMapper;
import com.company.xunwu.dao.SubwayStationMapper;
import com.company.xunwu.entity.Station;
import com.company.xunwu.model.StationDTO;
import com.company.xunwu.service.StationService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;

import java.util.ArrayList;
import java.util.List;

@Service
public class StationServiceImpl implements StationService {

    @Autowired
    private SubwayStationMapper stationMapper;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public ServiceMultiResult<StationDTO> getStation(String subwayId) {
        QueryWrapper<Station> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("subway_id", subwayId);
        List<Station> stations = stationMapper.selectList(queryWrapper);
        List<StationDTO> stationDTOS = new ArrayList<>();

        for (Station s: stations) {
            stationDTOS.add(modelMapper.map(s, StationDTO.class));
        }
        return new ServiceMultiResult<>(stationDTOS.size(), stationDTOS);
    }
}
