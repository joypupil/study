package com.joypupil.study.test.读写文件;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class IOUtil {

	/**
	 * 将文件读成字符串
	 * 
	 * @param filePath
	 * @return
	 */
	public static String read(String filePath) {
		// 读取txt内容为字符串
		StringBuffer txtContent = new StringBuffer();
		// 每次读取的byte数
		byte[] b = new byte[2 * 1024];
		int byteread = 0;
		try (InputStream in = new FileInputStream(filePath)){
			// 文件输入流
			while ((byteread = in.read(b)) != -1) {
				// 字符串拼接
				txtContent.append(new String(b, 0, byteread));//一定要指定长度，否则最后会多出一截重复的
			}
			// 关闭流
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return txtContent.toString();
	}

}
