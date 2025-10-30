package in.spring.beans;

public class Address {
	
	private String state;
	private String country;
	private String zipCode;
	
	
	public Address(String state, String country, String zipCode) {
		super();
		this.state = state;
		this.country = country;
		this.zipCode = zipCode;
	}
	
	public String toString() {
		return state + ", " + country + " - " + zipCode;
	}

}
