package com.myLife.system.security.service;


import javax.servlet.http.HttpServletRequest;

import com.myLife.core.base.service.ICoreService;
import com.myLife.system.security.dao.model.User;

public interface IRegisterService extends ICoreService<User, Integer> {

	/**
	 * 发送验证码
	 * @param uEmail
	 * @param request
	 * @return 
	 * @author HuYang
	 * @date 2016年11月4日 下午4:23:18
	 */
	public String sendEmail(String uEmail, HttpServletRequest request);
	
	/**
	 * 注册用户
	 * @param user
	 * @param vNumber
	 * @param request
	 * @return 
	 * @author HuYang
	 * @date 2016年11月4日 下午4:23:35
	 */
	public String addUser(User user, String vNumber, HttpServletRequest request);
	
}
