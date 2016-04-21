package com.joypupil.study.design_pattern.template_method;

public abstract class AbstractClass {
	//基本方法
	protected abstract void doSomething();
	
	//基本方法
	protected abstract void doAnything();
	
	//模板方法(有时候为了防止恶意的操作，会将模板方法用final修饰)
	public final void templateMehtod(){
		System.out.println("公共逻辑");
		/*
		 * 调用基本方法，完成相关的逻辑
		 */
		this.doAnything();
		this.doSomething();
	}

}
