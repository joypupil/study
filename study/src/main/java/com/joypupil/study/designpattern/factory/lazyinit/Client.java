package com.joypupil.study.designpattern.factory.lazyinit;

public class Client {

	public static void main(String[] args) {
		Product product11 = ProductFactory.createProduct("product1");
		Product product12 = ProductFactory.createProduct("product1");
		System.out.println(product11 == product12);
		Product product2 = ProductFactory.createProduct("product2");
		product2.method2();
	}

}
