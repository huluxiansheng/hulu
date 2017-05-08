package com.myLife.business.module.collect.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.myLife.business.module.base.dao.MenuTypeMapper;
import com.myLife.business.module.base.dao.model.MenuType;
import com.myLife.business.module.collect.dao.model.Spending;

/**
 * 
 * @ClassName: MainController
 * @Description: TODO
 * @author HuYang
 * @date 2017年5月8日 下午2:36:05
 */
@Controller
@RequestMapping("/main")
public class MainController {

	@Autowired
	private MenuTypeMapper menuTypeDao;
	
	/**
	 * 
	 * @Description: 前往主页
	 * @author HuYang
	 * @date 2017年5月8日 下午2:42:49
	 */
	@RequestMapping("/toMain")
	public String index(ModelMap model){
		List<MenuType> mtList = menuTypeDao.selectEntityListByRecord(null);
		model.put("mtList", mtList);
		return "main";
	} 
	
	/**
	 * 
	 * @Description: 添加消费
	 * @author HuYang
	 * @date 2017年5月8日 下午2:42:53
	 */
	public void insertSpending(Spending spending){
		
	}
}
