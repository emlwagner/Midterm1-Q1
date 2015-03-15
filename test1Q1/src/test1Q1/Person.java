package test1Q1;

public class Person {
	private static String name;
	private String address;
	private String phoneNbr;
	private String email;
	
	public Person() {
		}
	
	public Person(String name, String address, String phoneNbr, String email) {
		this.name = name;
		this.address = address;
		this.phoneNbr = phoneNbr;
		this.email = email;
	}

	public static String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNbr() {
		return phoneNbr;
	}

	public void setPhoneNbr(String phoneNbr) {
		this.phoneNbr = phoneNbr;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "The class is Person and the person's name is " + this.name;
	}

}
