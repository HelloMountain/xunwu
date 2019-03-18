package com.company.xunwu.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;


/**
 * 房屋图片
 * @author youyusong
 * @date 2018/9/6
 */
@Data
@TableName(value = "house_picture")
public class HousePicture {

    private Long id;

    private Long houseId;

    private String path;

    private String cdnPrefix;

    private int width;

    private int height;

    private String location;

}
