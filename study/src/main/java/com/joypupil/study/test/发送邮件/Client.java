package com.joypupil.study.test.发送邮件;

import java.io.UnsupportedEncodingException;

public class Client {
	
	public static void main(String[] args) throws UnsupportedEncodingException{
		//这个类主要是设置邮件  
		MailSenderInfo mailInfo = new MailSenderInfo();   
		mailInfo.setMailServerHost("smtp.163.com");   
		mailInfo.setMailServerPort("25");   
		mailInfo.setValidate(true);   
		mailInfo.setUserName("q8535097@163.com");   
		mailInfo.setPassword("zswdtx15753575");//您的邮箱密码   
		mailInfo.setFromAddress("q8535097@163.com");   
		mailInfo.setToAddress("hezikg@outlook.com");   
		mailInfo.setSubject("设置邮箱标题");   
		mailInfo.setContent("设置邮箱内容");   
		//这个类主要来发送邮件  
		SimpleMailSender sms = new SimpleMailSender();  
		sms.sendTextMail(mailInfo);//发送文体格式   
//		sms.sendHtmlMail(mailInfo);//发送html格式  
	}

}
