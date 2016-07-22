package com.joypupil.study.test.测试删除数组元素;

import java.util.ArrayList;
import java.util.List;

public class client {

	public static void main(String[] args) {
		List<String> a = new ArrayList<String>();
		a.add("aaa");
		a.add("bbb");
		System.out.println(a.contains("aaa"));
		System.out.println(a.contains("ccc"));
		a.remove("ccc");
		System.out.println(a.toString());
		a.remove("aaa");
		System.out.println(a.toString());
		System.out.println(a.size());
		int m = 1;
		get(m);
		System.out.println(m);
	}
	
	public static void get(int m){
		m = 10;
	}

}
