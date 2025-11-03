package com.sp.main.Dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.sp.main.entities.Student;


@Component("studentDao")
public class StudentDaoImpl implements StudentDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	
	@Override
	public int insert(Student std) {
		//insert
		
		String query = "insert into student(name,city,marks) values(?,?,?) ";
		int r = this.jdbcTemplate.update(query, std.getName(),std.getCity(),std.getMarks());
		return r;
	}


	@Override
	public int updateData(Student std) {
		
		String query = "update student set name = ?, city =? where marks =?";
		
		int r = this.jdbcTemplate.update(query,std.getName(),std.getCity(),std.getMarks());
		
		return r;
	}


	@Override
	public int delete(int studentid) {
		
		String query = "delete from student where id=?";
		int r = this.jdbcTemplate.update(query,studentid);
		
		return r;
	}


	@Override
	public Student getStudent(int studentId) {
		
		return null;
	}

}
