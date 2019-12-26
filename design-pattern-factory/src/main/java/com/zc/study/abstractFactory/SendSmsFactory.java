package com.zc.study.abstractFactory;

import com.zc.study.Sender;
import com.zc.study.impl.SmsSender;

/**
 * @ClassName SendSmsFactory
 * @Description TODO
 * @Author zhouchao
 * @Date 2019/12/25 17:43
 * @Version 1.0
 */
public class SendSmsFactory implements Provider{
    @Override
    public Sender produce() {
        return new SmsSender();
    }
}
