package com.myLife.tools;

import javax.servlet.http.HttpServletRequest;
import com.myLife.system.constants.Constants;

public class SystemUtil {

	/**
	 * �ж��Ƿ��½
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
	 * ���������֤��
	 * @return 
	 * @author HuYang
	 * @date 2016��8��13�� ����12:35:11
	 */
	public static String ValidateNumber(){
		Integer num = (int)(Math.random()*1000000);
		return num.toString();
	}
	
	
	
	public static void main(String[] args){
		
		System.out.println(ValidateNumber());
		
	}
	
	
	
	
	
	
}
