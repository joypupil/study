package com.joypupil.study.designpattern.factory;

public abstract class Creator {
	
	public abstract <T extends Product> T creteProduct(Class<T> c);

}
