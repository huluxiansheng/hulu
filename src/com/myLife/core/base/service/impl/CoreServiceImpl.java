package com.myLife.core.base.service.impl;

import java.io.Serializable;
import java.util.List;

import com.myLife.core.base.dao.ICoreDao;
import com.myLife.core.base.service.ICoreService;
import com.myLife.system.security.dao.model.User;

/**
 * @author HuYang 
 * @date 2016年11月9日 上午10:29:40
 */
public abstract class CoreServiceImpl<T, PK extends Serializable> implements ICoreService<T, PK> {

	/**
	 * 获取DAO层实例
	 * @return 
	 * @author HuYang
	 * @date 2016年11月11日 下午2:02:10
	 */
	abstract protected ICoreDao<T, PK> getDao();

	@Override
	public int deleteByPrimaryKey(PK entityId) {
		// TODO Auto-generated method stub
		return getDao().deleteByPrimaryKey(entityId);
	}

	@Override
	public int insert(T record) {
		// TODO Auto-generated method stub
		return getDao().insert(record);
	}

	@Override
	public int insertSelective(T record) {
		// TODO Auto-generated method stub
		return getDao().insertSelective(record);
	}

	@Override
	public T selectByPrimaryKey(PK entityId) {
		// TODO Auto-generated method stub
		return getDao().selectByPrimaryKey(entityId);
	}

	@Override
	public int updateByPrimaryKeySelective(T record) {
		// TODO Auto-generated method stub
		return getDao().updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(T record) {
		// TODO Auto-generated method stub
		return getDao().updateByPrimaryKey(record);
	}

	@Override
	public List<T> selectEntityListByRecord(T record) {
		// TODO Auto-generated method stub
		return getDao().selectEntityListByRecord(record);
	}
	


}
