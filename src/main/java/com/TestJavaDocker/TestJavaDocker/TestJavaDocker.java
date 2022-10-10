package com.TestJavaDocker.TestJavaDocker;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class TestJavaDocker {
	
	@RequestMapping("/")
	public String Welcom() {
		return "hello world";
	}

}
