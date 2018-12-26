package com.needyou.NeedU.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LocationController {

	@GetMapping("/root")
	public void signupSuccess() {
		System.out.println("gooooooooooooooooood");
	}
}
