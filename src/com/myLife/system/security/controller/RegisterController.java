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
 * 注册控制器
 * @author HuYang 
 * @date 2016年8月1日 下午3:21:00
 */
@Controller
public class RegisterController {
	

	@Autowired
	private IRegisterService registService;

	/**
	 * 跳转到注册页面
	 * @return
	 * @author HuYang
	 * @date 2016年8月1日 下午11:26:34
	 */
	@RequestMapping("/toRegisterPage")
	public String toRegisterPage(){
		return "security/register";
	}
	
	/**
	 * 发送验证码
	 * @author HuYang
	 * @date 2016年8月1日 下午11:18:54
	 */
	@RequestMapping("/toSendVerifictionCode")
	public void toSendVerificationCode(HttpServletRequest request, String userEmail){
		registService.sendEmail(userEmail,request);
	}
	
	/**
	 * 注册用户
	 * @param user
	 * @param vNumber 
	 * @author HuYang
	 * @return 
	 * @date 2016年8月22日 上午9:56:22
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
	 * 查询用户列表
	 * @param user
	 * @return 
	 * @author HuYang
	 * @date 2016年11月8日 下午1:08:21
	 */
	@RequestMapping("/findUserList")
	public @ResponseBody List<User> findUserList(User user){
		List<User> uL= this.registService.selectEntitys(user);
		return uL;
	}
	
	/**
	 * 根据ID删除用户
	 * @param userId 
	 * @author HuYang
	 * @date 2016年11月8日 下午6:51:41
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
