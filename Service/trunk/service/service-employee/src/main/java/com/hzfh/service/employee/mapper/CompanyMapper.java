package com.hzfh.service.employee.mapper;

import com.hzfh.api.employee.model.Company;
import com.hzfh.api.employee.model.query.CompanyCondition;
import com.hzframework.data.mapper.BaseMapper;
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


@Service("companyMapper")
public interface CompanyMapper extends BaseMapper<Company, CompanyCondition> {
	public List<Company> getCompanylist();

	public Company getCompanyByCompanyId(int companyId);
}