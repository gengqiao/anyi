package com.gq.util;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.NoSuchProviderException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
/** 
* @className:SendEmail.java
* @classDescription:
* @createTime:2016-11-25
*/
public class SendEmail  {
	
	static String mailUser = "anyidate@163.com"; //用户名
	static String pwd = "anyi005"; //你所要通过的帐号的密码是多少，也就是mailUser的密码
	static String host = "smtp.163.com";
	//此邮箱的密码是anyi001
	private static Session session = null;
	public static void main(String[] args) throws NoSuchProviderException {
		send("gengqiao@whaty.com","第一封JAVA邮件！","看看发邮件好用");
	}
   /**
    * 添加用户成功以后自动发邮件
    * @param email 邮箱
    * @param loginId 用户名
    * @param passWord 密码
    */
	public  static void sendOnRegsterSuccess(String email,String loginId,String passWord){
		String title="安逸通知";
		String content="你已经被管理员添加为安逸环境的项目人员；请登录www.aiyi.date查看任务；账号为："+loginId+";密码为："+passWord;
		send(email, title, content);
	}
	
/**
 * 邮件调用接口
 * @param email 
 * @param title
 * @param content
 */
	public static  void  send(String email,String title,String content){
		initSession();
		try {
			Transport ts = session.getTransport();
			ts.connect(host, mailUser, pwd);
			//创建邮件对象
			MimeMessage msg = new MimeMessage(session);
			//设置发件人
			msg.setFrom(new InternetAddress(mailUser));
			//设置收件人
			msg.setRecipient(Message.RecipientType.TO, new InternetAddress(email));
			//设置抄送人 默认秘密抄送自己
			msg.setRecipient(Message.RecipientType.BCC, new InternetAddress(mailUser));
			msg.setSubject(title);
			msg.setContent(content, "text/html;charset=UTF-8");//设置发送主题
			ts.send(msg);
		} catch (MessagingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	//初始化参数
	private static Session initSession() {
		Properties prop = new Properties();
		prop.put("mail.host", host);
		prop.put("mail.transport.protocol", "smtp");
		prop.put("mail.smtp.auth", true);
		prop.put("mail.smpt.port", "25");
		session = Session.getInstance(prop, new Authenticator() {
			public PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(mailUser, pwd);
			}
		});
		session.setDebug(true);
		return session;
	}

}
