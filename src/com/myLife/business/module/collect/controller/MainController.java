package com.myLife.business.module.collect.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.myLife.system.security.dao.UserMapper;
import com.myLife.system.security.dao.model.User;

/**
 * ���¼��
 * @author HuYang
 * @date 2017��5��4�� ����8:56:11
 */
@Controller
@RequestMapping("/main")
public class MainController {

	@Autowired
	private UserMapper userDao;
	
	@RequestMapping("/toMain")
	public ModelAndView index(HttpServletRequest request){
		System.out.println("�Ѿ�ͨ��");
		request.getSession().setAttribute("userName", "������");
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("name", "Hy");
		map.put("age", 23);
		User user = userDao.selectByPrimaryKey(1);
		map.put("user", user);
		map.put("session", request.getSession().getAttribute("userName"));
		ModelAndView model = new ModelAndView("/main",map);
		return model;
	} 
}
