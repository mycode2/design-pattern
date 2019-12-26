package com.zc.study.singleton.first;

import org.junit.Test;

import static org.junit.Assert.*;

public class SingletonTest {

    @Test
    public void getInstance() {
        MyThread myThread1 = new MyThread();
        MyThread myThread2 = new MyThread();
        myThread1.setName("Thread1");
        myThread2.setName("Thread2");
        myThread1.start();
        myThread2.start();
    }

    @Test
    public void readResolve() {
        Singleton instance = Singleton.getInstance();
        Object resolve = instance.readResolve();
        System.out.println(resolve);
    }
    class MyThread extends Thread{
        public void run(){
            for(int i = 0;i<5;i++){
                Singleton instance = Singleton.getInstance();
                System.out.println(instance);
            }
        }
    }
}