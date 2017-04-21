package com.joypupil.study.test.软件许可;

import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import sun.misc.BASE64Encoder;

public class KeyGenerater {
	private byte[] priKey;
	private byte[] pubKey;

	public void generater() {
		try {
			KeyPairGenerator keygen = KeyPairGenerator.getInstance("RSA");
			SecureRandom secrand = new SecureRandom();
			secrand.setSeed("BIMERNET V4.4".getBytes()); // 初始化随机产生器
			keygen.initialize(1024, secrand);
//			keygen.initialize(1024);
			KeyPair keys = keygen.genKeyPair();
			PublicKey pubkey = keys.getPublic();
			PrivateKey prikey = keys.getPrivate();
//			BASE64Decoder decoder = new BASE64Decoder();
			BASE64Encoder encoder = new BASE64Encoder();
//			encoder.encode(pubkey.getEncoded());
			// pubKey = Base64.encodeToByte(pubkey.getEncoded());
			// priKey = Base64.encodeToByte(prikey.getEncoded());
			pubKey = encoder.encode(pubkey.getEncoded()).getBytes();
			priKey = encoder.encode(prikey.getEncoded()).getBytes();
			System.out.println("pubKey = " + new String(pubKey));
			System.out.println("priKey = " + new String(priKey));
		} catch (java.lang.Exception e) {
			System.out.println("生成密钥对失败");
			e.printStackTrace();
		}
	}

	public byte[] getPriKey() {
		return priKey;
	}

	public byte[] getPubKey() {
		return pubKey;
	}
}
