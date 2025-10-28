package in.spring.resources;

import in.sp.beans.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfigfile {
	
	@Bean("stdobj1")
	public Student getStudent1() {
		
		Student std = new Student();
		
		std.setName("Alice");
		std.setAge(20);
		std.setCity("alice@gmail.com");
		
		return std;
	}
	
	

}
