package com.nole.HelloSpringBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController//@RestController 注释告诉 Spring，这段代码描述了一个应该在网络上可用的端点。
public class HelloSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloSpringBootApplication.class, args);
	}
	@GetMapping("/helloGit")
	public String hello(@RequestParam(value="name", defaultValue = "SpringBoot&Git") String name){
		return String.format("Hi %s!", name);
	}
}
