package com.kino.beta.productorAndCustomer2;

import java.util.Random;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class Producer implements Runnable {

	private volatile boolean isRuning = true;
	private BlockingQueue<PCData> queue;
	private AtomicInteger count = new AtomicInteger();
	private static final int SLEEPTIME = 1000;

	public Producer(BlockingQueue<PCData> queue) {
		super();
		this.queue = queue;
	}

	@Override
	public void run() {
		PCData data = null;
		Random r = new Random();
		System.out.println("start producer id:" + Thread.currentThread().getId());

		try {
			while (isRuning) {
				Thread.sleep(r.nextInt(SLEEPTIME));
				data = new PCData(count.incrementAndGet());
				System.out.println("data is put into queue.->"+data);
				if (!queue.offer(data,2,TimeUnit.SECONDS)) {
					System.out.println("fail to put data:"+data);
				}
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Thread.currentThread().interrupt();
		}

	}
	
	public void stop() {
		// TODO Auto-generated method stub
		this.isRuning = false;
		System.out.println(" stop thread id:"+Thread.currentThread().getId());
	}

}
