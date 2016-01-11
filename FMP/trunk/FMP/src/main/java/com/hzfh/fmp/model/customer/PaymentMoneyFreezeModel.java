package com.hzfh.fmp.model.customer;

import com.hzfh.api.customer.model.PaymentMoneyFreeze;
import com.hzfh.api.customer.model.query.PaymentMoneyFreezeCondition;
import com.hzfh.fmp.facade.customer.PaymentMoneyFreezeFacade;
import com.hzframework.contract.PagedList;

import java.util.List;

public class PaymentMoneyFreezeModel {
    public static PagedList<PaymentMoneyFreeze> getPagingList(PaymentMoneyFreezeCondition paymentMoneyFreezeCondition) {
        return PaymentMoneyFreezeFacade.getPagingList(paymentMoneyFreezeCondition);
    }

    public static int add(PaymentMoneyFreeze paymentMoneyFreeze) {
        return PaymentMoneyFreezeFacade.add(paymentMoneyFreeze);
    }

    public static int update(PaymentMoneyFreeze paymentMoneyFreeze) {
        return PaymentMoneyFreezeFacade.update(paymentMoneyFreeze);
    }

    public static List<PaymentMoneyFreeze> getList() {
        return PaymentMoneyFreezeFacade.getList();
    }

    public static PaymentMoneyFreeze getInfo(int id) {
        return PaymentMoneyFreezeFacade.getInfo(id);
    }

    public static PaymentMoneyFreeze getInfoBySnAndType(String refSn,byte type) {
        return PaymentMoneyFreezeFacade.getInfoBySnAndType(refSn,type);
    }

}
