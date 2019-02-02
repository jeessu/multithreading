package com.kino.beta.single.iTest;

public class RunMain {

	public static void main(String[] args) {
		iTest test= new iTest();
		
		Thread a=new Thread(test, "A");
		Thread b=new Thread(test, "b");
		Thread c=new Thread(test, "c");
		Thread d=new Thread(test, "d");
		Thread e=new Thread(test, "e");
		
		a.start();
		b.start();
		c.start();
		d.start();
		e.start();

	}

}
