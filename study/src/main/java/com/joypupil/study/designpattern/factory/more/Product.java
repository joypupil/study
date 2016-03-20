package com.joypupil.study.designpattern.factory.more;

public abstract class Product {
	
	//产品类的公共方法
	public void method1(){
		System.out.println("这是一个公共方法");
	}
	
	//抽象发现
	public abstract void method2();

}
