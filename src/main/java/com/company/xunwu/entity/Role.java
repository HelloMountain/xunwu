package com.company.xunwu.entity;


import com.baomidou.mybatisplus.annotation.TableName;

@TableName(value = "role")
public class Role {

    private long id;
    private long userId;
    private String name;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
