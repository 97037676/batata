package com.batata.online.user;

/**
 * 用户信息
 * 
 * @author nn.Zhang
 *
 */
public class UserInfo {
	/**
	 * 用户名
	 */
	private String userName;

	/**
	 * 用户ID
	 */
	private String userId;

	/**
	 * 00: 临时用户
	 */
	private String userType;

	/**
	 * 是否在线表单管理员
	 */
	private String isManager;

	/**
	 * 所属群组
	 */
	private String userGroup;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public String getIsManager() {
		return isManager;
	}

	public void setIsManager(String isManager) {
		this.isManager = isManager;
	}

	public String getUserGroup() {
		return userGroup;
	}

	public void setUserGroup(String userGroup) {
		this.userGroup = userGroup;
	}

}
