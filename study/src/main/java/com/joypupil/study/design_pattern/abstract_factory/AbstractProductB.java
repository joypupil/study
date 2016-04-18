package com.joypupil.study.design_pattern.abstract_factory;

public abstract class AbstractProductB {
	//每个产品共有的方法
	public void shareMehtod(){
		System.out.println("产品B共有功能");
	}
	
	//每个产品相同方法，不同实现
	public abstract void doSomething();

}
