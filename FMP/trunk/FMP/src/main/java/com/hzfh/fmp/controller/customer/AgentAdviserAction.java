package com.hzfh.fmp.controller.customer;

import com.hzfh.fmp.controller.common.CommonAction;
import com.hzfh.fmp.model.common.PageAlias;
import com.hzfh.fmp.model.common.enumeration.TagPermission;
import com.hzfh.fmp.model.common.enumeration.TagPermissionType;
import com.hzfh.fmp.model.permission.view.TagPermissionView;

public class AgentAdviserAction extends CommonAction {
    private boolean showAddButton;
    private boolean showExcelButton;
    private String pageVar;

    public boolean isShowAddButton() {
        return showAddButton;
    }

    public String getPageVar() {
        return pageVar;
    }

    public boolean isShowExcelButton() {
		return showExcelButton;
	}

	@Override
    public String execute() throws Exception {
        this.setPageAlias(PageAlias.agentAdviserList);

        String ret = super.execute();
        if (!ret.equals(SUCCESS))
            return ret;

        if(this.getPagePermissionView()!=null&&this.getPagePermissionView().isCreate()){
            this.showAddButton=true;
        }
        if (this.getPagePermissionView().getTagPermission(TagPermission.EXCEL_AGENT_ADVISER) == TagPermissionType.query) {
			this.showExcelButton = true;
		} else {
			this.showExcelButton = false;
		}
        
        initPageVar();
        return SUCCESS;
    }
	public String executeEffective() throws Exception {
        this.setPageAlias(PageAlias.agentAdviserListEffective);

        String ret = super.execute();
        if (!ret.equals(SUCCESS))
            return ret;

//        if(this.getPagePermissionView()!=null&&this.getPagePermissionView().isCreate()){
            this.showAddButton=false;
//        }
        if (this.getPagePermissionView().getTagPermission(TagPermission.SHOW_EXCAL_BUTTON) == TagPermissionType.query) {
			this.showExcelButton = true;
		} else {
			this.showExcelButton = false;
		}
        
        initPageVar();
        return SUCCESS;
    }
    private void initPageVar() {
        StringBuilder sb = new StringBuilder();
        sb.append("<script type=\"text/javascript\">");

        sb.append("var ElementVar={");
        for (TagPermissionView tagPermissionView : this.getPagePermissionView().getTagPermissionViewList()) {
            sb.append(String.format("%1$s:'%2$s',", tagPermissionView.getTagName(), String.valueOf(tagPermissionView.getTagPermissionType())));
        }
        sb.append("};");
        sb.append("</script>");
        this.pageVar = sb.toString();
    }


}
