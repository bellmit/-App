package com.alycloud.channel.linkpay.enums;

/**
 * 江苏电子接口返回码
 * @author Moyq5
 * @date 2017年5月10日
 */
public enum Code {

	/**
	 * 交易成功
	 */
	C0000("交易成功"),
	/**
	 * 交易失败，具体信息请参考错误描述
	 */
	C0001("交易失败，具体信息请参考错误描述"),
	/**
	 * 交易结果未明
	 */
	C0002("交易结果未明"),
	/**
	 * 系统错误，一般在平台系统出现异常时返回
	 */
	C1001("系统错误，一般在平台系统出现异常时返回"),
	/**
	 * 签名验证错误
	 */
	C1002("签名验证错误"),
	/**
	 * 公共参数不正确，请参考文档参数要求
	 */
	C1003("公共参数不正确，请参考文档参数要求"),
	/**
	 * 系统错误，一般在银行系统出现异常时返回
	 */
	C1004("系统错误，一般在银行系统出现异常时返回"),
	/**
	 * 合作商对商户的自定义编号不能为空
	 */
	C2001("合作商对商户的自定义编号不能为空"),
	/**
	 * 商户名称不能为空
	 */
	C2002("商户名称不能为空"),
	/**
	 * 商户简称为空或已存在
	 */
	C2003("商户简称为空或已存在"),
	/**
	 * 商户地址不能为空
	 */
	C2004("商户地址不能为空"),
	/**
	 * 联系人名称不能为空
	 */
	C2005("联系人名称不能为空"),
	/**
	 * 联系人电话为空或电话信息错误
	 */
	C2006("联系人电话为空或电话信息错误"),
	/**
	 * 联系人身份证信息为空或身份证信息验证错误
	 */
	C2007("联系人身份证信息为空或身份证信息验证错误"),
	/**
	 * 商户结算卡银行为空或结算卡银行不存在
	 */
	C2008("商户结算卡银行为空或结算卡银行不存在"),
	/**
	 * 商户结算卡号不能为空
	 */
	C2009("商户结算卡号不能为空"),
	/**
	 * 平台商户编号不能为空
	 */
	C2010("平台商户编号不能为空"),
	/**
	 * 平台商户编号不存在或者可用
	 */
	C2011("平台商户编号不存在或者可用"),
	/**
	 * 请求方的合作编号不可用或与请求商户不存在关系
	 */
	C2012("请求方的合作编号不可用或与请求商户不存在关系"),
	/**
	 * 支付请求金额不能为空
	 */
	C2013("支付请求金额不能为空"),
	/**
	 * 支付请求金额错误
	 */
	C2014("支付请求金额错误"),
	/**
	 * 商品名称不能为空
	 */
	C2015("商品名称不能为空"),
	/**
	 * 交易异步通知地址交易异步通知地址不能为空
	 */
	C2016("交易异步通知地址交易异步通知地址不能为空"),
	/**
	 * 未找到可用终端
	 */
	C2017("未找到可用终端"),
	/**
	 * 商户费率配置缺失
	 */
	C2018("商户费率配置缺失"),
	/**
	 * 商户通道配置缺失
	 */
	C2019("商户通道配置缺失"),
	/**
	 * 商户通道资料缺失
	 */
	C2020("商户通道资料缺失"),
	/**
	 * 商户合作商费率配置缺失
	 */
	C2021("商户合作商费率配置缺失"),
	/**
	 * 支付请求订单号不能为空
	 */
	C2022("支付请求订单号不能为空"),
	/**
	 * 支付请求订单号已存在
	 */
	C2023("支付请求订单号已存在"),
	/**
	 * 终端编号不存在或终端编号不可用
	 */
	C2024("终端编号不存在或终端编号不可用"),
	/**
	 * 合作商基本资料配置缺失
	 */
	C2025("合作商基本资料配置缺失"),
	/**
	 * 合作商查询商户不存在
	 */
	C2026("合作商查询商户不存在"),
	/**
	 * 该终端编号不是此商户持有
	 */
	C2027("该终端编号不是此商户持有"),
	/**
	 * 查询订单号不存在
	 */
	C2028("查询订单号不存在"),
	/**
	 * 联行号为空
	 */
	C2029("联行号为空"),
	/**
	 * 对公对私为空或有误
	 */
	C2030("对公对私为空或有误"),
	/**
	 * 代付账户名为空或有误
	 */
	C2031("代付账户名为空或有误"),
	/**
	 * 代付账户号为空或有误
	 */
	C2032("代付账户号为空或有误"),
	/**
	 * 
	 */
	//C2033(""),
	/**
	 * 代付金额为空或有误
	 */
	C2034("代付金额为空或有误"),
	/**
	 * 代付日期为空或有误
	 */
	C2035("代付日期为空或有误"),
	/**
	 * 代付时间为空或有误
	 */
	C2036("代付时间为空或有误"),
	/**
	 * 代付订单号不可用
	 */
	C2037("代付订单号不可用"),
	/**
	 * 代付订单号已存在
	 */
	C2038("代付订单号已存在"),
	/**
	 * 账户金额不足
	 */
	C2039("账户金额不足"),
	/**
	 * 账户可用金额不足
	 */
	C2040("账户可用金额不足"),
	/**
	 * 账户余额不足
	 */
	C2041("账户余额不足"),
	/**
	 * 无可用通道
	 */
	C2042("无可用通道"),
	/**
	 * 无可用通道
	 */
	C2043("无可用通道"),
	/**
	 * 无可用通道
	 */
	C2044("无可用通道"),
	/**
	 * 无可用通道
	 */
	C2045("无可用通道"),
	/**
	 * 合作商未开通此业务
	 */
	C2046("合作商未开通此业务"),
	/**
	 * 内部错误
	 */
	C2047("内部错误"),
	/**
	 * 不在额度代付时间段
	 */
	C2048("不在额度代付时间段"),
	/**
	 * 当前时间段不可交易
	 */
	C2062("当前时间段不可交易"),
	/**
	 * 当前交易金额超过单条限制
	 */
	C2064("当前交易金额超过单条限制"),
	/**
	 * 商户交易金额超过当日限额
	 */
	C2065("商户交易金额超过当日限额"),
	/**
	 * 当前交易金额低于单条限制
	 */
	C2067("当前交易金额低于单条限制"),
	/**
	 * 内部逻辑错误
	 */
	C9999("内部逻辑错误");
	private String text;
	
	Code(String text) {
		this.text = text;
	}

	public String getText() {
		return text;
	}
}
