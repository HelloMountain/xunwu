package com.company.xunwu.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class StationDTO {

    private long id;

    @JsonProperty(value = "subway_id")
    private long subwayId;

    private String name;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getSubwayId() {
        return subwayId;
    }

    public void setSubwayId(long subwayId) {
        this.subwayId = subwayId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
