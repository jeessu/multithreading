package com.kino.beta.ProduceCustomer1by1;

public class V{

	private Object lock;
	
	public V(Object lock) {
		super();
		this.lock = lock;
	}

	public void getValue() {
		
		try {
			synchronized (lock) {
				if (ValueObject.value.equals("")) {
					lock.wait();
				}
				
				System.out.println("----消费者开始消费啦");
				ValueObject.value="";
				System.out.println("----已经消费完成咯");
				lock.notify();
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
