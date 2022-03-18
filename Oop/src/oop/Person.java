package oop;
public class Person {
	//Private class variables
	private String name;
	private String address;
	
	//Constructors
	public Person(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Person[name=" + name + ", address=" + address + "]";
	}
	

}
