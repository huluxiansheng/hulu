package com.myLife.core.interceptors;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.myLife.tools.SystemUtil;

public class CoreInterface implements HandlerInterceptor {

	//���������֮�����  
	@Override
	public void afterCompletion(HttpServletRequest request,
			HttpServletResponse response, Object object, Exception e)
			throws Exception {
		System.out.println("ҳ���ѽ������");
		// TODO Auto-generated method stub

	}

	//����֮�󣬽�����ͼ����֮ǰ����
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response,
			Object object, ModelAndView mv) throws Exception {
		System.out.println("post���ʣ�ҳ����ͼ����ǰ");
		// TODO Auto-generated method stub

	}

	//��ʵ�ʵ�����֮ǰ����  
	//����true�������ʽ����  
	//����false��ֹ��ʽ���� 
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response,
			Object object) throws Exception {
//		String ctx = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+request.getContextPath()+"/";
//		String url = request.getRequestURL().toString();
		System.out.println("����ǰ������");
		if(SystemUtil.isLogin(request)){
			return true;
		}else{
			
		}
		// TODO Auto-generated method stub
		return true;
	}

}
