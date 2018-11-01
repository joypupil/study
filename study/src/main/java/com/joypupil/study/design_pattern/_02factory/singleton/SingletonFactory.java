package com.joypupil.study.design_pattern._02factory.singleton;

import java.lang.reflect.Constructor;

public class SingletonFactory {
	
	private static Singleton singleton;
	
	static{
		try{
			Class cl = Class.forName(Singleton.class.getName());
			//获得无参构造函数
			Constructor constructor = cl.getDeclaredConstructor();
			//设置无参构造函数可访问
			constructor.setAccessible(true);
			//产生一个实例
			singleton = (Singleton) constructor.newInstance();
		}catch (Exception e) {
			System.out.println("出BUG啦");
		}
	}
	
	public static Singleton getInstance(){
		return singleton;
	}

}
