package com.kino.beta.single.iTest;

import java.util.concurrent.atomic.AtomicInteger;

public class iTest extends Thread{

	private int p=5;
//	private AtomicInteger p=new AtomicInteger(5);
	@Override
	public void run() {
		//super.run();
		p--;
		System.out.println(this.currentThread().getName()+"修改了 p="+p);
	}
}
