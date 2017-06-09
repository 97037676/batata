package com.batata.online.document.bean;

import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Transient;

import com.batata.online.form.bean.BaseFormCell;
import com.batata.online.user.UserInfo;

/**
 * 在线表单数据
 * 
 * @author nn.Zhang
 *
 */
public class OnlineForm {

	/**
	 * 创建人的信息
	 */
	private String userId;

	/**
	 * 创建时间
	 */
	private Date date;

	/**
	 * 用户信息
	 */
	@Transient
	private UserInfo createUser;

	/**
	 * 在线表格数据
	 */
	private List<BaseFormCell> forms;

	public UserInfo getCreateUser() {
		return createUser;
	}

	public void setCreateUser(UserInfo createUser) {
		this.createUser = createUser;
	}

	public List<BaseFormCell> getForms() {
		return forms;
	}

	public void setForms(List<BaseFormCell> forms) {
		this.forms = forms;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
}
