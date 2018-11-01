package com.joypupil.study.design_pattern._02factory.more;

public class ConcreteCreator2 extends Creator {

	@Override
	public ConcreteProduct2 creteProduct() {
		return new ConcreteProduct2();
	}

}
