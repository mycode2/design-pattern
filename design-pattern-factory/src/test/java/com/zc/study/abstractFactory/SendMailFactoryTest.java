package com.zc.study.abstractFactory;

import com.zc.study.Sender;
import org.junit.Test;

import static org.junit.Assert.*;

public class SendMailFactoryTest {

    @Test
    public void produce() {
        SendMailFactory sendMailFactory = new SendMailFactory();
        Sender produce = sendMailFactory.produce();
        produce.send();

    }
}