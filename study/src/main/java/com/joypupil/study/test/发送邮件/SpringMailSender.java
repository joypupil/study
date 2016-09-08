package com.joypupil.study.test.发送邮件;

import java.util.Properties;

import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;

public class SpringMailSender {

	public static void sendTextMail(String host, String from, String password, String to, String subject, String text) {

		JavaMailSenderImpl javaMailSender = new JavaMailSenderImpl();
		// 设定mail server
		javaMailSender.setHost(host);
		// javaMailSender.setPort(25);
		// 建立邮件消息
		SimpleMailMessage mailMessage = new SimpleMailMessage();
		// 设置收件人，寄件人 用数组发送多个邮件
		// String[] array = new String[] {"sun111@163.com","sun222@sohu.com"};
		// mailMessage.setTo(array);
		mailMessage.setTo(to);
		mailMessage.setFrom(from);
		mailMessage.setSubject(subject);
		mailMessage.setText(text);

		javaMailSender.setUsername(from); // 根据自己的情况,设置username
		javaMailSender.setPassword(password); // 根据自己的情况, 设置password

		Properties prop = new Properties();
		prop.put(" mail.smtp.auth ", " true"); // 将这个参数设为true，让服务器进行认证,认证用户名和密码是否正确
		prop.put(" mail.smtp.timeout ", " 25000");
		prop.put("mail.smtp.ssl.enable", true);
		javaMailSender.setJavaMailProperties(prop);
		// 发送邮件
		javaMailSender.send(mailMessage);
	}
	
	public static void main(String[] args) {
		SpringMailSender.sendTextMail("smtp.163.com", "xesmstz@163.com", "*****", "hezikg@outlook.com", "但是广东省", "色股份的浓厚购房计划根据");
	}
}