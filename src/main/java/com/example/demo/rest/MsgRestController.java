package com.example.demo.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class MsgRestController {
	
	@Value("${message}")
	private String string;
	
	
	@GetMapping("/msg")
	public String getMsg() {
		return string;
	}

}
