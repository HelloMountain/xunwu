package com.company.xunwu.entity;

import com.baomidou.mybatisplus.annotation.TableName;

@TableName(value = "support_address")
public class SupportAddress {

    //编号
    private long id;

    //上一级行政单位
    private String belongTo;

    //英语名称
    private String enName;

    //中文名称
    private String cnName;

    //行政级别
    private String level;

    //经度
    private String baiduMapLng;

    //纬度
    private String baiduMapLat;

    public SupportAddress() {
    }

    public SupportAddress(long id, String belongTo, String enName, String cnName, String level, String baiduMapLng, String baiduMapLat) {
        this.id = id;
        this.belongTo = belongTo;
        this.enName = enName;
        this.cnName = cnName;
        this.level = level;
        this.baiduMapLng = baiduMapLng;
        this.baiduMapLat = baiduMapLat;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
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

    public String getBaiduMapLng() {
        return baiduMapLng;
    }

    public void setBaiduMapLng(String baiduMapLng) {
        this.baiduMapLng = baiduMapLng;
    }

    public String getBaiduMapLat() {
        return baiduMapLat;
    }

    public void setBaiduMapLat(String baiduMapLat) {
        this.baiduMapLat = baiduMapLat;
    }

    public enum Level {
        CITY("city"),
        REGION("region");

        private String value;
        Level(String value) {
            this.value = value;
        }

        public Level of(String value){
            for (Level level:Level.values()
                 ) {
                if (level.value.equals(value)){
                    return level;
                }
            }
            throw new IllegalArgumentException();
        }
    }
}
