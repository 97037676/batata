package com.batata.online.form.bean;

import java.util.List;

/**
 * 复选框
 * 
 * @author nn.Zhang
 *
 */
public class CheckBoxFormCell extends BaseFormCell {

	/**
	 * 可选数量
	 */
	private String quantity;

	/**
	 * 可选选项列表
	 */
	List<CheckBoxOption> options;

	/**
	 * 可选选项
	 * 
	 * @author nn.Zhang
	 *
	 */
	public class CheckBoxOption {
		/**
		 * 标签名
		 */
		private String label;

		/**
		 * 值（可为空，后台默认给值）
		 */
		private String value;

		/**
		 * 是否可选择（0：不可选择；1：可选择）
		 */
		private String selectable;

		/**
		 * 最大可选数量（当已选超过此值时，不可再选择）
		 */
		private int maxSize;

		public String getLabel() {
			return label;
		}

		public void setLabel(String label) {
			this.label = label;
		}

		public String getValue() {
			return value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		public String getSelectable() {
			return selectable;
		}

		public void setSelectable(String selectable) {
			this.selectable = selectable;
		}

		public int getMaxSize() {
			return maxSize;
		}

		public void setMaxSize(int maxSize) {
			this.maxSize = maxSize;
		}
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public List<CheckBoxOption> getOptions() {
		return options;
	}

	public void setOptions(List<CheckBoxOption> options) {
		this.options = options;
	}

}
