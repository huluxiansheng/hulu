package com.myLife.core.base.service;

import java.io.Serializable;
import java.util.List;

/**
 * @author HuYang 
 * @date 2016年11月9日 上午10:04:12
 */
public interface ICoreService<T, PK extends Serializable> {

   public int deleteByPrimaryKey(PK entityId);

   public int insert(T record);

   public int insertSelective(T record);

   public T selectByPrimaryKey(PK entityId);

   public int updateByPrimaryKeySelective(T record);

   public int updateByPrimaryKey(T record);
	
   public List<T> selectEntityListByRecord(T record);
   
}
