package com.myLife.business.module.collect.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.myLife.business.module.base.dao.model.MenuType;
import com.myLife.business.module.base.service.IMenuTypeService;
import com.myLife.business.module.collect.dao.model.Spending;
import com.myLife.business.module.collect.service.ISpendingService;

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
	private IMenuTypeService menuTypeService;
	
	@Autowired
	private ISpendingService spendingService;
	
	/**
	 * 
	 * @Description: 前往主页
	 * @author HuYang
	 * @date 2017年5月8日 下午2:42:49
	 */
	@RequestMapping("/toMain")
	public String index(ModelMap model){
		List<MenuType> mtList = menuTypeService.selectEntityListByRecord(null);
		model.put("mtList", mtList);
		return "main";
	} 
	
	/**
	 * 
	 * @Description: 添加消费
	 * @author HuYang
	 * @date 2017年5月8日 下午2:42:53
	 */
	@RequestMapping("/insertSpend")
	public @ResponseBody Map<String, Object> insertSpending(Spending spending){
		Map<String, Object> map = new HashMap<String, Object>();
		spending.setTypeName(menuTypeService.selectByPrimaryKey(spending.getTypeId()).getTypeName());
		spending.setCreateTime(new Date());
		spendingService.insert(spending);
		return map;
	}
}
