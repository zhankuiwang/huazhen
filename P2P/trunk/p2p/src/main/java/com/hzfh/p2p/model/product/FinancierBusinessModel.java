package com.hzfh.p2p.model.product;

import java.util.List;

import com.hzfh.api.product.model.FinancierBusiness;
import com.hzfh.api.product.model.query.FinancierBusinessCondition;
import com.hzfh.p2p.facade.product.FinancierBusinessFacade;
import com.hzframework.contract.PagedList;

public class FinancierBusinessModel {
    public static PagedList<FinancierBusiness> getPagingList(FinancierBusinessCondition financierBusinessCondition) {
        return FinancierBusinessFacade.getPagingList(financierBusinessCondition);
    }

    public static int add(FinancierBusiness financierBusiness) {
        return FinancierBusinessFacade.add(financierBusiness);
    }

    public static int update(FinancierBusiness financierBusiness) {
        return FinancierBusinessFacade.update(financierBusiness);
    }

    public static List<FinancierBusiness> getList() {
        return FinancierBusinessFacade.getList();
    }

    public static FinancierBusiness getInfo(int id) {
        return FinancierBusinessFacade.getInfo(id);
    }
}
