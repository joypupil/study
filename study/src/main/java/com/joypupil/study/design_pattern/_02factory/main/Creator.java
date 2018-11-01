package com.joypupil.study.design_pattern._02factory.main;

public abstract class Creator {
	
	public abstract <T extends Product> T creteProduct(Class<T> c);

}
