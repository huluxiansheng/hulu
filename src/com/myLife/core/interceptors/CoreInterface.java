package com.myLife.core.interceptors;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.myLife.tools.SystemUtil;

public class CoreInterface implements HandlerInterceptor {

	//解析完界面之后调用  
	@Override
	public void afterCompletion(HttpServletRequest request,
			HttpServletResponse response, Object object, Exception e)
			throws Exception {
		System.out.println("页面已解析完毕");
		// TODO Auto-generated method stub

	}

	//请求之后，解析视图界面之前调用
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response,
			Object object, ModelAndView mv) throws Exception {
		System.out.println("post访问，页面视图解析前");
		// TODO Auto-generated method stub

	}

	//做实际的请求之前调用  
	//返回true会接着链式调用  
	//返回false终止链式调用 
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response,
			Object object) throws Exception {
//		String ctx = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+request.getContextPath()+"/";
//		String url = request.getRequestURL().toString();
		System.out.println("访问前端拦截");
		if(SystemUtil.isLogin(request)){
			return true;
		}else{
			
		}
		// TODO Auto-generated method stub
		return true;
	}

}
