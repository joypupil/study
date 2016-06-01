package com.joypupil.study.test.随意的东西;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Test1 {

	public static void main(String[] args) {
		Map<String, Integer> map = new ConcurrentHashMap<String, Integer>();
		map.put("aaa", 10);
		int i = map.get("aaa");
		System.out.println(i);

	}

}
