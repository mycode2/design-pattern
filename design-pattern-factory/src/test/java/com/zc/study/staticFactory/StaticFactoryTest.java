package com.zc.study.staticFactory;

import com.zc.study.Sender;
import org.junit.Test;

import static org.junit.Assert.*;

public class StaticFactoryTest {

    @Test
    public void produceMail() {
        Sender sender = StaticFactory.produceMail();
        sender.send();
    }

    @Test
    public void produceSms() {
        Sender sender = StaticFactory.produceSms();
        sender.send();
    }
}