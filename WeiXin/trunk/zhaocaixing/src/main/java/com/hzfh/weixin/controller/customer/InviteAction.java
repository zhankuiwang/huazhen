package com.hzfh.weixin.controller.customer;

import com.hzfh.api.customer.model.Activities;
import com.hzfh.weixin.controller.common.CommonAction;
import com.hzfh.weixin.model.common.AuthenticationModel;
import com.hzfh.weixin.model.common.PageAlias;
import com.hzfh.weixin.model.common.paramter.ActivitiesInfo;
import com.hzfh.weixin.model.customer.ActivitiesModel;


public class InviteAction extends CommonAction {

	private int inviterNo;
	private int activityId;
	private String activityRule;
	
	public int getInviterNo() {
		return inviterNo;
	}

	public void setInviterNo(int inviterNo) {
		this.inviterNo = inviterNo;
	}

	public int getActivityId() {
		return activityId;
	}

	public void setActivityId(int activityId) {
		this.activityId = activityId;
	}
	

	public String getActivityRule() {
		return activityRule;
	}

	public void setActivityRule(String activityRule) {
		this.activityRule = activityRule;
	}

	@Override
	public String execute() {
	
		return SUCCESS;
	}
	
	public String getInviteById(){
		this.setPageAlias(PageAlias.myInvite);
		String ret = super.execute();
		if (!ret.equals(SUCCESS))
			return ret;
		inviterNo = AuthenticationModel.getCustomerId();
		Activities activitiesModel = ActivitiesModel.getInfoByActivitytype(ActivitiesInfo.ACTIVITY_CASH_TYPE);
		if(activitiesModel != null){
			activityId = activitiesModel.getId();
			activityRule = activitiesModel.getActivityRule();
		}
		return SUCCESS;
	}
	
	


	

}
