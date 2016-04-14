package com.joypupil.study.test.一些蛋疼的东西.输出顺序;

public class A {
	A(){
		System.out.println("A-----");
	}
	
	{System.out.println("A code");}
	static{System.out.println("A static code");}

}
