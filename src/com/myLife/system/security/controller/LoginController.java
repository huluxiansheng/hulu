package com.myLife.system.security.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.ModelAndView;

import com.myLife.system.security.dao.IUserDao;
import com.myLife.system.security.entity.User;

/**
 * 登陆控制器
 * @author HuYang 2016年6月1日 下午1:21:07
 *
 */
@Controller
public class LoginController {
	
	@Autowired
	private IUserDao userDao;
	

	
	/**
	 * 登陆验证
	 * @param request
	 * @return
	 */
	@RequestMapping("/toLogin")
	public ModelAndView toLogin(User user){
		
		List<User> userList = userDao.findList(user);
		
		return new ModelAndView();
	}
	
}
