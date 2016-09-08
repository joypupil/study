package com.joypupil.study.test.正则匹配;

import java.util.regex.Pattern;

public class RegUtil {
	
	public static boolean includeLettersAndNumbers(String str){
		String regex = "^[a-z0-9A-Z_]+$";
		 return str.matches(regex);
	}
	
	public static void main(String[] args){
		System.out.println(includeLettersAndNumbers("asdfs/123"));
		System.out.println(includeLettersAndNumbers("asdfs123"));
		System.out.println(includeLettersAndNumbers("asdfs.123"));
		System.out.println(includeLettersAndNumbers("asdfs_123"));
		System.out.println(includeLettersAndNumbers("asdfs345!123"));
		System.out.println(includeLettersAndNumbers("asdfs@123"));
		System.out.println(includeLettersAndNumbers("asdfs#123"));
		System.out.println(includeLettersAndNumbers("asdfs$123"));
	}

}
