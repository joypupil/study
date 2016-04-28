package com.joypupil.study.design_pattern.template_method.基于组合的模板方法;

public class Client {

	public static void main(String[] args) {
		AbstractClass c = new AbstractClass();
		c.add(1);
		c.delete(1);
		c.add(2);
	}

}
