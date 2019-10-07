package com.google.login.controller;

import java.security.Principal;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class UserLoginController {

	@RequestMapping("/user")
	public Principal user(Principal principal)
	{
		log.info("User calling");
		log.info("User info: {}",principal);
		return principal;
	}
}
