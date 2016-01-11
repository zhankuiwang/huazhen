package com.hzfh.fmp.controller.payment;

import com.hzfh.fmp.controller.common.CommonAction;
import com.hzfh.fmp.model.common.PageAlias;
import com.hzfh.fmp.model.common.enumeration.TagPermission;
import com.hzfh.fmp.model.common.enumeration.TagPermissionType;
import com.hzfh.fmp.model.common.helper.UserHelper;
import com.hzfh.fmp.model.permission.view.TagPermissionView;

public class PaymentRefundOffLineAction extends CommonAction {
    private String pageVar;
	private boolean showAddButton;
    private boolean showReportButton;

    public boolean isShowReportButton() {
        return showReportButton;
    }

    public void setShowReportButton(boolean showReportButton) {
        this.showReportButton = showReportButton;
    }

    public String getPageVar() {
        return pageVar;
    }

    public boolean isShowAddButton() {
        return showAddButton;
    }

    @Override
    public String execute() throws Exception {
        this.setPageAlias(PageAlias.paymentRefundOffLineList);

        String ret = super.execute();
        if (!ret.equals(SUCCESS))
            return ret;

        this.initPageVar();

		if (this.getPagePermissionView() != null && this.getPagePermissionView().isCreate()) {
            this.showAddButton = true;
        }
        if (this.getPagePermissionView().getTagPermission(TagPermission.SHOW_REPORT_BUTTON) == TagPermissionType.query) {
            this.showReportButton = true;
        } else {
            this.showReportButton = false;
        }
        return SUCCESS;
    }

    private void initPageVar(){
        StringBuilder sb = new StringBuilder();
        sb.append("<script type=\"text/javascript\">");
        sb.append("var PageVar={");
        sb.append(String.format("%1$s:'%2$s',", "DeptType", UserHelper.getUserCache().getDeptType()));
        sb.append("};");

        sb.append("var ElementVar={");
        for (TagPermissionView tagPermissionView : this.getPagePermissionView().getTagPermissionViewList()) {
            sb.append(String.format("%1$s:'%2$s',", tagPermissionView.getTagName(), String.valueOf(tagPermissionView.getTagPermissionType())));
        }
        sb.append("};");
        sb.append("</script>");
        this.pageVar = sb.toString();
    }
}
