package com.myLife.business.module.collect.dao.model;

public class Menu {
    private Integer mid;

    private String mname;

    private Integer uid;

    private Boolean iscomm;

    public Integer getMid() {
        return mid;
    }

    public void setMid(Integer mid) {
        this.mid = mid;
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname == null ? null : mname.trim();
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Boolean getIscomm() {
        return iscomm;
    }

    public void setIscomm(Boolean iscomm) {
        this.iscomm = iscomm;
    }
}