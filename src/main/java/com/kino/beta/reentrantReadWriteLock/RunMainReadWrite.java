package com.kino.beta.reentrantReadWriteLock;

public class RunMainReadWrite {

	public static void main(String[] args) {
		final ServiceReadWrite service = new ServiceReadWrite();
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
				service.write();
			}
		};
		b.start();
		
	}
}
