package com.kino.beta.yieldThread;

public class YieldThread extends Thread{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		
		long beginTime = System.currentTimeMillis();
		
		int count = 0;
		for (int i = 0; i < 5000000; i++) {
			
			Thread.yield();
			count = count+(i+1);
//			System.out.println("i="+(i+1));
		}
		
		long endTime = System.currentTimeMillis();
		
		System.out.println("用时："+(endTime-beginTime) +"毫秒");
		
	}
	
	
	public static void main(String[] args) {
		
		YieldThread thread = new YieldThread();
		
		thread.start();
	}
}
