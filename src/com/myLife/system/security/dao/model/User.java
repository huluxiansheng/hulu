package com.myLife.system.security.dao.model;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;
/**
 * 用户实体
 * @author HuYang 
 * @date 2016年11月7日 下午2:16:25
 */
public class User {

	/**
	 * 用户ID
	 */
	private int userId;
	/**
	 * 用户昵称
	 */
	private String userNickName;
	/**
	 * 用户名称
	 */
	private String userName;
	/**
	 * 用户手机
	 */
	private String userPhone;
	/**
	 * 用户邮箱
	 */
	private String userEmail;
	/**
	 * 用户密码
	 */
	private String userPass;
	/**
	 * 用户真实姓名
	 */
	private String userTrueName;
	/**
	 * 用户创建时间
	 */
	@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
	private Date createTime;
	
	/**
	 * 获取用户ID
	 * @return 
	 * @author HuYang
	 * @date 2016年11月8日 下午3:15:07
	 */
	public int getUserId() {
		return userId;
	}
	
	/**
	 * 设置用户ID
	 * @param userId 
	 * @author HuYang
	 * @date 2016年11月8日 下午3:15:26
	 */
	public void setUserId(int userId) {
		this.userId = userId;
	}
	
	/**
	 * 获取用户昵称
	 * @return 
	 * @author HuYang
	 * @date 2016年11月8日 下午3:15:34
	 */
	public String getUserNickName() {
		return userNickName;
	}
	
	/**
	 * 设置用户昵称
	 * @param userNickName 
	 * @author HuYang
	 * @date 2016年11月8日 下午3:15:47
	 */
	public void setUserNickName(String userNickName) {
		this.userNickName = userNickName;
	}
	
	/**
	 * 获取用户名
	 * @return 
	 * @author HuYang
	 * @date 2016年11月8日 下午3:16:09
	 */
	public String getUserName() {
		return userName;
	}
	
	/**
	 * 设置用户名
	 * @param userName 
	 * @author HuYang
	 * @date 2016年11月8日 下午3:16:21
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	/**
	 * 获取用户电话
	 * @return 
	 * @author HuYang
	 * @date 2016年11月8日 下午3:16:30
	 */
	public String getUserPhone() {
		return userPhone;
	}
	
	/**
	 * 设置用户电话
	 * @param userPhone 
	 * @author HuYang
	 * @date 2016年11月8日 下午3:16:41
	 */
	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}
	
	/**
	 * 获取用户邮箱
	 * @return 
	 * @author HuYang
	 * @date 2016年11月8日 下午3:16:49
	 */
	public String getUserEmail() {
		return userEmail;
	}
	
	/**
	 * 设置用户邮箱
	 * @param userEmail 
	 * @author HuYang
	 * @date 2016年11月8日 下午3:17:03
	 */
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	
	/**
	 * 获取用户密码
	 * @return 
	 * @author HuYang
	 * @date 2016年11月8日 下午3:17:15
	 */
	public String getUserPass() {
		return userPass;
	}
	
	/**
	 * 设置用户密码
	 * @param userPass 
	 * @author HuYang
	 * @date 2016年11月8日 下午3:17:32
	 */
	public void setUserPass(String userPass) {
		this.userPass = userPass;
	}
	
	/**
	 * 获取用户真实姓名
	 * @return 
	 * @author HuYang
	 * @date 2016年11月8日 下午3:17:41
	 */
	public String getUserTrueName() {
		return userTrueName;
	}
	
	/**
	 * 获取用户真实姓名
	 * @param userTrueName 
	 * @author HuYang
	 * @date 2016年11月8日 下午3:17:59
	 */
	public void setUserTrueName(String userTrueName) {
		this.userTrueName = userTrueName;
	}
	
	/**
	 * 获取创建时间
	 * @return 
	 * @author HuYang
	 * @date 2016年11月8日 下午3:18:10
	 */
	public Date getCreateTime() {
		return createTime;
	}
	
	/**
	 * 设置创建时间
	 * @param createTime 
	 * @author HuYang
	 * @date 2016年11月8日 下午3:18:23
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
