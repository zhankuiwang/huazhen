 package com.hzfh.fmp.model.common;

/**
 * Created by paul on 14-12-24.
 */
public enum  PageAlias {
	fixedAssetsList,
	fixedAssetsAdd,
	fixedAssetsDetail,
	suppliersList,
	suppliersAdd,
	suppliersDetail,
    importData,
	activitiesAdd,
	activitiesList,
	activitiesAddDetail,
    paymentReportDeatilList,
    paymentReportList,
	activitiesDetail,
	activityAwardRelationList,
	activityAwardRelationAdd,
	activityCashBonusList,
	activityCashBonusAdd,
	activityConditionList,
	activityConditionAdd,
	activityConditionRelationList,
	activityConditionRelationAdd,
	activityCouponsList,
	activityCouponsAdd,
	activityCouponsCodeList,
	activityCouponsCodeAdd,
	activityCouponsProductList,
	activityCouponsProductAdd,
	activityCustomerCashBonusList,
	activityCustomerCashBonusAdd,
	activityCustomerCouponsList,
	activityCustomerCouponsAdd,
	activityCustomerExperienceGoldList,
	activityCustomerExperienceGoldAdd,
	activityCustomerInvitationList,
	activityCustomerInvitationAdd,
	activityCustomerPresentList,
	activityCustomerPresentAdd,
	activityCustomerTaskList,
	activityCustomerTaskAdd,
	activityFeedbackList,
	activityFeedbackAdd,
	activityIntegralDetailList,
	activityIntegralDetailAdd,
	activityMessageList,
	activityMessageAdd,
	activityPresentList,
	activityPresentAdd,
	activityTaskList,
	activityTaskAdd,
	activityTaskRelationList,
	activityTaskRelationAdd,
	activityExperienceGoldList,
	activityExperienceGoldAdd,
	activityCustomerDetailList,
	activityCustomerDetailAdd,
	activityIntegralList,
	activityIntegralAdd,
	activityMessageStatusList,
	activityMessageStatusAdd,
	activityMessageTemplateList,
	activityMessageTemplateAdd,
	activityRuleRelationList,
	activityRuleRelationAdd,
	experienceGoldList,
	experienceGoldAdd,
	messageStatusList,
	messageStatusAdd,
	messageTemplateList,
	messageTemplateAdd,
    error,
    errorPage,
    index,
    login,
    //baseInfo
    dicDataList,
    dicTypeList,
    letterList,
    remindList,//
    mailList,
    letterAdd,//
    announcementList,
    announcementAdd,
    bannerInfoList,
    bannerInfoAdd,
    //permission
    userList,
    roleList,
    userRoleList,
    roleElementList,//
    elementList,
    dataManage,
   //修改密码页面
    updatePwd,//
    //customer 
    activityList,
    agentAdviserList,
    agentAdviserListEffective,
    agentAdviserAdd,
    agentBusinessList,
    agentBusinessListEffective,
    customerCompanyList,
    customerPersonalList,
    p2pCustomerList,
    agentBusinessAdd,
    customerCompanyAdd,
    customerPersonalAdd,
    customerPersonalListEffective,
    customerCompanyListEffective,
//    customerPersonalCallList,
    //employee
    commissionWealthCenterList,
    customerCompanyDetail,
    customerPersonalDetail,
    employeeList,
    companyList,
    departmentList,
    empBrokerageLadderList,
    otherList,//
    overtimeList,
    paymentList,
    positionList,
    positionLevelList,
    signList,
    welfareList,
    employeeAdd,
    departmentAdd,
    organizationPlanList,
    empCompilePlanList,
    attendanceApplicationList,
    attendanceApplicationAdd,
    personalChangeList,
    personalChangeAdd,
    resignApplicationList,
    resignApplicationAdd,
    yearNeedTotalList,
    yearNeedTotalAdd,
    //product
    productDetail,
    productList,
    partnerRateList,//
    partnerIssuerList,
    financierPersonalList,
    financierBusinessList,
    decisionLogList,//
    decisionList,//
    productAdd,
    productAttachmentList,
    productStagesList,
    productTaskList,
    p2pProductList,
    financeProductList,
    p2pProductAdd,
    p2pProductDetail,
    partnerIssuerAdd,
    //sales,
    creditorList,
    loanSituation,
    collectionConfirm,
    repurchaseCommit,
    agentAdviserDetail,
    agentBusinessDetail,
    partnerIssuerDetail,
    financierPersonalDetail,
    financierBusinessDetail,
    confirmactionLetter,
    agentExpenseList,
    agentRateList,
    brokerageCalculateList,//
    incomeList,
    salesList,
    salesListOnLine,
    salesAdd,
    salesAddForProduct,
    salesAddForP2pProduct,
    salesDetail,
    salesDetailOnLine,
    salesDetailForP2pProduct,
    salesDetailForProduct,
    salesEmpCalculateList,//
    taskDecisionList,//
    taskDecisionLogList,//
    taskAdd,
    p2pSubscribeList,
    p2pSubscribeAssign,//
    p2pNoSubscribeAssign,
	p2pInvestmentList,//
    financierPersonalAdd,
    financierBusinessAdd,
    achievementCommissionList,
    //subsidy
    subsidyList,
    //subsidyAdd,
    subsidyTotalList,
    subsidyTotalAdd,
    test,
    //Tool
    sendLetter, 
    recruitAskRecordList, 
    recruitAskRecordAdd,
    recruitFollowList,
    recruitFollowAdd,
    interviewEvaluationRecordList,
    interviewEvaluationRecordAdd, 
	//workFlow
    actIdGroupList,
    actIdGroupAdd,
    actIdUserList,
    actIdUserAdd,
    auditTaskList,
    processingList,
    actReProcDefList, 
    approvalHistoriaList,
    //YearNeed
    deptYearNeedList,
    deptYearNeedAdd,
    deptYearNeedDetailList,
    deptYearNeedDetailAdd, 
    tempRecruitDetailList, 
    tempRecruitDetailAdd, 
    tempRecruitNeedList, 
    tempRecruitNeedAdd, 
    yearNeedAdd, 
    yearNeedList, 
    probationWorkSummaryList, 
    probationWorkSummaryAdd, 
    managerEvaluationList, 
    managerEvaluationAdd, 
    probationEvaluationList, 
    probationEvaluationAdd,
    extendProbationApplicationList,
    extendProbationApplicationAdd, 
    paymentMoneyRechargeList, 
    paymentMoneyWithdrawList, 
    paymentMoneyRechargeAdd, 
    paymentMoneyWithdrawAdd,
    addCustomerReport,
    addSalesReport,
    addCustomerReportWealth,
    enterpriseRegisterSuccess,
    //payment
    paymentRefundList,
    paymentRefundOffLineList,
    paymentRefundAdd, 
    needReleaseList, 
    needReleaseAdd,
    needReleaseTask, 
    knowledgeBaseList,
    knowledgeBaseAdd, 
    knowledgeBaseInfo, 
    activityAdd, 
    activityAttachmentList, 
    activityAttachmentAdd, 
    applyCustomerList, 
    applyEmployeeAdd, 
    applyEmployeeList, 
    applyCustomerAdd, 
    activityIndex,
    calendarAdd,
    activityUsersList,
    activityUsersAdd,
    drawSettingList,
    winningRecordList,
    drawSettingAdd,
    winningRecordAdd,
    activityUsersDetail,
    drawSettingDetail,
    winningRecordDetail,
    newIndex, main, companyAdd, calendarList

}
