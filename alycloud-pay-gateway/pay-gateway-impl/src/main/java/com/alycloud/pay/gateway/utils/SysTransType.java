/*
 * 类文件名:  SysTransType.java
 * 著作版权:  深圳市云智恒生科技有限公司 Copyright 2012-2022, E-mail: 283912449@qq.com, All rights reserved
 * 功能描述:  <描述>
 * 类创建人:  曾云龙
 * 创建时间:  2017年8月16日
 * 功能版本:  V001Z0001
 */
package com.alycloud.pay.gateway.utils;

/**
 * 交易类型。注意：枚举顺序不可变
 * 
 * @author   曾云龙
 * @version  V001Z0001
 * @date     2017年8月16日
 * @see  [相关类/方法]
 * @since  [产品/模块版本]
 */
public enum SysTransType
{
    /**
     * 快捷支付交易
     */
    FAST("快捷支付交易"),
    /**
     * pos刷卡交易
     */
    POS("pos刷卡交易"),
    /**
     * 二维码交易
     */
    QRCODE("二维码交易");
    
    private String text;

    SysTransType(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
