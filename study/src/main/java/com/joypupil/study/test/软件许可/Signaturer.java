package com.joypupil.study.test.软件许可;

import java.security.KeyFactory;
import java.security.PrivateKey;
import java.security.Signature;
import java.security.spec.PKCS8EncodedKeySpec;
import sun.misc.BASE64Encoder;
import sun.misc.BASE64Decoder;

public class Signaturer {
	public static byte[] sign(byte[] priKeyText, String plainText) {
		try {
			BASE64Decoder decoder = new BASE64Decoder();
			BASE64Encoder encoder = new BASE64Encoder();
			// PKCS8EncodedKeySpec priPKCS8 = new
			// PKCS8EncodedKeySpec(Base64.decode(priKeyText));
			PKCS8EncodedKeySpec priPKCS8 = new PKCS8EncodedKeySpec(decoder.decodeBuffer(new String(priKeyText)));
			KeyFactory keyf = KeyFactory.getInstance("RSA");
			PrivateKey prikey = keyf.generatePrivate(priPKCS8);
			// 用私钥对信息生成数字签名
			Signature signet = java.security.Signature.getInstance("MD5withRSA");
			signet.initSign(prikey);
			signet.update(plainText.getBytes());
			// byte[] signed = Base64.encodeToByte(signet.sign());
			byte[] signed = encoder.encode(signet.sign()).getBytes();
			return signed;
		} catch (java.lang.Exception e) {
			System.out.println("签名失败");
			e.printStackTrace();
		}
		return null;
	}
}
