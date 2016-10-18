package com.joypupil.study.test.字符串截取;

public class Test {

	public static void main(String[] args) {
		String str = "abcdefg";
		int i = str.length();
		System.out.println(str.substring(0, i));
		System.out.println(str.substring(0, i-2));
		System.out.println(str.substring(i-3, i-1));
		
	}

}
