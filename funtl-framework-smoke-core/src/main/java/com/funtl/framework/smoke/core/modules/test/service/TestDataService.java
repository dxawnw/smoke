/*
 * Copyright 2015-2017 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.funtl.framework.smoke.core.modules.test.service;

import java.util.List;

import com.funtl.framework.smoke.core.commons.persistence.Page;
import com.funtl.framework.smoke.core.commons.service.CrudService;
import com.funtl.framework.smoke.core.modules.test.entity.TestData;
import com.funtl.framework.smoke.core.modules.test.dao.TestDataDao;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 生成案例Service
 *
 * @author 李卫民
 * @version 2016-10-31
 */
@Service
@Transactional(readOnly = true)
public class TestDataService extends CrudService<TestDataDao, TestData> {

	public TestData get(String id) {
		return super.get(id);
	}

	public List<TestData> findList(TestData testData) {
		return super.findList(testData);
	}

	public Page<TestData> findPage(Page<TestData> page, TestData testData) {
		return super.findPage(page, testData);
	}

	@Transactional(readOnly = false)
	public void save(TestData testData) {
		super.save(testData);
	}

	@Transactional(readOnly = false)
	public void delete(TestData testData) {
		super.delete(testData);
	}

}