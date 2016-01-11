package com.hzfh.service.baseInfo.daoImpl;

import com.hzfh.api.baseInfo.model.Calendar;
import com.hzfh.api.baseInfo.model.query.CalendarCondition;
import com.hzfh.service.baseInfo.dao.CalendarDao;
import com.hzfh.service.baseInfo.mapper.CalendarMapper;
import com.hzframework.data.daoImpl.BaseDaoImpl;
import org.springframework.stereotype.Service;

/*******************************************************************************
 * 
 * Copyright 2015 HZFH. All rights reserved. 
 * Author: GuoZhenYu  
 * Create Date: 2015/8/19 
 * Description:
 * 
 * Revision History:
 *      Date         Author               Description
 * 
 ******************************************************************************/


@Service("calendarDao")
public class CalendarDaoImpl extends BaseDaoImpl<Calendar, CalendarCondition, CalendarMapper> implements CalendarDao {
}