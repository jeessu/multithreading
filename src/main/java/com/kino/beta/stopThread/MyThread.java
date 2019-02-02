package com.kino.beta.stopThread;

public class MyThread extends Thread{

//	@Override
//	public void run() {
//		// TODO Auto-generated method stub
//		super.run();
//		for (int i = 0; i < 500000; i++) {
//			if (this.interrupted()) {
//				System.out.println("已经是停止状态了，我偶要退出。");
//				
//				break;//break方式的退出  在程序for下面还有的代码还是继续执行
//			}
//			System.out.println("i="+(i+1));
//		}
//		
//		System.out.println("for下面还有的语句");
//	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		try {
			for (int i = 0; i < 500000; i++) {
				if (this.interrupted()) {
					System.out.println("已经是停止状态了，我偶要退出。");
					
//					throw new InterruptedException();//异常法退出
					return;
//					break;//break方式的退出  在程序for下面还有的代码还是继续执行
				}
				System.out.println("i="+(i+1));
			}
			
			System.out.println("for下面还有的语句");
			
		} catch (Exception e) {
			System.out.println("进入MyThread的catch方法 ");
			e.printStackTrace();
		}
		
	}
	
	
}
