package com.zc.study.staticFactory;

import com.zc.study.Sender;
import com.zc.study.impl.MailSender;
import com.zc.study.impl.SmsSender;

/**
 * @ClassName StaticFactory
 * @Description 静态工厂类
 * @Author zhouchao
 * @Date 2019/12/25 17:29
 * @Version 1.0
 */
public class StaticFactory {

    public static Sender produceMail(){
        return new MailSender();
    }

    public static Sender produceSms(){
        return new SmsSender();
    }
}
