package com.hzfh.weixin.controller.customer.ajax;

import java.util.ArrayList;
import java.util.List;

import com.hzfh.api.customer.model.Activities;
import com.hzfh.api.customer.model.ActivityCustomerInvitation;
import com.hzfh.api.customer.model.ActivityCustomerTask;
import com.hzfh.api.customer.model.query.ActivityCustomerInvitationCondition;
import com.hzfh.weixin.controller.common.CommonAction;
import com.hzfh.weixin.model.common.AuthenticationModel;
import com.hzfh.weixin.model.common.paramter.ActivitiesInfo;
import com.hzfh.weixin.model.customer.ActivitiesModel;
import com.hzfh.weixin.model.customer.ActivityCustomerInvitationModel;
import com.hzfh.weixin.model.customer.ActivityCustomerTaskModel;
import com.hzfh.weixin.model.customer.P2pCustomerModel;
import com.hzframework.contract.PagedList;
import com.hzframework.contract.SortItem;
import com.hzframework.contract.SortType;

@SuppressWarnings("serial")
public class AjaxInviteAction extends CommonAction {
	
	private int inviterNo;
	private int activityId;
	
	private int pageIndex=1;
	private List<ActivityCustomerInvitation> activityCustomerInvitation;
	private int pageCount;
	private int totalCount;
	private int flag;
	
	
	
	
	public int getFlag() {
		return flag;
	}

	public void setFlag(int flag) {
		this.flag = flag;
	}

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

	public int getPageIndex() {
		return pageIndex;
	}

	public void setPageIndex(int pageIndex) {
		this.pageIndex = pageIndex;
	}

	public List<ActivityCustomerInvitation> getActivityCustomerInvitation() {
		return activityCustomerInvitation;
	}

	public void setActivityCustomerInvitation(
			List<ActivityCustomerInvitation> activityCustomerInvitation) {
		this.activityCustomerInvitation = activityCustomerInvitation;
	}

	public int getPageCount() {
		return pageCount;
	}

	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}

	public int getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}

	public String addSahreActivity() {
		int customerId = AuthenticationModel.getCustomerId();
		Activities activitiesModel = ActivitiesModel.getInfoByActivitytype(ActivitiesInfo.ACTIVITY_CASH_TYPE);
		// 插入我的活动
		if (ActivityCustomerTaskModel.getInfoByCondition(customerId,activitiesModel.getId()) == null) {
			ActivityCustomerTask activityCustomerTask = new ActivityCustomerTask();
			activityCustomerTask.setP2pCustomerNo(customerId);
			activityCustomerTask.setActivityNo(activitiesModel.getId());
			int activityCustomerTaskId = ActivityCustomerTaskModel
					.add(activityCustomerTask);

		}
		return SUCCESS;
	}

	public String getInviteInfo() {
		
		
		inviterNo = AuthenticationModel.getCustomerId();
		Activities activitiesModel = ActivitiesModel.getInfoByActivitytype(ActivitiesInfo.ACTIVITY_CASH_TYPE);
		if(activitiesModel != null){
			activityId = activitiesModel.getId();
		}
		List<SortItem> sortItemList = new ArrayList<SortItem>();
        
    	SortItem sortItem = new SortItem();
    	sortItem.setSortFeild("id");
    	sortItem.setSortType(SortType.DESC);
    	sortItemList.add(sortItem);
    
    	ActivityCustomerInvitationCondition announcementCondition = new ActivityCustomerInvitationCondition();
		announcementCondition.setPageSize(2);
        announcementCondition.setPageIndex(pageIndex);
        announcementCondition.setSortItemList(sortItemList);
        announcementCondition.setP2pCustomerNo(AuthenticationModel.getCustomerId());
        PagedList<ActivityCustomerInvitation> actCustomer = ActivityCustomerInvitationModel.getPagingList(announcementCondition);

		if(actCustomer==null){
			this.flag = 0;
			return SUCCESS;
		}
		this.flag = actCustomer.getResultList().size();
        for (int i=0;i<actCustomer.getResultList().size();i++){
        	ActivityCustomerInvitation activityCustomerInvitation = actCustomer.getResultList().get(i);
        	String cname = P2pCustomerModel.getInfo(activityCustomerInvitation.getInvitedNo()).getUserName();
        	activityCustomerInvitation.setP2pCustomerName(cname);
        	if(activityCustomerInvitation.getStatus()==0){
        		activityCustomerInvitation.setInvitionStatue("未生效");
        	}else{
        		activityCustomerInvitation.setInvitionStatue("已生效");
        	}
        	int actRewardType =activityCustomerInvitation.getActivityRewardType();
        	if(actRewardType==1){
        		activityCustomerInvitation.setShowRewardsMoney("体验金"+activityCustomerInvitation.getRewardsMoney());
        	}else if(actRewardType==2){
        		activityCustomerInvitation.setShowRewardsMoney("现金"+activityCustomerInvitation.getRewardsMoney());
        	}
        	String  invitePhoneNo = P2pCustomerModel.getInfo(activityCustomerInvitation.getInvitedNo()).getCellphone();
        	activityCustomerInvitation.setInvitePhoneNo(invitePhoneNo);
        }
        this.activityCustomerInvitation =  actCustomer.getResultList();
        this.setPageCount(actCustomer.getPagingInfo().getPageCount());
        this.setPageIndex(actCustomer.getPagingInfo().getPageIndex());
        totalCount = actCustomer.getPagingInfo().getTotalCount();
		return SUCCESS;
	}


}
