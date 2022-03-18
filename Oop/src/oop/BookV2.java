package oop;
public class BookV2 {
	private String name;
	private Author[] authors;
	private double price;
	private int quantity = 0;
	
	public BookV2(String name, Author[] authors, double price) {
		this.name = name;
		this.authors = authors;
		this.price = price;
	}
	
	public BookV2(String name, Author[] authors, double price, int quantity) {
		this.name = name;
		this.authors = authors;
		this.price = price;
		this.quantity = quantity;
	}
	
	public String getName() {
		return name;
	}
	
	public Author[] getAuthors() {
		return authors;
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
		String returnString = "";
		returnString = "Book[name=" + name + ",authors={"; 
		
		for (int authorsIdx = 0; authorsIdx < authors.length; ++authorsIdx) {
			returnString += authors[authorsIdx].toString();
			returnString += ",";
		}
		returnString = returnString + ",price=" + price + "quantity=" + quantity + "]";
		
		return returnString;
		
	}
	
	public String getAuthorNames() {
		String authorNames ="";
		for (int authorsIdx = 0; authorsIdx < authors.length; ++authorsIdx) {
			authorNames += authors[authorsIdx];
		}
		return authorNames;
	}


}