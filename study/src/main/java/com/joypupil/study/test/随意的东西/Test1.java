package com.joypupil.study.test.随意的东西;

import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

import org.apache.commons.codec.digest.DigestUtils;

public class Test1 {

	public static void main(String[] args) {
		Map<String, Integer> map = new ConcurrentHashMap<String, Integer>();
		map.put("aaa", 10);
		int i = map.get("aaa");
		System.out.println(i);
		
		System.out.println(UUID.randomUUID().toString().replaceAll("-", ""));
		System.out.println(DigestUtils.md5Hex("bimyun"));
		System.out.println(System.currentTimeMillis());
	}

}
