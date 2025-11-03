package com.sp.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sp.main.Dao.StudentDao;
import com.sp.main.entities.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext con = new AnnotationConfigApplicationContext("SpringConfig.class");
        
        StudentDao dao = con.getBean("studentDao",StudentDao.class);
        
        //--------Insert-------
        
//        Student student = new Student();
//        	student.setName("numun");
//        	student.setCity("blr");
//        	student.setMarks(93);
//        	
//        	int result = dao.insert(student);
        
        //------update-------
//        Student student = new Student();
//        student.setName(null);
//        student.setCity(null);
//        student.setMarks(0);
//        
//        int result = dao.updateData(student);
        
        //-----delete------
//        
//        int result = dao.delete(66);
//        System.out.println("deleted"+ result)'
        
        
    }
}
