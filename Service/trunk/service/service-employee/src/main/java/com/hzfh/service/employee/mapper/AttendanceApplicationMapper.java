package com.hzfh.service.employee.mapper;

import com.hzfh.api.employee.model.AttendanceApplication;
import com.hzfh.api.employee.model.query.AttendanceApplicationCondition;
import com.hzframework.data.mapper.BaseMapper;
import org.springframework.stereotype.Service;

import java.util.List;

/*******************************************************************************
 * 
 * Copyright 2015 HZFH. All rights reserved. 
 * Author: GuoZhenYu  
 * Create Date: 2015/5/18 
 * Description:
 * 
 * Revision History:
 *      Date         Author               Description
 * 
 ******************************************************************************/


@Service("attendanceApplicationMapper")
public interface AttendanceApplicationMapper extends BaseMapper<AttendanceApplication, AttendanceApplicationCondition> {

    public List<AttendanceApplication> getListForExcel(AttendanceApplicationCondition attendanceApplicationCondition);

    public int updateStatusByActivitiNo(String activitiNo);
}