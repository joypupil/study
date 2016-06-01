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
        String a = "OezXcEiiBSKSxW0eoylIeLbsjadu3GSPNwTivQl3TVawdD-sOg865ty-3JrlxYAAzfwNDTMY9Jq37oUW-u7tgxccxvTHO8EFQf3DXC4JMAB9L5GoKuEH9GfNIraeucIYHxXKyuCwRagdhD6nWhkb9A";
        System.out.println(a.length());
        String b = "bbb";
        b.replaceFirst("b", "D:\\abc\\def\\");
	}

}
