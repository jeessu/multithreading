package com.kino.beta.single;

public class MyObject {

	private static MyObject object =new MyObject();
	
	private MyObject() {
		// TODO Auto-generated constructor stub
	}
	
	public static MyObject getInstance() {
		// TODO Auto-generated method stub

		return object;
	}
	
}
