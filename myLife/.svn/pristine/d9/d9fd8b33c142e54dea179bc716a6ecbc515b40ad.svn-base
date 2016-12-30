package com.myLife.core.service.impl;

import java.io.Serializable;
import java.util.List;

import com.myLife.core.dao.ICoreDao;
import com.myLife.core.service.ICoreService;

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

	/* (non-Javadoc)
	 * @see com.myLife.core.service.ICoreService#selectEntitys(java.lang.Object)
	 */
	@Override
	public List<T> selectEntitys(T o) {
		return getDao().findList(o);
	}

	/* (non-Javadoc)
	 * @see com.myLife.core.service.ICoreService#updateEntity(java.lang.Object)
	 */
	@Override
	public int updateEntity(T o) {
		// TODO Auto-generated method stub
		return 0;
	}

	/* (non-Javadoc)
	 * @see com.myLife.core.service.ICoreService#deleteById(java.io.Serializable)
	 */
	@Override
	public int deleteById(int id) {
		return getDao().deleteById(id);
	}

	/* (non-Javadoc)
	 * @see com.myLife.core.service.ICoreService#addEntity(java.lang.Object)
	 */
	@Override
	public int addEntity(T o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
