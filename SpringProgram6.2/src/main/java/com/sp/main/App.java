package com.sp.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sp.bean.Employee;



public class App 
{
    public static void main( String[] args )
    {
    	
    	String config_loc = "com/sp/resources/config.xml";
        ApplicationContext context = new  ClassPathXmlApplicationContext(config_loc);
        
        Employee emp1 = context.getBean("emp1",Employee.class);
        System.out.println(emp1);
    }
}
