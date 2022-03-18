package oop;
public class TestBookV3 {
	public static void main(String[] args) {
		// Test Author class
		Author a1 = new Author("Tan Ah Teck", "ahteck@nowhere.com", 'm');
		System.out.println(a1);

		a1.setEmail("ahteck@somewhere.com");
		System.out.println(a1);
		System.out.println("name is: " + a1.getName());
		System.out.println("email is: " + a1.getEmail());

		// Test Book class
		BookV3 b1 = new BookV3("12345", "Java for dummies", a1, 8.8, 88);
		System.out.println(b1);

		b1.setPrice(9.9);
		b1.setQuantity(99);
		System.out.println(b1);
		System.out.println("isbn is: " + b1.getName());
		System.out.println("name is: " + b1.getName());
		System.out.println("price is: " + b1.getPrice());
		System.out.println("qty is: " + b1.getQuantity());
		System.out.println("author is: " + b1.getAuthor());  // Author's toString()
		System.out.println("author's name: " + b1.getAuthorName());
		System.out.println("author's name: " + b1.getAuthor().getName());
		System.out.println("author's email: " + b1.getAuthor().getEmail());
	}

}
