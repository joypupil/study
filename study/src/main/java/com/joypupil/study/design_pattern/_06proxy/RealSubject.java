package com.joypupil.study.design_pattern._06proxy;

/**
 * 真实主题类
 * @author hezikang
 *
 */
public class RealSubject implements Subject {

	@Override
	public void request() {
		//业务逻辑
		System.out.println("真实主题实现");
	}

}
