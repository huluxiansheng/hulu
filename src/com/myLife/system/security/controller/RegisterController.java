/**
 * 
 */
package com.myLife.system.security.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.myLife.system.security.entity.User;
import com.myLife.system.security.service.IRegisterService;



/**
 * ע�������
 * @author HuYang 
 * @date 2016��8��1�� ����3:21:00
 */
@Controller
public class RegisterController {
	

	@Autowired
	private IRegisterService registService;

	/**
	 * ��ת��ע��ҳ��
	 * @return
	 * @author HuYang
	 * @date 2016��8��1�� ����11:26:34
	 */
	@RequestMapping("/toRegisterPage")
	public String toRegisterPage(){
		return "security/register";
	}
	
	/**
	 * ������֤��
	 * @author HuYang
	 * @date 2016��8��1�� ����11:18:54
	 */
	@RequestMapping("/toSendVerifictionCode")
	public void toSendVerificationCode(HttpServletRequest request, String userEmail){
		registService.sendEmail(userEmail,request);
	}
	
	/**
	 * ע���û�
	 * @param user
	 * @param vNumber 
	 * @author HuYang
	 * @return 
	 * @date 2016��8��22�� ����9:56:22
	 */
	@RequestMapping("/registUser")
	public @ResponseBody ModelAndView addUser(User user,String verifictionCode, HttpServletRequest request){
		Map<String, Object> map = new HashMap<String, Object>();
		String message = null;
		message = registService.addUser(user, verifictionCode, request);
		map.put("message", message);
		return new ModelAndView("security/registSuccess",map);		
	}
	
	/**
	 * ��ѯ�û��б�
	 * @param user
	 * @return 
	 * @author HuYang
	 * @date 2016��11��8�� ����1:08:21
	 */
	@RequestMapping("/findUserList")
	public @ResponseBody List<User> findUserList(User user){
		List<User> uL= this.registService.selectEntitys(user);
		return uL;
	}
	
	/**
	 * ����IDɾ���û�
	 * @param userId 
	 * @author HuYang
	 * @date 2016��11��8�� ����6:51:41
	 */
	@RequestMapping("/deleteUser")
	public String deleteUser(int userId){
		registService.deleteById(userId);
		return "security/registSuccess";
	}
	
	@RequestMapping("/putSession")
	public @ResponseBody Map<String, Object> putSession(HttpServletRequest request){
		String test = request.getParameter("test");
		request.getSession().setAttribute("testSession", test);
		request.getSession().setMaxInactiveInterval(300);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("testSession", test);
		return map;
	}
	
	@RequestMapping("/getSession")
	public @ResponseBody Map<String, Object> getSession(HttpServletRequest request){
		String test = (String) request.getSession().getAttribute("testSession");
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("testSession", test);
		return map;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
