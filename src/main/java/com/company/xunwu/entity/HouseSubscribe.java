package com.company.xunwu.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/**
 * 预约看房实体类
 * @author youyusong
 * @date 2018/9/7
 */
@Data
@TableName(value = "house_subscribe")
public class HouseSubscribe {

    private Long id;

    private Long houseId;

    private Long userId;

    private Long adminId;

    /**
     * 预约状态 1-加入待看清单 2-已预约看房时间 3-看房完成
     */
    private int status;

    private Date createTime;

    private Date lastUpdateTime;

    private Date orderTime;

    private String telephone;

    /**
     * 踩坑 desc为MySQL保留字段 需要加转义
     */
//    @Column(name = "`desc`")
    private String desc;

}
