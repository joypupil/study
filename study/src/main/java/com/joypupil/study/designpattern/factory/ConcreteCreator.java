package com.joypupil.study.designpattern.factory;

public class ConcreteCreator extends Creator {

//	@SuppressWarnings("unchecked")
	@Override
	public <T extends Product> T creteProduct(Class<T> c) {
		Product product = null;
		try{
			product = (Product) Class.forName(c.getName()).newInstance();
		}catch(Exception e){
			System.out.println("出BUG啦");
		}
		return (T) product;
	}

}
