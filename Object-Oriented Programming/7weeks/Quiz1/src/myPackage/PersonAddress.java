package myPackage;

public class PersonAddress {
	private String first_name, last_name, email,
	phoneNum;
	
	public static final String nationality = "Korea";
	
	public String getFirst_name() {
		return first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public String getEmail() {
		return email;
	}
	public String getPhoneNum() {
		return phoneNum;
	}
	
	public void setName(String first_name, String last_name) {
		this.first_name = first_name;
		this.last_name = last_name;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	
	public void print_att() {
		System.out.println("Nationality: " + nationality);
		System.out.println("Name: " + getFirst_name() + " " + getLast_name());
		System.out.println("E-mail: " + getEmail());
		System.out.println("Phone Number: " + getPhoneNum());
	}
	
	public boolean equals(PersonAddress object) {
		return (this.first_name == object.getFirst_name())
				&& (this.last_name == object.getLast_name());
	}
	
	
}
