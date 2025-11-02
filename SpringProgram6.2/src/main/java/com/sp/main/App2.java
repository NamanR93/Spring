package com.sp.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sp.bean.Employee;



public class App2 
{
    public static void main( String[] args )
    {
    	
    	
    	// autowiring :using annotation
    	
    	
    	String config_loc = "com/sp/resources/config2.xml";
        ApplicationContext context = new  ClassPathXmlApplicationContext(config_loc);
        
        Employee emp1 = context.getBean("emp1",Employee.class);
        System.out.println(emp1);
    }
}
