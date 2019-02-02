package com.kino.beta.swap;

import java.lang.reflect.Field;

public class swapTest {

	public static void main(String[] args) {


		Integer a=2,b=5;
		
		swap(a, b);//交换失败
		System.out.println("1. a=="+a +" ,b=="+b);
		
		swap3(a, b);//交换成功
		System.out.println("2. a=="+a +" ,b=="+b);
		
		int[] aa={a,b};
		swap2(aa, 0, 1);//交换成功
		System.out.println("3. a=="+aa[0] +" ,b=="+aa[1]);
		
	}
	/**
	 * 交换方式一   交换失败
	 * 交换的为值传递 无法改变入参的真正数值
	 * @param a
	 * @param b
	 */
	public static void swap(int a,int b){
		int temp = a;
		a =b;
		b=temp;
	}
	/**交换方式二
	 * 可以利用数组进行交换，或者定义一个对象进行交换
	 * @param array
	 * @param a
	 * @param b
	 */
	public static void swap2(int[] array,int a,int b){
		int temp = array[a];
		array[a] =array[b];
		array[b]=temp;
	}
	
	/**
	 * 方式三  优秀
	 * 交换两个数
	 * 传入参数 数据类型需要为Integer 若为int 交换失败
	 * 
	 * set(Object obj, Object value) ： 向obj对象的这个Field设置新值value
	 * @param a
	 * @param b
	 */
	public static void swap3(Integer a,Integer b){
		int temp = a.intValue();
		Field value;
		try {
			//类的反射机制
			value = Integer.class.getDeclaredField("value");
			value.setAccessible(true);//设置可以访问私有变量
			value.set(a, b);
			value.set(b, new Integer(temp));
		} catch (NoSuchFieldException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		
	}
	
}
