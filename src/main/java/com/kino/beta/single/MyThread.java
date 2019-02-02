package com.kino.beta.single;

public class MyThread extends Thread{
	
	public MyThread() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
//		MyObject.getInstance().
		System.out.println(MyObject.getInstance().hashCode());
	}
}
