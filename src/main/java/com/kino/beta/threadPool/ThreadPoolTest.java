package com.kino.beta.threadPool;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Vector;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPoolTest {

	
	class MyTask implements Runnable{
		private int taskNum;
		
		public MyTask(int taskNum) {
			super();
			this.taskNum = taskNum;
		}

		@Override
		public void run() {
			
			System.out.println("正在执行任务："+taskNum);
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("任务执行完毕："+taskNum);
		}
		
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		Random r =  new Random();
		Math.random();
		System.out.println(r.nextInt(500)+" :"+Math.random());
		for (int i = 0; i < 1000; i++) {
			System.out.println(250+r.nextInt(250)+" :"+(int)(Math.random()*1000));
		}
		final ThreadLocal<Integer> a = new ThreadLocal<Integer>();
		System.out.println("----"+a.toString());
		a.set(1);
		System.out.println(a.get());List<Integer> aa = new ArrayList(); Vector<String> bb = new Vector<>();
//		new Thread(new Runnable() {
//			
//			@Override
//			public void run() {
//				System.out.println(a.get());
//				a.set(5);
//				System.out.println(a.get());
//			}
//		}).start();
		System.out.println("----------"+a.toString());
		a.set(3);
		System.out.println(a.get());
		
//		ThreadPoolExecutor executor = new ThreadPoolExecutor(5, 10, 200, TimeUnit.MILLISECONDS,
//                new ArrayBlockingQueue<Runnable>(5));
//         
//        for(int i=0;i<15;i++){
//            MyTask myTask = new ThreadPoolTest().new MyTask(i);
//            executor.execute(myTask);
//            System.out.println("线程池中线程数目："+executor.getPoolSize()+"，队列中等待执行的任务数目："+
//            executor.getQueue().size()+"，已执行玩别的任务数目："+executor.getCompletedTaskCount());
////            Thread.sleep(2000);
//        }
//        
//        executor.shutdown();
	}
}
