package com.example2.demo1.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {
	@RequestMapping("/hello1")
		public String sayHello() {
	return "Hello World Developer!!!";
	}

}

