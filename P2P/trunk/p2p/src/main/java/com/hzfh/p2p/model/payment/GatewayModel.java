package com.hzfh.p2p.model.payment;

import com.hzfh.api.payment.model.common.PaymentData;
import com.hzfh.api.payment.model.common.entity.CreditAssignment;
import com.hzfh.api.payment.model.common.entity.Repayment;
import com.hzfh.api.payment.model.common.entity.Tender;
import com.hzfh.api.payment.model.common.entity.Transfer;
import com.hzfh.api.payment.model.request.gateway.BindBankCardReq;
import com.hzfh.api.payment.model.request.gateway.CpTransactionReq;
import com.hzfh.api.payment.model.request.gateway.EnterpriseRegisterReq;
import com.hzfh.api.payment.model.request.gateway.RechargeReq;
import com.hzfh.api.payment.model.request.gateway.RegisterReq;
import com.hzfh.api.payment.model.request.gateway.ResetMobileReq;
import com.hzfh.api.payment.model.request.gateway.ResetPasswordReq;
import com.hzfh.api.payment.model.request.gateway.UnbindBankCardReq;
import com.hzfh.api.payment.model.request.gateway.WithdrawReq;
import com.hzfh.p2p.facade.payment.GatewayFacade;

/**
 * Created by Administrator on 2015/6/8.
 */
public class GatewayModel {
    public static PaymentData register(RegisterReq registerReq){
        return GatewayFacade.register(registerReq);
    }
    public static PaymentData rindBankCard(BindBankCardReq bindBankCardReq){
        return GatewayFacade.rindBankCard(bindBankCardReq);
    }
    public static PaymentData unbindBankCardCallback(UnbindBankCardReq unbindBankCardReq){
        return GatewayFacade.unbindBankCardCallback(unbindBankCardReq);
    }
	public static PaymentData recharge(RechargeReq rechargeReq) {
		return GatewayFacade.recharge(rechargeReq);
	}
	public static PaymentData withdraw(WithdrawReq withdrawReq) {
		return GatewayFacade.withdraw(withdrawReq);
	}
	public static PaymentData enterpriseRegister(EnterpriseRegisterReq enterpriseRegisterReq){
		return GatewayFacade.enterpriseRegister(enterpriseRegisterReq);
	};
	public static PaymentData transfer(CpTransactionReq<Transfer> transferReq){
		return GatewayFacade.transfer(transferReq);
	};
	public static PaymentData tender (CpTransactionReq<Tender> tenderReq){
		return GatewayFacade.tender(tenderReq);
	};
	public static PaymentData repayment (CpTransactionReq<Repayment> repaymentReq){
		return GatewayFacade.repayment(repaymentReq);
	};
	public static PaymentData creditAssignment (CpTransactionReq<CreditAssignment> creditAssignmentReq){
		return GatewayFacade.creditAssignment(creditAssignmentReq);
	};
	public static PaymentData resetPassword(ResetPasswordReq resetPasswordReq){
		return GatewayFacade.resetPassword(resetPasswordReq);
	};
	public static PaymentData resetMobile(ResetMobileReq resetMobileReq){
		return GatewayFacade.resetMobile(resetMobileReq);
	};
}
