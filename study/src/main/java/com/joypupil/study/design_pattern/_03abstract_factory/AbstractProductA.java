package com.joypupil.study.design_pattern._03abstract_factory;

/**
 * 抽象产品类
 * @author hezikang
 *
 */
public abstract class AbstractProductA {
	//每个产品共有的方法
	public void shareMehtod(){
		System.out.println("产品A共有功能");
	}
	//每个产品相同方法，不同实现
	public abstract void doSomething();

}
