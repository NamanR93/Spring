package com.sp.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		
		String config_loc = "com/sp/ref/config.xml";
		
		ApplicationContext context  = new ClassPathXmlApplicationContext(config_loc);
		
		A a1 = (A) context.getBean("Aref");
		System.out.println(a1.getName());
		System.out.println(a1.getOb().gety());
		System.out.println(a1);
		


	}

}
