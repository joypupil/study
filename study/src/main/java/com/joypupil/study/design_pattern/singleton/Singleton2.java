package com.joypupil.study.design_pattern.singleton;


/**
 * 一样可以实现单例，但是获取的时候加了synchronized修饰用来保证线程安全，建议用另一种单例
 * @author hezikang
 * @version 2016/03/18
 *
 */
public class Singleton2 {
	
	private static Singleton2 singleton2 = null;
	
	private int count;
	
	private Singleton2(){
		
	}
	
	public static synchronized Singleton2 getInstance(){
		if(singleton2 == null){
			singleton2 = new Singleton2();
		}
		return singleton2;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

}
