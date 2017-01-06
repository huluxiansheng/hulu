package com.myLife.system.security.service.impl;


import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myLife.core.component.email.JavaMail;
import com.myLife.core.dao.ICoreDao;
import com.myLife.core.service.impl.CoreServiceImpl;
import com.myLife.system.security.dao.IUserDao;
import com.myLife.system.security.entity.User;
import com.myLife.system.security.service.IRegisterService;
import com.myLife.tools.EncryptionTool;
import com.myLife.tools.SystemUtil;

@Service
public class RegisterServiceImpl extends CoreServiceImpl<User, String> implements IRegisterService {
	
	@Autowired
	private JavaMail jm;
	@Autowired
	private IUserDao userDao;
	
	@Override
	public String sendEmail(String userEmail, HttpServletRequest request) {
		
		String vNumber = SystemUtil.ValidateNumber();
		String sendMessage = "验证码：<b>"+vNumber+"</b>";
		jm.doSendMail("注册验证码", sendMessage, userEmail);
		request.getSession().setAttribute("vnum", EncryptionTool.SHA(vNumber));
		return null;
	}

	/* (non-Javadoc)
	 * @see com.myLife.core.service.impl.CoreServiceImpl#getDao()
	 */
	@Override
	protected ICoreDao getDao() {
		return userDao;
	}

	/* (non-Javadoc)
	 * @see com.myLife.system.security.service.IRegisterService#addUser(com.myLife.system.security.entity.User, java.lang.String)
	 */
	@Override
	public String addUser(User user, String vNumber, HttpServletRequest request) {
		String vnum1 = EncryptionTool.SHA(vNumber);
		String vnum2 = (String) request.getSession().getAttribute("vnum");
		if(vnum2 == null || !vnum2.equals(vnum1)){
			return "验证码错误！";
		}
		user.setUserPassword(EncryptionTool.MD5(user.getUserPassword()));
		userDao.insert(user);
		return null;
	}


}
