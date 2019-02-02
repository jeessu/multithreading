package com.kino.beta.reentrantReadWriteLock;

public class RunMainRW {

	public static void main(String[] args) {
		final Service service = new Service();
		Thread a = new Thread(){
			@Override
			public void run() {
				// TODO Auto-generated method stub
				service.read();
			}
		};
		a.start();
		
		Thread b = new Thread(){
			@Override
			public void run() {
				// TODO Auto-generated method stub
				service.read();
			}
		};
		b.start();
		
	}
}
