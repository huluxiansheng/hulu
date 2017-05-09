package com.myLife.system.security.dao.model;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;
/**
 * �û�ʵ��
 * @author HuYang 
 * @date 2016��11��7�� ����2:16:25
 */
public class User {

	/**
	 * �û�ID
	 */
	private int userId;
	/**
	 * �û��ǳ�
	 */
	private String userNickName;
	/**
	 * �û�����
	 */
	private String userName;
	/**
	 * �û��ֻ�
	 */
	private String userPhone;
	/**
	 * �û�����
	 */
	private String userEmail;
	/**
	 * �û�����
	 */
	private String userPass;
	/**
	 * �û���ʵ����
	 */
	private String userTrueName;
	/**
	 * �û�����ʱ��
	 */
	@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
	private Date createTime;
	
	/**
	 * ��ȡ�û�ID
	 * @return 
	 * @author HuYang
	 * @date 2016��11��8�� ����3:15:07
	 */
	public int getUserId() {
		return userId;
	}
	
	/**
	 * �����û�ID
	 * @param userId 
	 * @author HuYang
	 * @date 2016��11��8�� ����3:15:26
	 */
	public void setUserId(int userId) {
		this.userId = userId;
	}
	
	/**
	 * ��ȡ�û��ǳ�
	 * @return 
	 * @author HuYang
	 * @date 2016��11��8�� ����3:15:34
	 */
	public String getUserNickName() {
		return userNickName;
	}
	
	/**
	 * �����û��ǳ�
	 * @param userNickName 
	 * @author HuYang
	 * @date 2016��11��8�� ����3:15:47
	 */
	public void setUserNickName(String userNickName) {
		this.userNickName = userNickName;
	}
	
	/**
	 * ��ȡ�û���
	 * @return 
	 * @author HuYang
	 * @date 2016��11��8�� ����3:16:09
	 */
	public String getUserName() {
		return userName;
	}
	
	/**
	 * �����û���
	 * @param userName 
	 * @author HuYang
	 * @date 2016��11��8�� ����3:16:21
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	/**
	 * ��ȡ�û��绰
	 * @return 
	 * @author HuYang
	 * @date 2016��11��8�� ����3:16:30
	 */
	public String getUserPhone() {
		return userPhone;
	}
	
	/**
	 * �����û��绰
	 * @param userPhone 
	 * @author HuYang
	 * @date 2016��11��8�� ����3:16:41
	 */
	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}
	
	/**
	 * ��ȡ�û�����
	 * @return 
	 * @author HuYang
	 * @date 2016��11��8�� ����3:16:49
	 */
	public String getUserEmail() {
		return userEmail;
	}
	
	/**
	 * �����û�����
	 * @param userEmail 
	 * @author HuYang
	 * @date 2016��11��8�� ����3:17:03
	 */
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	
	/**
	 * ��ȡ�û�����
	 * @return 
	 * @author HuYang
	 * @date 2016��11��8�� ����3:17:15
	 */
	public String getUserPass() {
		return userPass;
	}
	
	/**
	 * �����û�����
	 * @param userPass 
	 * @author HuYang
	 * @date 2016��11��8�� ����3:17:32
	 */
	public void setUserPass(String userPass) {
		this.userPass = userPass;
	}
	
	/**
	 * ��ȡ�û���ʵ����
	 * @return 
	 * @author HuYang
	 * @date 2016��11��8�� ����3:17:41
	 */
	public String getUserTrueName() {
		return userTrueName;
	}
	
	/**
	 * ��ȡ�û���ʵ����
	 * @param userTrueName 
	 * @author HuYang
	 * @date 2016��11��8�� ����3:17:59
	 */
	public void setUserTrueName(String userTrueName) {
		this.userTrueName = userTrueName;
	}
	
	/**
	 * ��ȡ����ʱ��
	 * @return 
	 * @author HuYang
	 * @date 2016��11��8�� ����3:18:10
	 */
	public Date getCreateTime() {
		return createTime;
	}
	
	/**
	 * ���ô���ʱ��
	 * @param createTime 
	 * @author HuYang
	 * @date 2016��11��8�� ����3:18:23
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
