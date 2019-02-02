package com.kino.beta.productorAndCustomer;

import java.util.Random;

public class MakerThread extends Thread {

	private final Random random;
	private final Table table;
	private static int id = 0;
	
	public MakerThread(String name, Table table,long seed) {
		super(name);
		this.random = new Random(seed);
		this.table = table;
	}


	@Override
	public void run() {
		
		try {
			while (true) {
				Thread.sleep(this.random.nextInt(1000));
				String cake = "[ Cake No."+nextId()+" by"+Thread.currentThread().getName();
				table.put(cake);;
			}
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private static synchronized int nextId() {
		
		return id++;
	}
}
