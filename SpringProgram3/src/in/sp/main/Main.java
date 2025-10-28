package in.sp.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.spring.beans.Student;


//Spring program using Annotation Configuration


public class Main {

	public static void main(String[] args) {
		
		
		String configLocation = "in/spring/resources/applicationContext.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(configLocation);
		
		Student std = (Student) context.getBean("student");
		std.displayInfo();
		

	}

}
