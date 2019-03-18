package com.company.xunwu.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * 房屋详情
 * @author youyusong
 * @date 2018/9/6
 */
@Data
@TableName(value = "house_detail")
public class HouseDetail {

    private Long id;

    private Long houseId;

    private String description;

    private String layoutDesc;

    private String traffic;

    private String roundService;

    private int rentWay;

    private String detailAddress;

    private Long subwayLineId;

    private Long subwayStationId;

    private String subwayLineName;

    private String subwayStationName;

}
