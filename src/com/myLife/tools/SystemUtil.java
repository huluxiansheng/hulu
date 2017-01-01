package com.myLife.tools;

import javax.servlet.http.HttpServletRequest;
import com.myLife.system.constants.Constants;

public class SystemUtil {

	/**
	 * 判断是否登陆
	 * @param requset
	 * @return
	 */
	public static boolean isLogin(HttpServletRequest requset){
		if(requset.getSession().getAttribute(Constants.SESSION_USER_KEY) == null){
			return false;
		}
		return true;
	}
	
	/**
	 * 产生随机验证码
	 * @return 
	 * @author HuYang
	 * @date 2016年8月13日 上午12:35:11
	 */
	public static String ValidateNumber(){
		Integer num = (int)(Math.random()*1000000);
		return num.toString();
	}
	
	
	
	public static void main(String[] args){
		
		System.out.println(ValidateNumber());
		
	}
	
	
	
	
	
	
}
