package com.zc.study.simple;

import com.zc.study.Sender;
import org.junit.Test;

import static org.junit.Assert.*;

public class SimpleFactoryDesignPatternTest {

    @Test
    public void produce() {
        SimpleFactoryDesignPattern factory = new SimpleFactoryDesignPattern();
        Sender sender = factory.produce("sms");
        sender.send();
    }
}