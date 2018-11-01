package com.joypupil.study.design_pattern._01singleton;

public class Test {

	public static void main(String[] args) {
		test1();
		test2();
	}
	
	private static void test1(){
		Singleton singleton = Singleton.getInstance();
		Singleton singleton2 = Singleton.getInstance();
		System.out.println(singleton.getCount());
		singleton2.setCount(100);
		System.out.println(singleton.getCount());
		System.out.println(singleton == singleton2);
	}
	
	private static void test2(){
		Singleton2 singleton = Singleton2.getInstance();
		Singleton2 singleton2 = Singleton2.getInstance();
		System.out.println(singleton.getCount());
		singleton2.setCount(100);
		System.out.println(singleton.getCount());
		System.out.println(singleton == singleton2);
	}

}