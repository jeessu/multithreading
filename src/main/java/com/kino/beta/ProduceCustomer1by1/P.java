package com.kino.beta.ProduceCustomer1by1;

public class P {

	private Object lock;
	
	public P(Object lock) {
		super();
		this.lock = lock;
	}

	
	public void setValue() {
		
		try {
			synchronized (lock) {
				if (!ValueObject.value.equals("")) {
					lock.wait();
				}
				
				System.out.println("--生产者开始生产");
				ValueObject.value="生产资料";
				System.out.println("--生产者生产结束");
				lock.notify();
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
