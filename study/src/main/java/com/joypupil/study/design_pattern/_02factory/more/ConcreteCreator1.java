package com.joypupil.study.design_pattern._02factory.more;

public class ConcreteCreator1 extends Creator {

//	@SuppressWarnings("unchecked")
	@Override
	public ConcreteProduct1 creteProduct() {
		return new ConcreteProduct1();
	}

}
