package com.joypupil.study.design_pattern.template_method;

public class ConcreteClass1 extends AbstractClass {

	//实现基本方法
	@Override
	protected void doSomething() {
		//业务逻辑处理
		System.out.println("方法1----");
	}

	@Override
	protected void doAnything() {
		//业务逻辑处理
		System.out.println("方法1逻辑");
	}

}
