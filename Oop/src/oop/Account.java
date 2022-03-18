/**
 * The Account class models the bank account of a costumer 
 * @author clementine
 *
 */
package oop;
public class Account {
	//Private variables
	private String id;
	private String name;
	private int balance = 0;
	
	//Constructors
	/** Constructs a Account instance with the given id and name */
	public Account(String id, String name) {
		this.id = id;
		this.name = name;
	}
	
	/** Contructs a Account instance with the given id, name and balance */
	public Account(String id, String name, int balance) {
		this.id = id;
		this.name = name;
		this.balance = balance;
	}
	
	//Public methods
	public String getID() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public int getBalance() {
		return balance;
	}

	public int credit(int amount) {
		balance += amount;
		return balance;
	}
	
	public int debit(int amount) {
		if (amount <= balance) {
			balance -= amount;
		} else {
			System.out.println("Amount exceeded balance");
		}
		return balance;
	}
	
	public int transferTo(Account another, int amount) {
		if (amount <= balance) {
			balance -= amount;
			another.balance += amount;
		} else {
			System.out.println("Amount exceeded balance");
		}
		return balance;
	}
	
	public String toString() {
		return "Account[id=" + id + ",name=" + name + ",balance=" + balance + "]";
	}
}
