package com.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
	
	/**
	 * ใในใ
	 * @return init
	 */
	@RequestMapping("/init")
	public String hello() {
		return "index/init";
	}
}
