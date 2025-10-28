package in.sp.beans;

public class Student {
	
	private String name;
	private int age;
	private String city;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	public void displayInfo() {
		System.out.println("Student Name: " + name);
		System.out.println("Student Age: " + age);
		System.out.println("Student City: " + city);
	}
	

}
