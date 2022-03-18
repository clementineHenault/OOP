package oop;
public class AccountV2 {
	private int id;
	private Customer customer;
	private double balance = 0.0;
	
	public AccountV2(int id, Customer customer, double balance) {
		super();
		this.id = id;
		this.customer = customer;
		this.balance = balance;
	}

	public AccountV2(int id, Customer customer) {
		super();
		this.id = id;
		this.customer = customer;
	}

	public int getId() {
		return id;
	}

	public Customer getCustomer() {
		return customer;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	@Override
	public String toString() {
		return customer.toString() + " " + "balance=$" + balance;
	}
	
	public String getCustomerName() {
		return customer.getName();
	}
	
	public AccountV2 deposit(double amount) {
		balance += amount;
		return this;
	}
	
	public AccountV2 withdraw(double amount) {
		if (balance >= amount) {
			balance -= amount;
		} else {
			System.out.println("Amount withdrawn exceeds the current balance!");
		}
		return this;
	}
	
	
	
	

}
