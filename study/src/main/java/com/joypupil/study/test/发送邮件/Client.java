package com.joypupil.study.test.发送邮件;

import java.io.File;
import java.io.UnsupportedEncodingException;
import java.util.List;

import javax.mail.internet.InternetAddress;

import com.joypupil.study.test.读写文件.IOUtil;

public class Client {
	
	public static final String STR = "hezk@empowerchn.com";

	public static void main(String[] args) throws UnsupportedEncodingException{
		//这个类主要是设置邮件
		MailSenderInfo mailInfo = new MailSenderInfo();   
		mailInfo.setMailServerHost("smtp.exmail.qq.com");   
		mailInfo.setMailServerPort("465");   
		mailInfo.setValidate(true);
		mailInfo.setUserName("service@bimernet.com");   
		mailInfo.setPassword("******");//您的邮箱密码   
		
		//设置自定义发件人昵称
//		String nick="";  
//        try {  
//            nick=javax.mail.internet.MimeUtility.encodeText("BIM沟通宝系统通知");  
//        } catch (UnsupportedEncodingException e) {  
//            e.printStackTrace();  
//        }  
		
		
		mailInfo.setFromAddress("service@bimernet.com");   
		mailInfo.setToAddress("hezk@empowerchn.com");   
		mailInfo.setSubject("BIMERNET月刊： 3月，大宝进球了，小宝更新了！");
		mailInfo.setContent("设置邮箱内容");
		//读取文档中的类容
//		String content = IOUtil.read("C:\\Users\\hezikang\\Desktop\\assets\\更新邮件.html");
		
		
//		mailInfo.setContent(content);
		//这个类主要来发送邮件  
		SimpleMailSender sms = new SimpleMailSender();  
		sms.sendTextMail(mailInfo);//发送文体格式   
//		String[] strs = getMail(STR);
//		String str = null;
//		for(int i = 0; i < strs.length; i++){
//			str = strs[i];
//			mailInfo.setToAddress(str);   
//			try{
//			sms.sendHtmlMail(mailInfo);//发送html格式  
//			System.out.println("向用户:" + str + "发送邮件成功");
//			} catch(Exception e){
//				System.out.println("向用户:" + str + "发送邮件失败");
//				e.printStackTrace();
//			}
//		}
//		sms.sendHtmlMail(mailInfo);//发送html格式  
	}
	
	public static String[] getMail(String str){
		return str.split(";");
	}

}
