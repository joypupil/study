package com.joypupil.study.design_pattern._02factory.singleton;

public class Client {

	public static void main(String[] args) {
		Singleton singleton = SingletonFactory.getInstance();
		Singleton singleton2 = SingletonFactory.getInstance();
		singleton.method1();
		singleton.method2();
		singleton2.method1();
		singleton2.method2();
		System.out.println(singleton == singleton2);
	}

}
