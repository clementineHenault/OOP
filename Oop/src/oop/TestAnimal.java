package oop;
public class TestAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat micha = new Cat("Micha");
		System.out.println(micha);
		
		Dog harley = new Dog("Harley");
		System.out.println(harley);
		
		micha.greets();
		harley.greets();
		
		Dog iench = new Dog("iench");
		harley.greets(iench);

	}

}
