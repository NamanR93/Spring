package com.sp.main;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {
	
	
	@Bean
	public Student stdId1() {
		
		Student std = new Student();
		
		std.setName("naman");
		std.setRollno(12);
		
		return std;
	}

}
