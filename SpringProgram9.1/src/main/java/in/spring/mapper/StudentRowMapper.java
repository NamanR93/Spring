package in.spring.mapper;

import in.spring.beans.Student;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public  class StudentRowMapper implements RowMapper<Student> {
	
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		Student std = new Student();
		
		std.setName(rs.getString("std_name"));
		std.setRollNo(rs.getInt("roll_no"));
		std.setStdMarks(rs.getInt("std_marks"));
		return std;
	}
	
	

}
	
	