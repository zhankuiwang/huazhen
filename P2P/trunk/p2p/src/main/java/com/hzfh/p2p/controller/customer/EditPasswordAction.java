package com.hzfh.p2p.controller.customer;

import com.hzfh.p2p.controller.common.CommonAction;
import com.hzfh.p2p.model.common.PageAlias;

/**
 * Created by paul on 15-2-5.
 */
public class EditPasswordAction extends CommonAction{
 

    @Override
	public String execute(){
        this.setPageAlias(PageAlias.editPassword);
        String ret = super.execute();
        if (!ret.equals(SUCCESS))
            return ret;
            return SUCCESS;
	}
}
