package com.hzfh.service.employee.daoImpl;

import com.hzfh.api.employee.model.Welfare;
import com.hzfh.api.employee.model.query.WelfareCondition;
import com.hzfh.service.employee.dao.WelfareDao;
import com.hzfh.service.employee.mapper.WelfareMapper;
import com.hzframework.data.daoImpl.BaseDaoImpl;
import org.springframework.stereotype.Service;

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


@Service("welfareDao")
public class WelfareDaoImpl extends BaseDaoImpl<Welfare, WelfareCondition, WelfareMapper> implements WelfareDao {
}