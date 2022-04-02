package oop;

public class DogA extends AnimalA{

	public DogA(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void greets(){
		System.out.println("Woof");
	}

	public void greets(DogA another) {
		System.out.println("Wooooof");
	}
	
}
