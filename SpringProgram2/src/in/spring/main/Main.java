package in.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.sp.beans.Student;
import in.spring.resources.SpringConfigfile;


// Spring program Java-based configuration
public class Main {

	public static void main(String[] args) {
		
		
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigfile.class);
		
		Student std = (Student) context.getBean("stdobj1");
		std.displayInfo();
		

	}

}
