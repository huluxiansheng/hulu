package com.myLife.business.module.collect.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.ModelAndView;

import com.myLife.system.security.dao.IUserDao;
import com.myLife.system.security.entity.User;

/**
 * 金额录入
 * @author HuYang
 * @date 2017年5月4日 下午8:56:11
 */
@Controller("/inputMoney")
public class InputMoney {

	private IUserDao userDao;
	
	@RequestMapping("/main")
	public ModelAndView index(HttpServletRequest request){
		System.out.println("已经通过");
		request.getSession().setAttribute("userName", "逗你玩");
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("name", "Hy");
		map.put("age", 23);
		User user = userDao.findById(1);
		map.put("user", user);
		map.put("session", request.getSession().getAttribute("userName"));
		ModelAndView model = new ModelAndView("main",map);
		return model;
	} 
}
