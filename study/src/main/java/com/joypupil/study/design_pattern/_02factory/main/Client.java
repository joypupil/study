package com.joypupil.study.design_pattern._02factory.main;

public class Client {

	public static void main(String[] args) {
		Creator creator = new ConcreteCreator();
		Product product = creator.creteProduct(ConcreteProduct2.class);
		product.method1();
		product.method2();
	}

}
