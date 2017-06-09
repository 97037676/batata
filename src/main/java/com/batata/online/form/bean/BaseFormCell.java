package com.batata.online.form.bean;

import org.springframework.data.annotation.Id;

/**
 * 在线数据Base表单行信息,例如表单页中的输入框、日期选择框、单选/复选框等
 * 
 * @author nn.Zhang
 *
 */
public class BaseFormCell {
	/**
	 * MongoDb id
	 */
	@Id
	private String id;

	/**
	 * 表单行Id
	 */
	private String formId;

	/**
	 * 数据表格名称
	 */
	private String label;

	/**
	 * form在列表中的位置
	 */
	private String index;

	/**
	 * 默认值
	 */
	private String defaultValue;

	/**
	 * 提示信息
	 */
	private String tips;

	/**
	 * 是否为空的标志： 1：可为空； 0：不可为空
	 */
	private String nullable;

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getIndex() {
		return index;
	}

	public void setIndex(String index) {
		this.index = index;
	}

	public String getDefaultValue() {
		return defaultValue;
	}

	public void setDefaultValue(String defaultValue) {
		this.defaultValue = defaultValue;
	}

	public String getTips() {
		return tips;
	}

	public void setTips(String tips) {
		this.tips = tips;
	}

	public String getNullable() {
		return nullable;
	}

	public void setNullable(String nullable) {
		this.nullable = nullable;
	}

	public String getFormId() {
		return formId;
	}

	public void setFormId(String formId) {
		this.formId = formId;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

}
