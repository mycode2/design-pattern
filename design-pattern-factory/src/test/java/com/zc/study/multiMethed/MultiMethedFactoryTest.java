package com.zc.study.multiMethed;

import com.zc.study.Sender;
import org.junit.Test;

public class MultiMethedFactoryTest {

    @Test
    public  void produceMail() {
        MultiMethedFactory factory = new MultiMethedFactory();
        Sender sender = factory.produceMail();
        sender.send();
    }
    @Test
    public  void produceSms() {
        MultiMethedFactory factory = new MultiMethedFactory();
        Sender sender = factory.produceSms();
        sender.send();
    }
}