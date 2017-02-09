package com.joypupil.study.test.正则匹配;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegUtil {
	
	public static boolean includeLettersAndNumbers(String str){
		String regex = "^[a-z0-9A-Z_]+$";
		 return str.matches(regex);
	}
	
	public static void main(String[] args){
//		System.out.println(includeLettersAndNumbers("asdfs/123"));
//		System.out.println(includeLettersAndNumbers("asdfs123"));
//		System.out.println(includeLettersAndNumbers("asdfs.123"));
//		System.out.println(includeLettersAndNumbers("asdfs_123"));
//		System.out.println(includeLettersAndNumbers("asdfs345!123"));
//		System.out.println(includeLettersAndNumbers("asdfs@123"));
//		System.out.println(includeLettersAndNumbers("asdfs#123"));
//		System.out.println(includeLettersAndNumbers("asdfs$123"));
		reg();
	}
	
	/**
	 * 取出字符串中的正则匹配项
	 */
	public static void reg(){
		Pattern pattern = Pattern.compile("\\[BIM\\+[A-Za-z0-9]{32}\\+((?!\\+BIM\\]).)+\\+BIM\\]");
		Matcher matcher = pattern.matcher("aaa[BIM+ASDF123123qazxswedc1123qwe23fd23+水电费。是的.txt+BIM]d[23][3a]d[4]ege");
		while(matcher.find()){
			String info = matcher.group();
			System.out.println(info.substring(5, info.length() - 5));
			info = info.substring(5, info.length() - 5);
			int a = info.indexOf("+");
			System.out.println(info.substring(0, 32));
			System.out.println(info.substring(33, info.length()));
		}
	}

}
