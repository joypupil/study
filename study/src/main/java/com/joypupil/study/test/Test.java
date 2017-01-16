package com.joypupil.study.test;

import java.security.NoSuchAlgorithmException;
import java.util.UUID;

import com.joypupil.study.tools.求MD5.MD5Util;

public class Test {
	
	public void a(){
		System.out.println("Test");
	}
	
	public static void main(String[] args) throws NoSuchAlgorithmException{
//		String type = "aaa";
//		type = type.toLowerCase();
//		char[] cs=type.toCharArray();
//        cs[0]-=32;
//        type = String.valueOf(cs);
//        System.out.println(type);
//        String a = "OezXcEiiBSKSxW0eoylIeLbsjadu3GSPNwTivQl3TVawdD-sOg865ty-3JrlxYAAzfwNDTMY9Jq37oUW-u7tgxccxvTHO8EFQf3DXC4JMAB9L5GoKuEH9GfNIraeucIYHxXKyuCwRagdhD6nWhkb9A";
//        System.out.println(a.length());
//        String b = "bbb";
//        b.replaceFirst("b", "D:\\abc\\def\\");
//		System.out.println(0l == 0);
		System.out.println(UUID.randomUUID().toString().replace("-", ""));
	}

}
