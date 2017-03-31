package com.joypupil.study.test;

import java.math.BigDecimal;
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
//		System.out.println(System.currentTimeMillis());
//		System.out.println(MD5Util.getMD5("vanke.com"));
//		String[] a = new String[]{null};
//		System.out.println(a[0]);
//		BigDecimal b = new BigDecimal(1/3);
//		BigDecimal d = new BigDecimal(1/3);
//		System.out.println(b.subtract(d).floatValue() == 0f);
//		testTryCatch();
	}
	
	public static void testTryCatch(){
		try{
			try{
				System.err.println(1);
			} catch(Exception e){
				System.err.println(2);
			} finally {
				System.err.println(3);
			}
			System.err.println(4);
		} catch(Exception e){
			System.err.println(5);
		} finally {
			System.err.println(6);
		}
		
	}

}
