package com.myLife.business.module.collect.dao.model;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class Spending {
    private Integer spendId;

    private Double spendMoney;

    private Integer menuId;

    private Integer typeId;

    private String typeName;

    private Integer userId;

    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date createTime;

    public Integer getSpendId() {
        return spendId;
    }

    public void setSpendId(Integer spendId) {
        this.spendId = spendId;
    }

    public Double getSpendMoney() {
        return spendMoney;
    }

    public void setSpendMoney(Double spendMoney) {
        this.spendMoney = spendMoney;
    }

    public Integer getMenuId() {
        return menuId;
    }

    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName == null ? null : typeName.trim();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}