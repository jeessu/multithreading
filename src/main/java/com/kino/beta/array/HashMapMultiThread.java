package com.kino.beta.array;

import java.util.HashMap;
import java.util.Map;

public class HashMapMultiThread {

	static Map<String, String> map = new HashMap<String, String>();
	
	public static class addThread implements Runnable{

		int start = 0;
		
		public addThread(int start) {
			super();
			this.start = start;
		}

		@Override
		public void run() {
			for (int i = start; i < 1000000; i+=2) {
				map.put(Integer.toString(i), Integer.toBinaryString(i));
			}
			
		}
		
	}
	public static void main(String[] args) throws InterruptedException {
		Thread thread1 = new Thread(new HashMapMultiThread.addThread(0));
		Thread thread2 = new Thread(new HashMapMultiThread.addThread(1));
		
		thread1.start();
		thread2.start();
		
		thread1.join();
		thread2.join();

		System.out.println(map.size());
	}

}
