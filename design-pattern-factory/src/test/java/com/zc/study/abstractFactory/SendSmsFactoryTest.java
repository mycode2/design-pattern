package com.zc.study.abstractFactory;

import com.zc.study.Sender;
import org.junit.Test;

import static org.junit.Assert.*;

public class SendSmsFactoryTest {

    @Test
    public void produce() {
        SendSmsFactory sendSmsFactory = new SendSmsFactory();
        Sender produce = sendSmsFactory.produce();
        produce.send();
    }
}