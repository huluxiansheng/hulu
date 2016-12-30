package com.myLife.system.component.email;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.Properties;
import java.util.ResourceBundle;

import javax.mail.Address;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
/**
 * 邮件工具
 * @author HuYang 
 * @date 2016年11月4日 下午4:53:16
 */
public class JavaMail {
	
	/** 消息对象 **/
	private MimeMessage message;
	/** 邮件环境配置对象 **/
	private Session session;
	/** 邮件服务器地址 **/
	private String mailHost;
	/** 邮件服务器端口 **/
	private String mailPort;
	/** 邮件服务器账号 **/
	private String userName;
	/** 邮件服务器密码 **/
	private String password;
	
	/**
	 * 构造方法
	 *  
	 * @author HuYang
	 * @date 2016年8月3日 下午6:05:01
	 */
	public JavaMail(){
		initMail(false);
	}
	
	/**
	 * 有参构造方法
	 * @param debug 是否开启调试
	 * @author HuYang
	 * @date 2016年8月3日 下午6:05:35
	 */
	public JavaMail(boolean debug){
		initMail(debug);
	}
	
	/**
	 * 初始化邮件服务器
	 * @param debug 是否开启调试
	 * @author HuYang
	 * @date 2016年8月1日 上午11:36:54
	 */
	private void initMail(boolean debug){
		Properties prop = new Properties();
		try {
			InputStream in = this.getClass().getResourceAsStream("../../../../../config/javamail.properties");
			prop.load(in);
			this.userName = prop.getProperty("mail.sender.userName");
			this.password = prop.getProperty("mail.sender.password");
		} catch (IOException e) {
			e.printStackTrace();
		}
		session = Session.getInstance(prop, new MyAuthenticator(userName, password));
		session.setDebug(debug);
		message = new MimeMessage(session);
	}
	
	/**
	 * 发送邮件 
	 * @param subject 邮件主题
	 * @param sendHtml 邮件内容
	 * @param receiveUser 邮件地址
	 * @author HuYang
	 * @date 2016年8月1日 上午11:43:17
	 */
	public void doSendMail(String subject, String sendHtml, String receiveUser){
		
		try {
			//发送人地址
			Address fromAddress = new InternetAddress(this.userName,"胡红阳");
			//收件地址
			Address toAddress = new InternetAddress(receiveUser);
			
			message.setFrom(fromAddress);
			message.setSubject(subject);
			message.setContent(sendHtml, "text/html;charset=utf-8");
			message.setSentDate(new Date());
			message.addRecipient(Message.RecipientType.TO, toAddress);
			Transport.send(message);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args){
		
		JavaMail jm = new JavaMail(true);
		jm.doSendMail("测试！", "测试。", "2407414436@qq.com");
		
		
	}
}
