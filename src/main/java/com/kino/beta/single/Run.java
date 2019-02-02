package com.kino.beta.single;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyThread[] th = new MyThread[100];
		
		for (int i = 0; i < th.length; i++) {
			th[i] =new MyThread();
		}
		
		for (int i = 0; i < th.length; i++) {
			th[i].start();
		}
		
	}

}
