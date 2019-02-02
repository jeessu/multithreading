package com.kino.beta.volatiled;

public class VolatileTest {

	private volatile static int i;
	static Object lock = new Object();
	public static class PlusTask implements Runnable{

		@Override
		public void run() {
			for (int j = 0; j < 10000; j++) {
				synchronized (lock) {
					i++;
				}
//				i++;
			}
		}
		
	}
	public static void main(String[] args) throws InterruptedException {
		Thread[] threads = new Thread[10];
		for (int i = 0; i < 10; i++) {
			threads[i] = new Thread(new PlusTask());
			threads[i].start();
		}
		
		for (int i = 0; i < 10; i++) {
			threads[i].join();
		}
		System.out.println("i:"+i);
	}
}
