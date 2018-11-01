package com.joypupil.study.design_pattern._05builder;

/**
 * 导演类</br>
 * 导演类起到封装的作用，避免高层模块深入到建造者内部的实现类
 * @author hezikang
 *
 */
public class Director {
	
	private Builder builder = new ConcreteProduct();
	
	//构建不同的产品
	public Product getAProduct(){
		builder.setPart();
		/*
		 * 设置不同的零件，产生不同的产品
		 */
		return builder.buildProduct();
	}

}
