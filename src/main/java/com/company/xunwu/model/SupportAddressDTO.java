package com.company.xunwu.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SupportAddressDTO {
//
//    //编号
//    private long id;
//
//    //上一级行政单位
//    private String belongTo;
//
//    //英语名称
//    private String enName;
//
//    //中文名称
//    private String cnName;
//
//    //行政级别
//    private String level;
//
//    //经度
//    private String baiduMapLng;
//
//    //纬度
//    private String baiduMapLat;
    private Long id;
//    @JsonProperty(value = "belong_to")
    private String belongTo;

//    @JsonProperty(value = "en_name")
    private String enName;

//    @JsonProperty(value = "cn_name")
    private String cnName;

    private String level;

    private Double baiduMapLongitude;

    private Double baiduMapLatitude;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBelongTo() {
        return belongTo;
    }

    public void setBelongTo(String belongTo) {
        this.belongTo = belongTo;
    }

    public String getEnName() {
        return enName;
    }

    public void setEnName(String enName) {
        this.enName = enName;
    }

    public String getCnName() {
        return cnName;
    }

    public void setCnName(String cnName) {
        this.cnName = cnName;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public Double getBaiduMapLongitude() {
        return baiduMapLongitude;
    }

    public void setBaiduMapLongitude(Double baiduMapLongitude) {
        this.baiduMapLongitude = baiduMapLongitude;
    }

    public Double getBaiduMapLatitude() {
        return baiduMapLatitude;
    }

    public void setBaiduMapLatitude(Double baiduMapLatitude) {
        this.baiduMapLatitude = baiduMapLatitude;
    }

    @Override
    public String toString() {
        return "SupportAddressDTO{" +
                "id=" + id +
                ", belongTo='" + belongTo + '\'' +
                ", enName='" + enName + '\'' +
                ", cnName='" + cnName + '\'' +
                ", level='" + level + '\'' +
                ", baiduMapLongitude=" + baiduMapLongitude +
                ", baiduMapLatitude=" + baiduMapLatitude +
                '}';
    }
}
