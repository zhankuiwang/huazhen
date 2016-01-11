package com.hzfh.service.employee.serviceImpl;

import com.hzfh.api.employee.model.Company;
import com.hzfh.api.employee.model.query.CompanyCondition;
import com.hzfh.api.employee.service.CompanyService;
import com.hzfh.service.employee.dao.CompanyDao;
import com.hzframework.data.serviceImpl.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/*******************************************************************************
 * 
 * Copyright 2015 HZFH. All rights reserved. 
 * Author: GuoZhenYu  
 * Create Date: 2015/1/16 
 * Description:
 * 
 * Revision History:
 *      Date         Author               Description
 * 
 ******************************************************************************/


@Service("companyService")
public class CompanyServiceImpl extends BaseServiceImpl<Company, CompanyCondition, CompanyDao> implements CompanyService {
	@Autowired
	private CompanyDao companyDao;
	@Override
	public List<Company> getCompanylist() {
		return companyDao.getCompanylist();
	}
	@Override
	public Company getCompanyByCompanyId(int companyId) {
		return companyDao.getCompanyByCompanyId(companyId);
	}
}