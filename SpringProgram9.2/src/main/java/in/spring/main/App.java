package in.spring.main;



import java.util.HashMap;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import in.spring.resources.SpringConfigFile;

/**
 * NamedParameterJdbcTemplate is a Spring class for exxecuting SQL queries with named parameters instead of traditional '?' placeholders.
 *
 * It enhances code readability and maintainability by allowing developers to use descriptive names for parameters in SQL statements
 * and reduce errors in SQL queries.
 */ 
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);
        
        NamedParameterJdbcTemplate npJdbcTemp = context.getBean(NamedParameterJdbcTemplate.class);
        
        Map<String,Object> map = new HashMap<String ,Object>();
        map.put("rollno", 104);
        map.put("name", " Derek");
        map.put("marks", 99);
        
        String insert_query = "insert into student values(:name, :rollno, :marks)";
		int count = npJdbcTemp.update(insert_query, map);
		
		if(count > 0) {
			System.out.println("Record Inserted Successfully");
		} else {
			System.out.println("Record Insertion Failed");
            
			
		}
		
        
        
        
        
        
        
        
    }
}
