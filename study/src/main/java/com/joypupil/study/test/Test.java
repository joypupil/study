package com.joypupil.study.test;


public class Test {
	
	public void a(){
		System.out.println("Test");
	}
	
	public static void main(String[] args){
		String type = "aaa";
		type = type.toLowerCase();
		char[] cs=type.toCharArray();
        cs[0]-=32;
        type = String.valueOf(cs);
        System.out.println(type);
	}

}
