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
 * �ʼ�����
 * @author HuYang 
 * @date 2016��11��4�� ����4:53:16
 */
public class JavaMail {
	
	/** ��Ϣ���� **/
	private MimeMessage message;
	/** �ʼ��������ö��� **/
	private Session session;
	/** �ʼ���������ַ **/
	private String mailHost;
	/** �ʼ��������˿� **/
	private String mailPort;
	/** �ʼ��������˺� **/
	private String userName;
	/** �ʼ����������� **/
	private String password;
	
	/**
	 * ���췽��
	 *  
	 * @author HuYang
	 * @date 2016��8��3�� ����6:05:01
	 */
	public JavaMail(){
		initMail(false);
	}
	
	/**
	 * �вι��췽��
	 * @param debug �Ƿ�������
	 * @author HuYang
	 * @date 2016��8��3�� ����6:05:35
	 */
	public JavaMail(boolean debug){
		initMail(debug);
	}
	
	/**
	 * ��ʼ���ʼ�������
	 * @param debug �Ƿ�������
	 * @author HuYang
	 * @date 2016��8��1�� ����11:36:54
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
	 * �����ʼ� 
	 * @param subject �ʼ�����
	 * @param sendHtml �ʼ�����
	 * @param receiveUser �ʼ���ַ
	 * @author HuYang
	 * @date 2016��8��1�� ����11:43:17
	 */
	public void doSendMail(String subject, String sendHtml, String receiveUser){
		
		try {
			//�����˵�ַ
			Address fromAddress = new InternetAddress(this.userName,"������");
			//�ռ���ַ
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
		jm.doSendMail("���ԣ�", "���ԡ�", "2407414436@qq.com");
		
		
	}
}
