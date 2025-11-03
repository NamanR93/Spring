package com.sp.main.entities;

public class Student {
	
	private String name;
	private String city;
	private int marks;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	public Student() {
		
		
	}
	public Student(String name, String city, int marks) {
		super();
		this.name = name;
		this.city = city;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", city=" + city + ", marks=" + marks + "]";
	}
	
	
	
	
	
	

}
