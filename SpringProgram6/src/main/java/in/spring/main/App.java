package in.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.spring.beans.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       
    	String location = "in/spring/resources/applicationContext.xml";
    	ApplicationContext context = new ClassPathXmlApplicationContext(location);	
    	
    	 Student std = (Student)context.getBean(Student.class);
    	 std.displayInfo();
    	
    	
    }
}
