package com.myLife.core.component.email;

import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;

public class MyAuthenticator extends Authenticator {
	
	private String userName;
	
	private String password;
	
	public MyAuthenticator(String userName, String password){
		this.userName = userName;
		this.password = password;
	}
	
	public PasswordAuthentication getPasswordAuthentication(){
		return new PasswordAuthentication(userName, password);
	}

}
