package com.company.xunwu.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import java.util.Date;

/**
 * 房屋
 * @author youyusong
 * @date 2018/9/6
 */
@Data
@TableName(value = "house")
public class House {

    private Long id;

    private String title;

    private Long adminId;

    private int price;

    private int area;

    private int room;

    private int parlour;

    private int bathroom;

    private int floor;

    private int totalFloor;

    private int watchTimes;

    private int buildYear;

    private int status;

    private Date createTime;

    private Date lastUpdateTime;

    private String cityEnName;

    private String regionEnName;

    private String street;

    private String district;

    private int direction;

    private String cover;

    private int distanceToSubway;

}
