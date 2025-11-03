package com.sp.main.Dao;

import com.sp.main.entities.Student;

public interface StudentDao {

	public int insert(Student std);

	public int updateData(Student std);

	public int delete(int studentid);

	public Student getStudent(int studentId);
}
