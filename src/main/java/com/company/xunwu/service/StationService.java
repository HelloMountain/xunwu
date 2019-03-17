package com.company.xunwu.service;

import com.company.xunwu.base.ServiceMultiResult;
import com.company.xunwu.model.StationDTO;
import org.springframework.stereotype.Service;

@Service
public interface StationService {

    ServiceMultiResult<StationDTO> getStation(String subwayId);
}
