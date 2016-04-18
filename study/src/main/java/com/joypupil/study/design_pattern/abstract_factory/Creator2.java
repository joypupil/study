package com.joypupil.study.design_pattern.abstract_factory;

public class Creator2 extends AbstractCreator {

	@Override
	public AbstractProductA createProductA() {
		return new ProductA2();
	}

	@Override
	public AbstractProductB createProductB() {
		return new ProductB2();
	}

}
