package com.circle.socialcircle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SocialCircleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SocialCircleApplication.class, args);
	}

	@Autowired
	public LogRepository logRepository;

	@Bean
	public IDemoService demoService() {
		return new DemoService(logRepository);
	}

}
