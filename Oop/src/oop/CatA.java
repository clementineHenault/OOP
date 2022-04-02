package oop;

public class CatA extends AnimalA {

	public CatA(String name) {
		super(name);
	}
	
	@Override
	public void greets() {
		System.out.println("Meow");
	}	

}
