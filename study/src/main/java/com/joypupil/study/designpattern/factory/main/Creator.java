package com.joypupil.study.designpattern.factory.main;

public abstract class Creator {
	
	public abstract <T extends Product> T creteProduct(Class<T> c);

}
