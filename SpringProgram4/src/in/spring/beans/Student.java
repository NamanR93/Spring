package in.spring.beans;

public class Student {

	private String name;
	private String city;
	private Address address;

	public void setName(String name) {
		this.name = name;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public void display() {
		System.out.println("Student Name: " + name);
		System.out.println("Student City: " + city);
		System.out.println("Student Address: " + address);
	}
}
