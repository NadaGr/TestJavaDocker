package com.TestJavaDocker.TestJavaDocker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestJavaDocker {
	
	@GetMapping("/welcome")
	public String Welcom() {
		return "hello world";
	}

}
