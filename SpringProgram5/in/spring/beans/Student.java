package in.spring.beans;

public class Student {

	private String name;
	private int rollNo;
	private Address address;

	public Student(String name, int rollNo, Address address) {
		super();
		this.name = name;
		this.rollNo = rollNo;
		this.address = address;
	}

	public void display() {
		System.out.println("Student Name: " + name);
		System.out.println("Student City: " + rollNo);
		System.out.println("Student Address: " + address);
	}
}
