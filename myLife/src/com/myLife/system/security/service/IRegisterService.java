package com.myLife.system.security.service;


import javax.servlet.http.HttpServletRequest;

import com.myLife.core.service.ICoreService;
import com.myLife.system.security.entity.User;

public interface IRegisterService extends ICoreService<User, String> {

	/**
	 * ������֤��
	 * @param uEmail
	 * @param request
	 * @return 
	 * @author HuYang
	 * @date 2016��11��4�� ����4:23:18
	 */
	public String sendEmail(String uEmail, HttpServletRequest request);
	
	/**
	 * ע���û�
	 * @param user
	 * @param vNumber
	 * @param request
	 * @return 
	 * @author HuYang
	 * @date 2016��11��4�� ����4:23:35
	 */
	public String addUser(User user, String vNumber, HttpServletRequest request);
	
}
