package com.kino.beta.interrupt;

public class InterruptTest {

	public static void main(String[] args) throws InterruptedException {
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				while (true) {
					if (Thread.currentThread().isInterrupted()) {
						System.out.println("Interrupted");
						break;
					}
					try {
						Thread.sleep(1500);
					} catch (InterruptedException e) {Thread.currentThread().suspend();
						// TODO Auto-generated catch block
//						e.printStackTrace();
						System.out.println("eeee");
						Thread.currentThread().interrupt();
					}
					Thread.yield();
				}
			}
		});
		
		
		t1.start();
		Thread.sleep(1000);
		t1.interrupt();
	}
	
	
	
}
