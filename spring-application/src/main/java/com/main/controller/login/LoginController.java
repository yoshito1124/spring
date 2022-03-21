package com.main.controller.login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
	
	/**
	 * テスト
	 * @return init
	 */
	@RequestMapping("/login")
	public String login() {
		return "login/login";
	}
}
