package oop;
public class Dog extends Mammal {
	//Constructor
	public Dog(String name) {
		super(name);
	}
	
	//Public methods
	public void greets() {
		System.out.println("Woof");
	}
	
	public void greets(Dog another) {
		System.out.println("Wooooooooof");
	}
	
	@Override
	public String toString() {
		return "Dog[" + super.toString() + "]";
	}

}
