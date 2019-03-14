package com.company.xunwu;

import com.company.xunwu.entity.SupportAddress;
import com.company.xunwu.model.SupportAddressDTO;
import org.junit.Test;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

public class ModelMapperTest extends XunwuApplicationTests{

    @Autowired
    private ModelMapper modelMapper;

    @Test
    public void modelMapperTest(){
        SupportAddress supportAddress = new SupportAddress(1, "2", "xiaoming", "青山", SupportAddress.Level.CITY.toString(), "111", "222");
//        SupportAddressDTO supportAddressDTO = modelMapper.map(supportAddress, SupportAddressDTO.class);
        SupportAddressDTO supportAddressDTO = modelMapper.map(supportAddress, SupportAddressDTO.class);
        System.out.println(supportAddressDTO);


    }
}
