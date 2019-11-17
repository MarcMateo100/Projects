package com.springboot.YoutubeWeb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableAutoConfiguration
public class YoutubeWebApplication extends SpringBootServletInitializer {
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
	    return application.sources(YoutubeWebApplication.class);
	}

	
	@RequestMapping("/")
	String home() {
		return "<html><body><h1>Hello WorldSpring Boot</h1></body></html>";
	}
	
	@RequestMapping("/new")
	String newForm() {
		return "<h2>Create New Thing</h2>";
	}

	public static void main(String[] args) {
		SpringApplication.run(YoutubeWebApplication.class, args);
	}

}
