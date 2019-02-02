package com.kino.beta.reentrantlock;

public class RunMain {

	public static void main(String[] args) {
		MyService myService = new MyService();
		Thread[] a = new Thread[5];
		Thread b = new ThreadB(myService);
		Thread c = new ThreadC(myService);
		for (int i = 0; i < a.length; i++) {
			a[i]= new ThreadA(myService);
		}
		for (int i = 0; i < a.length; i++) {
			a[i].start();
		}
		
		b.start();
		
		c.start();
	}

}
