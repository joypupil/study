package com.joypupil.study.test.发送邮件;

import java.io.UnsupportedEncodingException;
import java.util.Date;   
import java.util.Properties;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.Address;   
import javax.mail.BodyPart;   
import javax.mail.Message;   
import javax.mail.MessagingException;   
import javax.mail.Multipart;   
import javax.mail.Session;   
import javax.mail.Transport;   
import javax.mail.internet.InternetAddress;   
import javax.mail.internet.MimeBodyPart;   
import javax.mail.internet.MimeMessage;   
import javax.mail.internet.MimeMultipart;  

/**  
* 简单邮件（不带附件的邮件）发送器  
*/   
public class SimpleMailSender  {   
	
    
    public static BodyPart header = getImage("C:\\Users\\hezikang\\Desktop\\assets\\assets\\header.png", "header");
    public static BodyPart bimweb = getImage("C:\\Users\\hezikang\\Desktop\\assets\\assets\\bimweb.png", "bimweb");
    public static BodyPart bimabc = getImage("C:\\Users\\hezikang\\Desktop\\assets\\assets\\bimabc.png", "bimabc");
    public static BodyPart iosap = getImage("C:\\Users\\hezikang\\Desktop\\assets\\assets\\iosap.png", "iosap");
    public static BodyPart scanall = getImage("C:\\Users\\hezikang\\Desktop\\assets\\assets\\scanall.png", "scanall");
    public static BodyPart bimnet = getImage("C:\\Users\\hezikang\\Desktop\\assets\\assets\\bimnet.png", "bimnet");
    public static BodyPart logo = getImage("C:\\Users\\hezikang\\Desktop\\assets\\assets\\logo.png", "logo");
    public static BodyPart file1 = getFile("C:\\Users\\hezikang\\Desktop\\沟通宝.pdf", "bimernet.pdf");
	
/**  
  * 以文本格式发送邮件  
  * @param mailInfo 待发送的邮件的信息  
 * @throws UnsupportedEncodingException 
  */   
    public boolean sendTextMail(MailSenderInfo mailInfo) throws UnsupportedEncodingException {   
      // 判断是否需要身份认证   
      MyAuthenticator authenticator = null;   
      Properties pro = mailInfo.getProperties();  
      if (mailInfo.isValidate()) {   
      // 如果需要身份认证，则创建一个密码验证器   
        authenticator = new MyAuthenticator(mailInfo.getUserName(), mailInfo.getPassword());   
      }  
      // 根据邮件会话属性和密码验证器构造一个发送邮件的session   
      Session sendMailSession = Session.getDefaultInstance(pro,authenticator);   
      try {   
      // 根据session创建一个邮件消息   
      Message mailMessage = new MimeMessage(sendMailSession);   
      // 创建邮件发送者地址   
      Address from = new InternetAddress(mailInfo.getFromAddress(), "he");   
      // 设置邮件消息的发送者   
      mailMessage.setFrom(from);   
      // 创建邮件的接收者地址，并设置到邮件消息中   
      Address to = new InternetAddress(mailInfo.getToAddress());   
      mailMessage.setRecipient(Message.RecipientType.TO,to);   
      // 设置邮件消息的主题   
      mailMessage.setSubject(mailInfo.getSubject());   
      // 设置邮件消息发送的时间   
      mailMessage.setSentDate(new Date());   
      // 设置邮件消息的主要内容   
      String mailContent = mailInfo.getContent();   
      mailMessage.setText(mailContent);   
      // 发送邮件   
      Transport.send(mailMessage);  
      return true;   
      } catch (MessagingException ex) {   
          ex.printStackTrace();   
      }   
      return false;   
    }   
      
    /**  
      * 以HTML格式发送邮件  
      * @param mailInfo 待发送的邮件信息  
      */   
    public static boolean sendHtmlMail(MailSenderInfo mailInfo){   
      // 判断是否需要身份认证   
      MyAuthenticator authenticator = null;  
      Properties pro = mailInfo.getProperties();  
      //如果需要身份认证，则创建一个密码验证器    
      if (mailInfo.isValidate()) {   
        authenticator = new MyAuthenticator(mailInfo.getUserName(), mailInfo.getPassword());  
      }   
      // 根据邮件会话属性和密码验证器构造一个发送邮件的session   
      Session sendMailSession = Session.getDefaultInstance(pro,authenticator);   
      try {   
      // 根据session创建一个邮件消息   
      Message mailMessage = new MimeMessage(sendMailSession);   
      // 创建邮件发送者地址   
      Address from = new InternetAddress(mailInfo.getFromAddress());   
      // 设置邮件消息的发送者   
      mailMessage.setFrom(from);   
      // 创建邮件的接收者地址，并设置到邮件消息中   
      Address to = new InternetAddress(mailInfo.getToAddress());   
      // Message.RecipientType.TO属性表示接收者的类型为TO   
      mailMessage.setRecipient(Message.RecipientType.TO,to);   
      // 设置邮件消息的主题   
      mailMessage.setSubject(mailInfo.getSubject());   
      // 设置邮件消息发送的时间   
      mailMessage.setSentDate(new Date());   
      // MiniMultipart类是一个容器类，包含MimeBodyPart类型的对象   
      Multipart mainPart = new MimeMultipart();   
      // 创建一个包含HTML内容的MimeBodyPart   
      BodyPart html = new MimeBodyPart();   
      // 设置HTML内容   
      html.setContent(mailInfo.getContent(), "text/html; charset=utf-8");   
      mainPart.addBodyPart(html); 
      
      
//      mainPart.addBodyPart(getImage("C:\\Users\\hezikang\\Desktop\\assets\\assets\\header.png", "header"));
////      mainPart.addBodyPart(getImage("C:\\Users\\hezikang\\Desktop\\assets\\assets\\zcgz.png", "zcgz"));
//      mainPart.addBodyPart(getImage("C:\\Users\\hezikang\\Desktop\\assets\\assets\\bimweb.png", "bimweb"));
//      mainPart.addBodyPart(getImage("C:\\Users\\hezikang\\Desktop\\assets\\assets\\bimabc.png", "bimabc"));
//      mainPart.addBodyPart(getImage("C:\\Users\\hezikang\\Desktop\\assets\\assets\\iosap.png", "iosap"));
//      mainPart.addBodyPart(getImage("C:\\Users\\hezikang\\Desktop\\assets\\assets\\scanall.png", "scanall"));
//      mainPart.addBodyPart(getImage("C:\\Users\\hezikang\\Desktop\\assets\\assets\\bimnet.png", "bimnet"));
//      mainPart.addBodyPart(getImage("C:\\Users\\hezikang\\Desktop\\assets\\assets\\logo.png", "logo"));
//      
//      mainPart.addBodyPart(getFile("C:\\Users\\hezikang\\Desktop\\问题报告.doc", "问题报告.doc"));
//      
      mainPart.addBodyPart(header);
      mainPart.addBodyPart(bimweb);
      mainPart.addBodyPart(bimabc);
      mainPart.addBodyPart(iosap);
      mainPart.addBodyPart(scanall);
      mainPart.addBodyPart(bimnet);
      mainPart.addBodyPart(logo);
      mainPart.addBodyPart(file1);
      
      // 将MiniMultipart对象设置为邮件内容   
      mailMessage.setContent(mainPart);
      // 发送邮件   
      Transport.send(mailMessage);   
      return true;   
      } catch (MessagingException ex) {   
          ex.printStackTrace();
      }
      return false;   
    }   
    
    private static BodyPart getImage(String path, String cid){
    	BodyPart imgPart = new MimeBodyPart();
        DataSource fds = new FileDataSource(path);
        try {
			imgPart.setDataHandler(new DataHandler(fds));
	        imgPart.setHeader("Content-ID", "<" + cid + ">");
		} catch (MessagingException e) {
			e.printStackTrace();
		}
        return imgPart;
    }
    
    private static BodyPart getFile(String path, String name){
    	BodyPart imgPart = new MimeBodyPart();
        DataSource fds = new FileDataSource(path);
        try {
			imgPart.setDataHandler(new DataHandler(fds));
	        imgPart.setFileName(name);
		} catch (MessagingException e) {
			e.printStackTrace();
		}
        return imgPart;
    }
}   