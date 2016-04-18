package com.joypupil.study.design_pattern.factory.simple;

public class Client {

	public static void main(String[] args) {
//		Creator creator = new ConcreteCreator();
		Product product = Creator.creteProduct(ConcreteProduct1.class);
		product.method1();
		product.method2();
	}

}
