package com.zc.study.impl;

import com.zc.study.Sender;

/**
 * @ClassName MailSender
 * @Description TODO
 * @Author zhouchao
 * @Date 2019/12/25 17:17
 * @Version 1.0
 */
public class MailSender implements Sender {
    @Override
    public void send() {
        System.out.println("this is mail sender!");
    }
}
