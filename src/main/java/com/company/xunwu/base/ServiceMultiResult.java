package com.company.xunwu.base;


import java.io.Serializable;
import java.util.List;

/*
* 通用多结果Service返回模式
* */
public class ServiceMultiResult<T> implements Serializable {

    private int total;
    private List<T> t;

    public ServiceMultiResult(int total, List<T> t) {
        this.total = total;
        this.t = t;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public List<T> getT() {
        return t;
    }

    public void setT(List<T> t) {
        this.t = t;
    }

    @Override
    public String toString() {
        return "ServiceMultiResult{" +
                "total=" + total +
                ", t=" + t +
                '}';
    }
}
