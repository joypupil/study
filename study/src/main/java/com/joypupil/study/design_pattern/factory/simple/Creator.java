package com.joypupil.study.design_pattern.factory.simple;

public class Creator {
	
	public static <T extends Product> T creteProduct(Class<T> c) {
		Product product = null;
		try{
			product = (Product) Class.forName(c.getName()).newInstance();
		}catch(Exception e){
			System.out.println("出BUG啦");
		}
		return (T) product;
	}

}
