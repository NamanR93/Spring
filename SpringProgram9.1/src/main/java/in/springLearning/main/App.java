package in.springLearning.main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import in.spring.resources.SpringConfigFile;

import in.spring.beans.Student;
import in.spring.mapper.StudentRowMapper;


public class App 
{
    public static void main( String[] args )
    
   
    {
    	
    	
       ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);
       
       JdbcTemplate jdbcTemplate = context.getBean("getJDBCTemplate",JdbcTemplate.class);
       
       
       
       //-----------------Insert operation------------------
       
//      String name = "Richi";
//	    int id = 103;
//	    int marks = 92;
//       
//       String query = "insert into student values (?,?,?)";
//       
//       int count = jdbcTemplate.update(query,name,id,marks);
//       
//       if(count>0) {
//		   System.out.println("Record Inserted Successfully!");
//	   } else {
//		   System.out.println("Insertion Failed!");
//	   }
       
       //---------------update operation------------------
       
//       int marks = 98;
//       int id = 105;
//       String updateQuery = "update student set std_marks = ? where roll_no = ?";
//       int count =  jdbcTemplate.update(updateQuery,marks,id);
//       
//       if(count>0) {
//    	   		   System.out.println("Record Updated Successfully!");
//       }else {
//    	   System.out.println("Updation Failed!");
//       }
	   
	   //---------------delete operation------------------
	   
//	   int id = 105;
//	   String deleteQuery = "delete from student where roll_no = ?";
//	   int count = jdbcTemplate.update(deleteQuery,id);
//	   
//	   if(count>0) {
//		   System.out.println("Record Deleted Successfully!");
//	   }else {
//		   System.out.println("Deletion Failed!");
//	   }
//       
       
       //----------------select operation: 1  ------------------
       
//       String selectQuery = "select * from student";
//       List<Student> std_list = jdbcTemplate.query(selectQuery, new StudentRowMapper());
//	   
//	   for(Student std : std_list) {
//		   System.out.println("Name: " + std.getName());
//		   System.out.println("Roll No: " + std.getRollNo());
//		   System.out.println("Marks: " + std.getStdMarks());
//		   System.out.println("-------------------------");	
//	   }
       
       
       //----------------select operation: 2  ------------------
	   
//	   int rollnumber = 101;
//	   String selectQuery = "select * from student where roll_no = ?";
//	   Student std = jdbcTemplate.queryForObject(selectQuery, new StudentRowMapper(),rollnumber);
//	   
//		   System.out.println("Name: " + std.getName());
//		   System.out.println("Roll No: " + std.getRollNo());
//		   System.out.println("Marks: " + std.getStdMarks());
//		   System.out.println("-------------------------");
       
    }
}
