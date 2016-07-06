package com.joypupil.study.test.序列化;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

import net.sf.json.JSONObject;

public class JsonTest {

	public static void main(String[] args) throws IOException {
		TestSerializable test1 = new TestSerializable();
		test1.setTestA("测试1a");
		test1.setTestB("测试1b");
		TestSerializable test2 = new TestSerializable();
		test2.setTestA("测试2a");
		test2.setTestB("测试2b");
		TestSerializable test3 = new TestSerializable();
		test3.setTestA("测试3a");
		test3.setTestB("测试3b");
		List<TestSerializable> tests = new ArrayList<TestSerializable>();
		tests.add(test1);
		tests.add(test2);
		tests.add(test3);
		JSONObject json = new JSONObject();
		json.accumulate("tests1", tests);
		String test = json.toString();
		OutputStream out = new FileOutputStream("./src/my.out");
		out.write(test.getBytes());
		out.flush();
		out.close();
		StringBuilder str = new StringBuilder();
		byte[] b = new byte[22];
		InputStream in = new FileInputStream("./src/my.out");
		BufferedReader br =  new BufferedReader(new InputStreamReader(in));
		String bb;
		StringBuilder sb = new StringBuilder();
		while((bb = br.readLine()) != null){
			System.out.println(bb);
			sb.append(bb);
		}
//		byte c;
//		while ((c = in.read()) != -1){
//			String mm = new String(b);
//			System.out.println(mm);
//			str.append(new String(b));
//		}
		in.close();
		bb = sb.toString();
		bb += "abc";
		JSONObject jsona = JSONObject.fromObject(bb);//new JSONObject(sb);
		System.out.println(jsona);
	}

}
