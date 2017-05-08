package com.myLife.business.module.collect.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myLife.business.module.collect.dao.SpendingMapper;
import com.myLife.business.module.collect.dao.model.Spending;
import com.myLife.business.module.collect.service.ISpendingService;
import com.myLife.core.base.dao.ICoreDao;
import com.myLife.core.base.service.impl.CoreServiceImpl;

@Service
public class SpendingServiceImpl extends CoreServiceImpl<Spending, Integer> implements ISpendingService{

	@Autowired
	private SpendingMapper spendingDao;
	
	@Override
	protected ICoreDao<Spending, Integer> getDao() {
		// TODO Auto-generated method stub
		return spendingDao;
	}

}
