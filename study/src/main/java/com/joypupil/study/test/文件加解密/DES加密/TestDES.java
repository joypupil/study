package com.joypupil.study.test.文件加解密.DES加密;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.Key;
import java.security.SecureRandom;

import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.CipherOutputStream;
import javax.crypto.KeyGenerator;

public class TestDES {
	Key key;

	public TestDES(String str) {
		getKey(str);// 生成密匙
	}

	/**
	 * 根据参数生成KEY
	 */
	public void getKey(String strKey) {
		try {
			KeyGenerator _generator = KeyGenerator.getInstance("DES");
			_generator.init(new SecureRandom(strKey.getBytes()));
			this.key = _generator.generateKey();
			_generator = null;
		} catch (Exception e) {
			throw new RuntimeException("Error initializing SqlMap class. Cause: " + e);
		}
	}

	/**
	 * 文件file进行加密并保存目标文件destFile中
	 * 
	 * @param file
	 *            要加密的文件 如c:/test/srcFile.txt
	 * @param destFile
	 *            加密后存放的文件名 如c:/加密后文件.txt
	 */
	public void encrypt(String file, String destFile) throws Exception {
		long start;
		long end;
		start = System.currentTimeMillis();
		
		Cipher cipher = Cipher.getInstance("DES");
		// cipher.init(Cipher.ENCRYPT_MODE, getKey());
		cipher.init(Cipher.ENCRYPT_MODE, this.key);
		InputStream is = new FileInputStream(file);
		OutputStream out = new FileOutputStream(destFile);
		CipherInputStream cis = new CipherInputStream(is, cipher);
		byte[] buffer = new byte[1024];
		int r;
		while ((r = cis.read(buffer)) > 0) {
			out.write(buffer, 0, r);
		}
		
		out.flush();
		end = System.currentTimeMillis();
		System.out.println("加密文件" + file + "用时：" + (end - start));
		
		cis.close();
		is.close();
		out.close();
	}

	/**
	 * 文件采用DES算法解密文件
	 * 
	 * @param file
	 *            已加密的文件 如c:/加密后文件.txt * @param destFile 解密后存放的文件名 如c:/
	 *            test/解密后文件.txt
	 */
	public void decrypt(String file, String dest) throws Exception {
		long start;
		long end;
		start = System.currentTimeMillis();
		
		Cipher cipher = Cipher.getInstance("DES");
		cipher.init(Cipher.DECRYPT_MODE, this.key);
		InputStream is = new FileInputStream(file);
		OutputStream out = new FileOutputStream(dest);
		CipherOutputStream cos = new CipherOutputStream(out, cipher);
		byte[] buffer = new byte[1024];
		int r;
		while ((r = is.read(buffer)) >= 0) {
//			System.out.println();
			cos.write(buffer, 0, r);
		}

		out.flush();
		end = System.currentTimeMillis();
		System.out.println("解密文件" + file + "用时：" + (end - start));
		
		cos.close();
		out.close();
		is.close();
	}

	public static void main(String[] args) throws Exception {
		TestDES td = new TestDES("bimyun");
		long start = System.currentTimeMillis();
//		td.encrypt("f:/test/test1000.txt", "f:/test/test/rtest1000.txt"); // 加密
		td.decrypt("f:/test/test/rtest1000.txt", "f:/test/test/test1000.txt"); // 解密
		long end = System.currentTimeMillis();
		System.out.println(end - start);

	}
}