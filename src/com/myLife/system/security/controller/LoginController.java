package com.myLife.system.security.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.ModelAndView;

import com.myLife.system.security.dao.UserMapper;
import com.myLife.system.security.dao.model.User;

/**
 * ��½������
 * @author HuYang 2016��6��1�� ����1:21:07
 *
 */
@Controller
public class LoginController {
	
	@Autowired
	private UserMapper userDao;
	

	
	/**
	 * ��½��֤
	 * @param request
	 * @return
	 */
	@RequestMapping("/toLogin")
	public ModelAndView toLogin(User user){
		
		User userList = userDao.selectByPrimaryKey(1);
		
		return new ModelAndView();
	}
	
}
