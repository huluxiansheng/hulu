package com.myLife.business.module.base.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.myLife.business.module.base.dao.MenuTypeMapper;
import com.myLife.business.module.base.dao.model.MenuType;
import com.myLife.business.module.base.service.IMenuTypeService;
import com.myLife.core.base.dao.ICoreDao;
import com.myLife.core.base.service.impl.CoreServiceImpl;

public class MenuTypeServiceImpl extends CoreServiceImpl<MenuType, Integer> implements IMenuTypeService{
	
	@Autowired
	private MenuTypeMapper menuTypeDao;
	
	@Override
	protected ICoreDao<MenuType, Integer> getDao() {
		// TODO Auto-generated method stub
		return menuTypeDao;
	}

}
