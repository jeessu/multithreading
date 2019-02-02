package com.kino.beta.reentrantReadWriteLock;

public class RunMainReadRead {

	public static void main(String[] args) {
		final ServiceReadRead service = new ServiceReadRead();
		Thread a = new Thread(){
			@Override
			public void run() {
				// TODO Auto-generated method stub
				service.write();
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
