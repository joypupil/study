package com.joypupil.study.test.文件加解密;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class Client {

	public static void main(String[] args) throws Exception {
		test("f:/test/test1.txt", "f:/test/test/rtest1.txt");
		test("f:/test/test5.txt", "f:/test/test/rtest5.txt");
		test("f:/test/test10.txt", "f:/test/test/rtest10.txt");
		test("f:/test/test50.txt", "f:/test/test/rtest50.txt");
		test("f:/test/test100.txt", "f:/test/test/rtest100.txt");
		test("f:/test/test200.txt", "f:/test/test/rtest200.txt");
		test("f:/test/test300.txt", "f:/test/test/rtest300.txt");
		test("f:/test/test500.txt", "f:/test/test/rtest500.txt");
		test("f:/test/test1000.txt", "f:/test/test/rtest1000.txt");
//		TestDES td = new TestDES("bimyun");
//		td.encrypt("f:/test/test1.txt", "f:/test/test/rtest1.txt");
//		td.encrypt("f:/test/test5.txt", "f:/test/test/rtest5.txt");
//		td.encrypt("f:/test/test10.txt", "f:/test/test/rtest10.txt");
//		td.encrypt("f:/test/test50.txt", "f:/test/test/rtest50.txt");
//		td.encrypt("f:/test/test100.txt", "f:/test/test/rtest100.txt");
//		td.encrypt("f:/test/test200.txt", "f:/test/test/rtest200.txt");
//		td.encrypt("f:/test/test300.txt", "f:/test/test/rtest300.txt");
//		td.encrypt("f:/test/test500.txt", "f:/test/test/rtest500.txt");
//		td.encrypt("f:/test/test1000.txt", "f:/test/test/rtest1000.txt");
		
//		td.decrypt("f:/test/test/rtest1.txt", "f:/test/test/test1.txt"); // 解密
//		td.decrypt("f:/test/test/rtest5.txt", "f:/test/test/test5.txt"); // 解密
//		td.decrypt("f:/test/test/rtest10.txt", "f:/test/test/test10.txt"); // 解密
//		td.decrypt("f:/test/test/rtest50.txt", "f:/test/test/test50.txt"); // 解密
//		td.decrypt("f:/test/test/rtest100.txt", "f:/test/test/test100.txt"); // 解密
//		td.decrypt("f:/test/test/rtest200.txt", "f:/test/test/test200.txt"); // 解密
//		td.decrypt("f:/test/test/rtest300.txt", "f:/test/test/test300.txt"); // 解密
//		td.decrypt("f:/test/test/rtest500.txt", "f:/test/test/test500.txt"); // 解密
//		td.decrypt("f:/test/test/rtest1000.txt", "f:/test/test/test1000.txt"); // 解密
		
//		encrypt("f:/test/test1.txt", "f:/test/test/rtest1.txt");
//		encrypt("f:/test/test5.txt", "f:/test/test/rtest5.txt");
//		encrypt("f:/test/test10.txt", "f:/test/test/rtest10.txt");
//		encrypt("f:/test/test50.txt", "f:/test/test/rtest50.txt");
//		encrypt("f:/test/test100.txt", "f:/test/test/rtest100.txt");
//		encrypt("f:/test/test200.txt", "f:/test/test/rtest200.txt");
//		encrypt("f:/test/test300.txt", "f:/test/test/rtest300.txt");
//		encrypt("f:/test/test500.txt", "f:/test/test/rtest500.txt");
//		encrypt("f:/test/test1000.txt", "f:/test/test/rtest1000.txt");
		
//		decrypt("f:/test/test/rtest1.txt", "f:/test/test/test1.txt"); // 解密
//		decrypt("f:/test/test/rtest5.txt", "f:/test/test/test5.txt"); // 解密
//		decrypt("f:/test/test/rtest10.txt", "f:/test/test/test10.txt"); // 解密
//		decrypt("f:/test/test/rtest50.txt", "f:/test/test/test50.txt"); // 解密
//		decrypt("f:/test/test/rtest100.txt", "f:/test/test/test100.txt"); // 解密
//		decrypt("f:/test/test/rtest200.txt", "f:/test/test/test200.txt"); // 解密
//		decrypt("f:/test/test/rtest300.txt", "f:/test/test/test300.txt"); // 解密
//		decrypt("f:/test/test/rtest500.txt", "f:/test/test/test500.txt"); // 解密
//		decrypt("f:/test/test/rtest1000.txt", "f:/test/test/test1000.txt"); // 解密
	}
	
	public static void encrypt(String file, String destFile) throws Exception{
		FileEncryptAndDecrypt.encrypt(file, destFile, "bimyun");
	}
	
	public static void decrypt(String file, String destFile) throws Exception{
		FileEncryptAndDecrypt.decrypt(file, destFile, 6);
	}
	
	public static void test(String file, String destFile) throws Exception {
		long start;
		long end;
		start = System.currentTimeMillis();
		InputStream is = new FileInputStream(file);
		OutputStream out = new FileOutputStream(destFile);
		byte[] buffer = new byte[1024];
		int r;
		while ((r = is.read(buffer)) > 0) {
			out.write(buffer, 0, r);
		}
		out.flush();
		end = System.currentTimeMillis();
		System.out.println("存储文件" + file + "用时：" + (end - start));
		is.close();
		out.close();
	}

}
