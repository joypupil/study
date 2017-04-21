package com.joypupil.study.test.软件许可;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.Set;

import com.joypupil.study.test.获取系统信息.SystemInfo;

public class Client {

	private static final String privateKey = "******";

	private static final String publicKey = "******";

	public static void main(String[] args) {
		// KeyGenerater generater = new KeyGenerater();
		// generater.generater();
//		byte[] signText = Signaturer.sign(privateKey.getBytes(), "bimernet_zjgjV4Commercial1525708800000http://119.29.33.209:8080/api/license/D8-CB-8A-6D-E6-C1");
//		System.err.println(new String(signText));
		// System.err.println(SignProvider.verify(publicKey.getBytes(), "测试据",
		// signText));
//		System.out.println(System.currentTimeMillis() + 1000 * 60 * 60 * 24 * 365);
//		validate();
		System.out.println(validate());
//		byte[] b = "License.server".getBytes();
//		System.out.println(b);
	}
	
	public static boolean validate(){
		boolean access = false;
		try{
			//读取配置文件
			Properties properties = new Properties();
			properties.load(new FileInputStream("D:\\MY\\CODE\\study\\study\\study\\src\\main\\java\\com\\joypupil\\study\\test\\软件许可\\license.properties"));
			//验证配置文件正确性
			String name = properties.getProperty("Product.name");
			String version = properties.getProperty("Product.version");
			String type = properties.getProperty("License.type");
			String expiry = properties.getProperty("License.expiry");
			String server = properties.getProperty("License.server");
			String macaddress = properties.getProperty("Server.macaddress");
			String signature = properties.getProperty("signature");
			StringBuffer str = new StringBuffer();
			str.append(name);
			str.append(version);
			str.append(type);
			str.append(expiry);
			str.append(server);
			str.append(macaddress);
			if(!SignProvider.verify(publicKey.getBytes(), str.toString(), signature.getBytes())){
				System.out.println("校验签名失败");
				return false;
			}
			if(!macaddress.equals(SystemInfo.getInstance().getMac())){
				System.out.println("该机器没有被授权");
				return false;
			}
			if(System.currentTimeMillis() > Long.valueOf(expiry)){
				System.out.println("授权已过期");
				return false;
			}
			//
		} catch(Exception e){
			e.printStackTrace();
			return false;
		}
		return true;
	}

}
