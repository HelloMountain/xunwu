package com.company.xunwu.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SubwayDTO {


    private long id;
    private String name;

    @JsonProperty(value = "city_en_name")
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
