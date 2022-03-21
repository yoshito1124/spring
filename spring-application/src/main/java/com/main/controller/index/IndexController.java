package com.main.controller.index;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
	
	/**
	 * テスト
	 * @return init
	 */
	@RequestMapping("/")
	public String index() {
		return "index/init";
	}
	
	@RequestMapping("/init")
	public String init() {
		return "index/init";
	}
}
