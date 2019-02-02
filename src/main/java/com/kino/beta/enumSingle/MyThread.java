package com.kino.beta.enumSingle;

import java.util.Date;

public class MyThread extends Thread{

	@Override
	public void run() {
		for (int i = 0; i < 2; i++) {
			System.out.println("time-"+new Date()+"  hashcode："+MyObject.connectionFactory.getConnection().hashCode());
			;
		}
	}
}
