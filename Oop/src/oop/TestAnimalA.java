package oop;

public class TestAnimalA {
	public static void main(String[] args) {
		CatA cat = new CatA("garfield");
		DogA dog = new DogA("Odie");
		BigDogA harl = new BigDogA("Harley");
		BigDogA autre = new BigDogA("mecant");
		
		System.out.println(cat);
		System.out.println(dog);
		System.out.println(harl);
		cat.greets();
		harl.greets(autre);
	}

}
