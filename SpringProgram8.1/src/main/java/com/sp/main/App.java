package com.sp.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sp.beans.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	String config_location = "com/sp/config/config.xml";
       ApplicationContext context = new ClassPathXmlApplicationContext(config_location);
       
       Student std1 = (Student)context.getBean("std1");
       System.out.println(std1);
       Student std2 = (Student)context.getBean("std2");
       System.out.println(std2);
    }
}
