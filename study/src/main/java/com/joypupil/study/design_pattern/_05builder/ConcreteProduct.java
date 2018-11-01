package com.joypupil.study.design_pattern._05builder;

/**
 * 具体建造者</br>
 * 如果有多个产品类就有几个具体的建造者，而且这多个产品类具有相同接口或抽象类。
 * @author hezikang
 *
 */
public class ConcreteProduct extends Builder {
	
	private Product product = new Product();

	@Override
	public void setPart() {
		/*
		 * 产品类内的逻辑处理
		 */

	}

	//组建一个产品
	@Override
	public Product buildProduct() {
		return product;
	}

}
