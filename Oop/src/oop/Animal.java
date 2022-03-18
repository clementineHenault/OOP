package oop;
public class Animal {
	//Private class variables
	private String name;
	
	//Constructor
	public Animal(String name) {
		super();
		this.name = name;
	}

	//Public methods
	@Override
	public String toString() {
		return "Animal[name=" + name + "]";
	}
	

}
