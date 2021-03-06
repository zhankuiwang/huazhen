<%@ page contentType="text/html;charset=UTF-8" language="java"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="m" uri="/hz-tags"%>

<m:ContentPage materPageId="layout">
    <m:Content contentPlaceHolderId="center">

        <div class="detail mt20 pb30">
            <div class="tab">
                <div class="tab_title">
                    <a href="javascript:;" class="active">打款基本信息</a><s:if test="showCommonView"><a href="javascript:;">附件</a></s:if>
                </div>
                <ul class="tab_content">
                    <li class="tab_content1  tabContent" style="display:block;">
                        <div class="basic_Info_content p15 info_All">
                            <form id="salesAdd" style="z-index:9999;">
                                <ul>
                                    <li><span class="fw">订单编号</span><a id="code" class="ml20" target="_blank"></a></li>
                                    <li><span class="fw">合同编号</span><a id="contractCode" class="ml20" target="_blank"></a></li>
                                </ul>
                                <ul>
                                    <li><span class="fw">产品类型</span><a id="productType" class="ml20" target="_blank"></a></li>
                                    <li><span class="fw">产品</span><a id="productNo" class="ml20" target="_blank"></a></li>
                                </ul>
                                <ul>
                                    <li><span class="fw">销售类型</span><a id="peopleType" class="ml20" target="_blank"></a></li>
                                    <li><span class="fw" id="peopleNoa">渠道</span><a id="peopleNo" class="ml20" target="_blank"></a></li>
                                </ul>
                                <ul>
                                    <li><span class="fw">客户类型</span><a id="customerType" class="ml20" target="_blank"></a></li>
                                    <li><span class="fw">客户</span><a id="customerNo" class="ml20" target="_blank"></a></li>
                                </ul>
                                <ul>
                                    <li><span class="fw">打款状态</span><a id="status" class="ml20" target="_blank"></a></li>
                                    <li><span class="fw">打款金额</span><a id="money" class="ml20" target="_blank"></a>元</li>
                                </ul>
                                <ul>
                                    <li><span class="fw">销售经理</span><a id="empNo" class="ml20" target="_blank"></a></li>
                                </ul>
                                <ul>
                                    <li><span class="fw">协议状态</span><a id="protocolStatus" class="ml20" target="_blank"></a></li>
                                    <li><span class="fw">购买日期</span><a id="purchaseDate" class="ml20" target="_blank"></a></li>
                                </ul>
                                <ul>
                                    <li><span class="fw">开户行</span><a id="bankAddress" class="ml20" target="_blank"></a></li>
                                    <li><span class="fw">开户名</span><a id="bankName" class="ml20" target="_blank"></a></li>
                                </ul>
                                <ul>
                                    <li><span class="fw">银行账号</span><a id="accountNumber" class="ml20" target="_blank"></a></li>
                                    <li><span class="fw">是否测试</span><a id="isTest" class="ml20" target="_blank"></a></li>
                                </ul>
                                <p id="btn" class="mt50">
                                    <em id="msg"></em>
                                    <s:if test="showExamineButton">
                                        <input type="button" id="sales_ok" value="审核成功"
                                               class="none btn_style" />

                                        <input type="button" id="sales_failed" value="审核失败"
                                               class="none btn_style" />
                                    </s:if>

                                    <s:if test="showStatusButton">
                                        <input type="button" id="cancel" value="取消订单"
                                               class="submit_Btn status none btn_style" />
                                    </s:if>
                                    <input type="button" id="back" value="返回"
                                           class="cancel_Btn btn_style" />
                                </p>
                            </form>
                        </div>
                    </li>
                    <s:if test="showCommonView">
                        <li class="tab_content2  tabContent">
                            <div class="details_Info_content p15 info_All" id="uploadDiv">
                                <div class="upload"></div>
                            </div>
                        </li>
                    </s:if>
                </ul>
            </div>
        </div>
        ${pageVar}
    </m:Content>
</m:ContentPage>


