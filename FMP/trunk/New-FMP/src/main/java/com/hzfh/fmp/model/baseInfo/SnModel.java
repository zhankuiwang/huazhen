package com.hzfh.fmp.model.baseInfo;

import com.hzfh.api.baseInfo.model.Sn;
import com.hzfh.api.baseInfo.model.helper.SnEnum;
import com.hzfh.api.baseInfo.model.query.SnCondition;
import com.hzfh.fmp.facade.baseInfo.SnFacade;
import com.hzframework.contract.PagedList;

import java.util.List;

public class SnModel {
    public static PagedList<Sn> getPagingList(SnCondition snCondition) {
        return SnFacade.getPagingList(snCondition);
    }

    public static int add(Sn sn) {
        return SnFacade.add(sn);
    }

    public static int update(Sn sn) {
        return SnFacade.update(sn);
    }

    public static List<Sn> getList() {
        return SnFacade.getList();
    }

    public static Sn getInfo(int id) {
        return SnFacade.getInfo(id);
    }

	public static void truncateSn() {
		SnFacade.truncateSn();
	}
	
	public static String getSn(SnEnum snEnum) {
		return SnFacade.getSn(snEnum);
	}
	

	
}
