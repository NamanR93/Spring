package com.sp.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		
		String config_loc = "com/sp/collections/config.xml";
		
		ApplicationContext context  = new ClassPathXmlApplicationContext(config_loc);
		
		Emp emp1 = (Emp) context.getBean("Emp1");
		System.out.println(emp1.getName());
		System.out.println(emp1.getPhoneno());
		System.out.println(emp1.getAddresses());
		System.out.println(emp1.getCourses());


	}

}
