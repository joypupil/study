package com.joypupil.study.design_pattern.factory.more;

public class Client {

	public static void main(String[] args) {
		Product product = (new ConcreteCreator1()).creteProduct();
		product.method1();
		product.method2();
		Product product2 = (new ConcreteCreator2()).creteProduct();
		product2.method1();
		product2.method2();
	}

}
