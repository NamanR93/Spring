package com.sp.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
       
    	ApplicationContext con  = new ClassPathXmlApplicationContext("com/sp/main/config.xml");
    	
    	//Student std = con.getBean("student",Student.class);
    	Student std = con.getBean("obj",Student.class);
    	System.out.println(std);
    	
    	SpEL_Demo d =  con.getBean("spEL_Demo",SpEL_Demo.class);
    	System.out.println(d);
    }
}
