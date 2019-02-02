package com.kino.beta.ProduceCustomer1by1;

public class ThreadV extends Thread {

	private V v;
	
	public ThreadV(V v) {
		super();
		this.v = v;
	}

	@Override
	public void run() {
		while (true) {
			v.getValue();
		}
	}
}
