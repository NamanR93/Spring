package com.sp.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext con = new AnnotationConfigApplicationContext(JavaConfig.class);
    	
    	Student std = con.getBean("stdId1",Student.class);
    	std.displayInfo();
    
    }
}
