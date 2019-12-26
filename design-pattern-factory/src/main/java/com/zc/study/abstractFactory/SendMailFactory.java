package com.zc.study.abstractFactory;

import com.zc.study.Sender;
import com.zc.study.impl.MailSender;

/**
 * @ClassName SendMailFactory
 * @Description 邮件发送工厂
 * @Author zhouchao
 * @Date 2019/12/25 17:39
 * @Version 1.0
 */
public class SendMailFactory implements Provider{
    @Override
    public Sender produce() {
        return new MailSender();
    }
}
