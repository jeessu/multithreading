package com.kino.beta.single.thisAndCurrentThread;

public class Test02 {

	public static void main(String[] args) {
		MyThread02 target = new MyThread02();
        Thread thread = new Thread(target);
        thread.setName("A");
        thread.start();
	}
}
