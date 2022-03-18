package oop;
public class BookV3 {
	private String isbn;
	private String name;
	private Author author;
	private double price;
	private int quantity = 0;

	public BookV3(String isbn, String name, Author author, double price) {
		this.isbn = isbn;
		this.name = name;
		this.author = author;
		this.price = price;
	}

	public BookV3(String isbn, String name, Author author, double price, int quantity) {
		this.isbn = isbn;
		this.name = name;
		this.author = author;
		this.price = price;
		this.quantity = quantity;
	}

	public String getISBN() {
		return isbn;
	}
	
	public String getName() {
		return name;
	}

	public Author getAuthor() {
		return author;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String toString() {
		return "BookV3[isbn=" + isbn + ",name=" + name + "," + "author=" + author.toString() + ",price=" + price + ",quantity=" + quantity + "]";
	}

	public String getAuthorName() {
		return author.getName();
	}

	public String getAuthorEmail() {
		return author.getEmail();
	}

	public char getAuthorGender() {
		return author.getGender();
	}

}
