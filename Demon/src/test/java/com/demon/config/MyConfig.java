package com.demon.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.demon.domain.User;

@Configuration
public class MyConfig {
	public MyConfig(){
		System.out.println("myconiffg infdfjd");
	}

	@Bean
	public User getUser(){
		User user = new User();
		user.setId(1);
		return user;
	}
	

}
