package com.batata.online.form.bean;

/**
 * 输入框form
 * 
 * @author nn.Zhang
 *
 */
public class StringInputFormCell extends BaseFormCell {

	/**
	 * 输入框的内容
	 */
	private String value;

	/**
	 * 输入框的长度
	 */
	private String length;

	/**
	 * 需要满足的正则表达式
	 */
	private String regular;

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getLength() {
		return length;
	}

	public void setLength(String length) {
		this.length = length;
	}

	public String getRegular() {
		return regular;
	}

	public void setRegular(String regular) {
		this.regular = regular;
	}

}
