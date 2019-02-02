package com.kino.beta.productorAndCustomer;

import java.util.Random;

public class EaterThread extends Thread {

	private final Random random;
	private final Table table;
	
	
	public EaterThread(String name, Table table,long seed) {
		super(name);
		this.random = new Random(seed);
		this.table = table;
	}


	@Override
	public void run() {
		
		try {
			while (true) {
				table.take();
				Thread.sleep(this.random.nextInt(1000));
			}
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
