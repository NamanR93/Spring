package in.spring.Main;

import in.spring.beans.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


// Spring program using XML configuration.


public class Main {
	
	public static void main(String[] args) {
		
		String config_loc = "in/spring/resources/applicationContext.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(config_loc);
		
		Student student = (Student) context.getBean("student1");
		student.displayInfo();
		
		
		
	}

}