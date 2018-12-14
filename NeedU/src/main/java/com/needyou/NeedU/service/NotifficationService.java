package com.needyou.NeedU.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.needyou.NeedU.entity.User;

@Service
public class NotifficationService {

	private JavaMailSender javaMailSender;
	
	@Autowired
	public NotifficationService(JavaMailSender javaMailSender) {
		this.javaMailSender= javaMailSender;
	}
	
	public void sendNotiffication(User user) throws MailException{
		
		//send mail
		SimpleMailMessage mail=new SimpleMailMessage();
		mail.setTo(user.getEmail());
		mail.setFrom("kobi5252@gmail.com");
		mail.setSubject("this is the subject");
		mail.setText("This is a cool mail notification!");
		
		javaMailSender.send(mail);
	}
	
}
