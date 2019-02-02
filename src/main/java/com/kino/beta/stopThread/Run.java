package com.kino.beta.stopThread;

public class Run {

	public static void main(String[] args) {

		try {
			MyThread myThread = new MyThread();
			myThread.start();
			Thread.sleep(1000);

			myThread.interrupt();
		} catch (InterruptedException e) {
			System.out.println("main catch...");
			e.printStackTrace();
		}

		System.out.println("----end----");

	}
}
