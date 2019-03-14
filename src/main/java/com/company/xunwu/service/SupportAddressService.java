package com.company.xunwu.service;

import com.company.xunwu.base.ServiceMultiResult;
import com.company.xunwu.model.SupportAddressDTO;
import org.springframework.stereotype.Service;


@Service
public interface SupportAddressService {

    ServiceMultiResult<SupportAddressDTO> findAllCities();
}
