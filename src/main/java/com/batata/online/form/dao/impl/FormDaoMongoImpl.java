package com.batata.online.form.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import com.batata.online.document.bean.OnlineForm;
import com.batata.online.form.bean.BaseFormCell;
import com.batata.online.form.dao.FormDao;
import com.batata.online.user.UserInfo;

/**
 * 表单Dao
 * 
 * @author nn.Zhang
 */
@Repository("formDaoMongoImpl")
public class FormDaoMongoImpl implements FormDao {

	@Resource(name = "mongoTemplate")
	private MongoTemplate mongoTemplate;

	/**
	 * 保存用户编辑的表单配置信息
	 * 
	 * @param forms
	 */
	public void addForm(OnlineForm onlineForm, List<BaseFormCell> forms) {
		// 在线form每个单元格的内容
		this.mongoTemplate.insert(forms, FORM_COLLECTION_NAME);

		// 表单设计信息
		this.mongoTemplate.insert(onlineForm, CELL_COLLECTION_NAME);
	}

	/**
	 * 用户填写表单信息
	 */
	public void fillInForm(UserInfo userInfo) {

	}
}
