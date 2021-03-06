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

package com.funtl.framework.smoke.core.modules.sys.service;

import java.util.List;

import com.funtl.framework.smoke.core.modules.sys.entity.SysMail;
import com.funtl.framework.smoke.core.commons.persistence.Page;
import com.funtl.framework.smoke.core.commons.service.CrudService;
import com.funtl.framework.smoke.core.modules.sys.dao.SysMailDao;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 系统设置Service
 *
 * @author 李卫民
 * @version 2016-08-05
 */
@Service
@Transactional(readOnly = true)
public class SysMailService extends CrudService<SysMailDao, SysMail> {

	public SysMail get(String id) {
		return super.get(id);
	}

	public List<SysMail> findList(SysMail sysMail) {
		return super.findList(sysMail);
	}

	public Page<SysMail> findPage(Page<SysMail> page, SysMail sysMail) {
		return super.findPage(page, sysMail);
	}

	@Transactional(readOnly = false)
	public void save(SysMail sysMail) {
		super.save(sysMail);
	}

	@Transactional(readOnly = false)
	public void delete(SysMail sysMail) {
		super.delete(sysMail);
	}

}