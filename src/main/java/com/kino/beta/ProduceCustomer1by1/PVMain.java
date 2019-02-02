package com.kino.beta.ProduceCustomer1by1;

public class PVMain {

	public static void main(String[] args) throws InterruptedException {
		Object lock = new Object();
		
		P p = new P(lock);
		V v = new V(lock);
		Thread pt=new ThreadP(p);
		Thread pv=new ThreadV(v);
		pt.start();
		pv.start();
	}
}
