package com.kino.beta.reentrantReadWriteLock;

import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ServiceReadRead {

	private ReentrantReadWriteLock lock = new ReentrantReadWriteLock();
	
	public void write(){
		try {
			
			lock.writeLock().lock();
			System.out.println("Thread Name:"+Thread.currentThread().getName()+" 时间："+System.currentTimeMillis());
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			lock.writeLock().unlock();
		}
	}
}
