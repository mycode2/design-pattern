package com.zc.study.multiMethed;

import com.zc.study.Sender;
import com.zc.study.impl.MailSender;
import com.zc.study.impl.SmsSender;

/**
 * @ClassName MultiMethedFactory
 * @Description 工厂中有多个方法
 * @Author zhouchao
 * @Date 2019/12/25 17:23
 * @Version 1.0
 */
public class MultiMethedFactory {
    public Sender produceMail() {
        return new MailSender();
    }

    public Sender produceSms() {
        return new SmsSender();
    }

}
