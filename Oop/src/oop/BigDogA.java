package oop;

public class BigDogA extends DogA{

	public BigDogA(String name) {
		super(name);
	}

	@Override
	public void greets() {
		System.out.println("Woooow");
	}
	
	@Override
	public void greets(DogA another) {
		System.out.println("Woooooooooooow");
	}
	
	public void greets(BigDogA another) {
		System.out.println("Wooooooooooooooooooooooooooooow");
	}

}
