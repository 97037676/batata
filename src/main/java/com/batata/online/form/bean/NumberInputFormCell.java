package com.batata.online.form.bean;

/**
 * 数字输入表单
 * 
 * @author nn.Zhang
 *
 */
public class NumberInputFormCell extends BaseFormCell {

	/**
	 * 数字的value
	 */
	private String value;

	/**
	 * 数字输入的长度
	 */
	private String length;

	/**
	 * 最小值
	 */
	private String minValue;

	/**
	 * 最大值
	 */
	private String maxValue;

	/**
	 * 格式
	 */
	private String pattern;

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

	public String getMinValue() {
		return minValue;
	}

	public void setMinValue(String minValue) {
		this.minValue = minValue;
	}

	public String getMaxValue() {
		return maxValue;
	}

	public void setMaxValue(String maxValue) {
		this.maxValue = maxValue;
	}

	public String getPattern() {
		return pattern;
	}

	public void setPattern(String pattern) {
		this.pattern = pattern;
	}
	
}
