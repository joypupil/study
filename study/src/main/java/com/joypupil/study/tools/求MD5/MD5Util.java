package com.joypupil.study.tools.求MD5;

import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5Util {
	
	public static String getMD5(InputStream in) throws IOException, NoSuchAlgorithmException{
		MessageDigest md5 = null;
		byte buffer[] = new byte[1024];
		int len;
		md5 = MessageDigest.getInstance("MD5");
		while((len = in.read(buffer, 0, 1024)) != -1){
			md5.update(buffer, 0, len);
		}
		BigInteger bigInt = new BigInteger(1, md5.digest());
		return bigInt.toString(16);
	}
	
	 /**
     * 用于获取一个String的md5值
     * @param string
     * @return
	 * @throws NoSuchAlgorithmException 
     */
    public static String getMd5(String str) throws NoSuchAlgorithmException {
    	MessageDigest md5 = null;
    	md5 = MessageDigest.getInstance("MD5");
        byte[] bs = md5.digest(str.getBytes());
        StringBuilder sb = new StringBuilder(40);
        for(byte x:bs) {
            if((x & 0xff)>>4 == 0) {
                sb.append("0").append(Integer.toHexString(x & 0xff));
            } else {
                sb.append(Integer.toHexString(x & 0xff));
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) throws Exception{
        System.out.println(getMd5("hello world"));
    }

}
