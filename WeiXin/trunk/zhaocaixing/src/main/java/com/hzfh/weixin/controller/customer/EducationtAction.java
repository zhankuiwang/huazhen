package com.hzfh.weixin.controller.customer;

import com.hzfh.weixin.controller.common.CommonAction;
import com.hzfh.weixin.model.common.PageAlias;

/**
 * Created by paul on 15-2-5.
 */
public class EducationtAction extends CommonAction{
 
	private String name;
	
    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String execute(){
        this.setPageAlias(PageAlias.investorEducationt);
        String ret = super.execute();
        if (!ret.equals(SUCCESS))
            return ret;
            return SUCCESS;
	}
}
