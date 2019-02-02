package com.kino.beta.reentrantReadWriteLock;

import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Service {

	private ReentrantReadWriteLock lock = new ReentrantReadWriteLock();
	
	public void read(){
		try {
			
			lock.readLock().lock();
			System.out.println("Thread Name:"+Thread.currentThread().getName()+" 时间："+System.currentTimeMillis());
			Thread.sleep(5000);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
