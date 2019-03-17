package com.company.xunwu.service;

import com.company.xunwu.base.ServiceMultiResult;
import com.company.xunwu.model.SubwayDTO;
import org.springframework.stereotype.Service;

@Service
public interface SubwayService {

    ServiceMultiResult<SubwayDTO> findByCityName(String cityName);
}
