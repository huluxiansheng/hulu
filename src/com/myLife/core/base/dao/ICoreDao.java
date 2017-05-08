package com.myLife.core.base.dao;

import java.io.Serializable;
import java.util.List;

public interface ICoreDao<T,PK extends Serializable> {

    int deleteByPrimaryKey(PK entityId);

    int insert(T record);

    int insertSelective(T record);

    T selectByPrimaryKey(PK entityId);

    int updateByPrimaryKeySelective(T record);

    int updateByPrimaryKey(T record);
	
    List<T> selectEntityListByRecord(T record);
}


