package com.zc.study.simple;

import com.zc.study.Sender;
import com.zc.study.impl.MailSender;
import com.zc.study.impl.SmsSender;

/**
 * 普通工厂类
 */
public class SimpleFactoryDesignPattern {

    public Sender produce(String type) {
        if ("mail".equals(type)) {
            return new MailSender();
        } else if ("sms".equals(type)) {
            return new SmsSender();
        } else {
            System.out.println("请输入正确的类型!");
            return null;
        }
    }
}