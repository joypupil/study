package com.joypupil.study.designpattern.factory.more;

public class ConcreteCreator1 extends Creator {

//	@SuppressWarnings("unchecked")
	@Override
	public ConcreteProduct1 creteProduct() {
		return new ConcreteProduct1();
	}

}
