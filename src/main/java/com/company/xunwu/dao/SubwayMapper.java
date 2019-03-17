package com.company.xunwu.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.company.xunwu.entity.Subway;
import org.springframework.stereotype.Repository;

@Repository
public interface SubwayMapper extends BaseMapper<Subway> {

    Subway findByCityName();
}
