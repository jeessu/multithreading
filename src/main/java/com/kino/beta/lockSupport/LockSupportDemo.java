package com.kino.beta.lockSupport;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.locks.LockSupport;

public class LockSupportDemo {

	static Object u = new Object();
	static ChangeObjectThread t1 = new ChangeObjectThread("t1");
	static ChangeObjectThread t2 = new ChangeObjectThread("t2");
	
	public static class ChangeObjectThread extends Thread{
		public ChangeObjectThread(String name) {
			super.setName(name);
		}
		@Override
		public void run() {
			synchronized (u) {
				System.out.println("in "+getName());
				LockSupport.park();
				System.out.println("after park :"+getName());
			}
		}
	}
	
	
	public static void main(String[] args) throws InterruptedException {
		
		t1.start();
		Thread.sleep(100);
		t2.start();
		
		System.out.println("unpark t1");
		LockSupport.unpark(t1);
		
		System.out.println("unpark t2");
		LockSupport.unpark(t2);
		
		t1.join();
		t2.join();
		
	}
}
