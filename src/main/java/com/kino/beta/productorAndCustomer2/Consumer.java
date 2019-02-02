package com.kino.beta.productorAndCustomer2;

import java.text.MessageFormat;
import java.util.Random;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class Consumer implements Runnable {

	private BlockingQueue<PCData> queue;
	private static final int SLEEPTIME = 10000;

	public Consumer(BlockingQueue<PCData> queue) {
		super();
		this.queue = queue;
	}

	@Override
	public void run() {
		PCData data = null;
		Random r = new Random();
		System.out.println("start consumer id:" + Thread.currentThread().getId());

		try {
			while (true) {
				data = queue.take();
				if (null!=data) {
					int re = data.getIntData()*data.getIntData();
					System.out.println(MessageFormat.format("{0}*{1}={2}", data.getIntData(),data.getIntData(),re)+" 队列数量："+queue.size());
					Thread.sleep(r.nextInt(SLEEPTIME));
				}
				
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Thread.currentThread().interrupt();
		}

	}
	

}
