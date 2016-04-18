package com.joypupil.study.design_pattern.singleton;

/**
 * 单例模式
 * @author hezikang
 * @version 2016/03/18
 *
 */
public class Singleton {
	
	private static final Singleton singleton = new Singleton();
	
	private int count;
	
	private Singleton(){
		
	}
	
	public static Singleton getInstance(){
		return singleton;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

}
