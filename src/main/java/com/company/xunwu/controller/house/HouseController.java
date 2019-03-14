package com.company.xunwu.controller.house;

import com.company.xunwu.base.ApiResponse;
import com.company.xunwu.base.ServiceMultiResult;
import com.company.xunwu.entity.City;
import com.company.xunwu.model.SupportAddressDTO;
import com.company.xunwu.service.SupportAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
public class HouseController {


    @Autowired
    private SupportAddressService supportAddressService;

    @GetMapping(value = "address/support/cities")
    @ResponseBody
    public ApiResponse getSupportCities(){
        ServiceMultiResult<SupportAddressDTO> result = supportAddressService.findAllCities();
        if (result.getTotal() == 0){
            return new ApiResponse().ofStatus(ApiResponse.Status.NOT_FOUND);
        }
        System.out.println(new ApiResponse().ofSuccess(result));
        return new ApiResponse().ofSuccess(result);
    }

    @GetMapping(value = "test")
    @ResponseBody
    public ApiResponse test(){
        City city = new City(1, "xiaoming");
        System.out.println(new ApiResponse().ofSuccess(city));
        return new ApiResponse().ofSuccess(city);
    }
}
