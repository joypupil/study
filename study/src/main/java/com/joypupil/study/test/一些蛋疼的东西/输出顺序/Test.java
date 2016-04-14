package com.joypupil.study.test.一些蛋疼的东西.输出顺序;


/**
 * 通过输出顺序来看运行过程
 * @author hezikang
 *
 */
public class Test extends A{

	public Test() {
		System.out.println("Test=========");
	}
	
	{System.out.println("Test code");}
	
	static{System.out.println("Test static code");}
	
	public static void main(String[] args) {
		new Test();
	}

}
