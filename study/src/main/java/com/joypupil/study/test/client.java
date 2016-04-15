package com.joypupil.study.test;

import com.joypupil.study.application.component.aop.LogProxy;

/**
 * 动态代理搞不定了，等我去看看书
 * @author hezikang
 *
 */
public class client {
	
	public static void main(String args[]){
		Object t = LogProxy.getInstace(new Test());
		t.toString();
		System.out.println(t instanceof LogProxy);
		System.out.println(t.toString());
	}
	
}