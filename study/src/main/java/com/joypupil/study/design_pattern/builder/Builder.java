package com.joypupil.study.design_pattern.builder;

/**
 * 抽象建造者</br>
 * setPart方法是零件的配置，零件就是其他对象或者是不同的装配顺序，这样就可能产生不同的产品
 * @author hezikang
 *
 */
public abstract class Builder {
	
	//设置产品的不同部分，以获得不同的产品
	public abstract void setPart();
	//建造产品
	public abstract Product buildProduct();

}
