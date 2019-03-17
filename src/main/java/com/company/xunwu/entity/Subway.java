package com.company.xunwu.entity;

import com.baomidou.mybatisplus.annotation.TableName;

@TableName(value = "subway")
public class Subway {

    private long id;
    private String name;
    private String cityEnName;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCityEnName() {
        return cityEnName;
    }

    public void setCityEnName(String cityEnName) {
        this.cityEnName = cityEnName;
    }
}
