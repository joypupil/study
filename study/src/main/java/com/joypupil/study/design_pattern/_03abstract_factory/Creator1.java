package com.joypupil.study.design_pattern._03abstract_factory;

public class Creator1 extends AbstractCreator {

	@Override
	public AbstractProductA createProductA() {
		return new ProductA1();
	}

	@Override
	public AbstractProductB createProductB() {
		return new ProductB1();
	}

}
