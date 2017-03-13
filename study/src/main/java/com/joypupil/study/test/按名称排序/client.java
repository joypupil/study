package com.joypupil.study.test.按名称排序;

import java.text.Collator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;

/**
 * 字符串排序（中文按拼音排序，而不是ASCII码）
 * @author hezikang
 *
 */
public class client {
	
	public static void main(String[] args){
		String[] strs = {"张三(Z)", "李四(L)", "王五(W)","123","abc","def","2F","23F","和1","和气"};  
		// 定义一个中文排序器  
		Comparator c = Collator.getInstance(Locale.CHINA);  
		// 升序排序  
		Arrays.sort(strs, c);
		System.out.println(strs.toString());
		//数组排序方法
		sortList();
	}
	
	private static void sortList(){
		List<String> strs = new ArrayList<String>();
		strs.add("张三(Z)");
		strs.add("李四(L)");
		strs.add("王五(W)");
		Collections.sort(strs, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				return Collator.getInstance(Locale.CHINA).compare(o1, o2);
			}
		});
		System.out.println(strs.toString());
	}

}
