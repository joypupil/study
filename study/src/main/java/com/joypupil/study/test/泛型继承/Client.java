package com.joypupil.study.test.泛型继承;

public class Client {
	
	public static void main(String[] args){
		AbstractCC<A, B, C> aa = new AbstractCC<A, B, C>();
		AbstractBB<A, B, C> dd = new DD();
	}

}
