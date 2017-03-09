package com.myLife.core.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.SessionCookieConfig;

public class ServletContextListener implements javax.servlet.ServletContextListener {

	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		ServletContext sc = sce.getServletContext();
		SessionCookieConfig scc = sc.getSessionCookieConfig();
//		scc.setPath("/");
		scc.setName("MYLIFEID");
		scc.setSecure(false);
		
	}


}
