package com.kino.beta.reentrantlock;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyService {

	private Lock lock = new ReentrantLock();
	private Condition conditionA = lock.newCondition();
	private Condition conditionB = lock.newCondition();
	
	public void waitA(){
		
		try {
			lock.lock();
			System.out.println("waitA lock, name:"+Thread.currentThread().getName());
			conditionA.await();
			System.out.println("---------conditionA await() :"+Thread.currentThread().getName());
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			lock.unlock();
		}
	}
	
	public void waitB(){
		
		try {
			lock.lock();
			System.out.println("waitB lock name:"+Thread.currentThread().getName());
			conditionB.await();
			System.out.println("---------conditionB await() :"+Thread.currentThread().getName());
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			lock.unlock();
		}
	}

	public void notifyA(){
		try {
			lock.lock();
			System.out.println("notifyA threadname:"+Thread.currentThread().getName()+" lock");
			conditionA.signalAll();
			System.out.println("notifyA time:"+System.currentTimeMillis());
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			lock.unlock();
		}
	}
	
}
