package com.joypupil.study.design_pattern.proxy;

public class Proxy implements Subject {
	
	//要代理哪个实现类
	private Subject subjcet = null;
	
	//默认被代理者
//	public Proxy(){
//		this.subjcet = new Proxy();
//	}
	
	//通过构造函数传递代理者
//	public Proxy(Object... ojbects){
//		
//	}
	
	public Proxy(Subject _subject){
		this.subjcet = _subject;
	}

	@Override
	public void request() {
		before();
		subjcet.request();
		after();
	}
	
	//预处理
	private void before(){
		//do something
		System.out.println("预处理");
	}
	
	//善后处理
	private void after(){
		//do something
		System.out.println("善后处理");
	}

}
