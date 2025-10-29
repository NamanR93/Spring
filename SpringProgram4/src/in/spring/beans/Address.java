package in.spring.beans;

public class Address {
	
	private String state;
	private String country;
	private String zipCode;
	
	
	public void setState(String state) {
		this.state = state;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	
	public String toString() {
		return state + ", " + country + " - " + zipCode;
	}

}
