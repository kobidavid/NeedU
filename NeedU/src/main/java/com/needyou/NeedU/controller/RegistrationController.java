package com.needyou.NeedU.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.needyou.NeedU.entity.User;
import com.needyou.NeedU.service.NotifficationService;

@RestController
public class RegistrationController {

	@Autowired
	private NotifficationService notifficationService;
	@GetMapping("/signup-success")
	public String signupSuccess() {
		//create a user
		
		User user=new User();
		user.setEmail("kobi5252@gmail.com");
		//send a notification
		try {
			notifficationService.sendNotiffication(user);
			
		}
		
		catch (MailException e) {
			// catch errors
		}
		return("Thank youfor registering with us");
	}
}
