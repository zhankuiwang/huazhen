package com.hzfh.service.employee.serviceImpl;

import com.hzfh.api.employee.model.Other;
import com.hzfh.api.employee.model.query.OtherCondition;
import com.hzfh.api.employee.service.OtherService;
import com.hzfh.service.employee.dao.OtherDao;
import com.hzframework.data.serviceImpl.BaseServiceImpl;
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


@Service("otherService")
public class OtherServiceImpl extends BaseServiceImpl<Other, OtherCondition, OtherDao> implements OtherService {
}