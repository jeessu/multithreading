package com.kino.beta.single.thisAndCurrentThread;

public class MyThread02 extends Thread {
    public MyThread02() {
        System.out.println("init curr: " + Thread.currentThread().getName());
        System.out.println("init this: "+this.getName());
    }
    @Override
    public void run() {
        System.out.println("run curr: " + Thread.currentThread().getName());
        System.out.println("run this: "+this.getName());
    }
}
