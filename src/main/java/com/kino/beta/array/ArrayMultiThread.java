package com.kino.beta.array;

import java.util.ArrayList;
import java.util.UUID;
import java.util.Vector;

public class ArrayMultiThread {

//	static ArrayList<Integer> a1 = new ArrayList<Integer>();
	static Vector<Integer> a1 = new Vector<>();//线程安全
	public static class addThread implements Runnable{

		@Override
		public void run() {
			for (int i = 0; i < 100000; i++) {
				a1.add(1);
			}
			
		}
		
	}
	public static void main(String[] args) throws InterruptedException {
		
//		Thread thread1 = new Thread(new addThread());
//		Thread thread2 = new Thread(new addThread());
//		thread1.start();
//		thread2.start();
//		thread1.join();
//		thread2.join();
		System.out.println(UUID.randomUUID().toString().replace("-", ""));
		System.out.println(a1.size());
	}
}
