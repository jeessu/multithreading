package com.kino.beta.deadLock;

import java.util.Arrays;

public class DeadLockDemo {

	static Object object1 = new Object();
	static Object object2 = new Object();

	public static class Demo implements Runnable {

		Object obj;
		
		public Demo(Object object) {
			this.obj = object;
		}

		@Override
		public void run() {
			if (obj.equals(object1)) {
				synchronized (object1) {
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					synchronized (object2) {
						System.out.println("sync obj2");
					}
				}
			} else {
				synchronized (object2) {

					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					synchronized (object1) {
						System.out.println("sync obj1");
					}
				}
			}

		}

	}

	public static void main(String[] args) {

		Thread t1 = new Thread(new Demo(object1));
		Thread t2 = new Thread(new Demo(object2));

		t1.start();
		t2.start();
		int[] arr ={};
	}
}
