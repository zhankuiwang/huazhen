package com.hzfh.api.workFlow.model.query;

import com.hzframework.contract.QueryCondition;

import java.io.Serializable;

/*******************************************************************************
 * 
 * Copyright 2015 HZFH. All rights reserved. 
 * Author: GuoZhenYu  
 * Create Date: 2015/8/3 
 * Description:
 * 
 * Revision History:
 *      Date         Author               Description
 * 
 ******************************************************************************/


public class ActHiTaskinstCondition extends QueryCondition implements Serializable {
	private String assignee;
	public String getAssignee() {
		return assignee;
	}
	public void setAssignee(String assignee) {
		this.assignee = assignee;
	}
	private String bySelectTitle;
	private String byRequestUser;
	private String byDate;
	private String byStatus;
	public String getBySelectTitle() {
		return bySelectTitle;
	}
	public String getByStatus() {
		return byStatus;
	}
	public void setByStatus(String byStatus) {
		this.byStatus = byStatus;
	}
	public void setBySelectTitle(String bySelectTitle) {
		this.bySelectTitle = bySelectTitle;
	}
	public String getByRequestUser() {
		return byRequestUser;
	}
	public void setByRequestUser(String byRequestUser) {
		this.byRequestUser = byRequestUser;
	}
	public String getByDate() {
		return byDate;
	}
	public void setByDate(String byDate) {
		this.byDate = byDate;
	}
	
}