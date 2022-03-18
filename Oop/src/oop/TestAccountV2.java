package oop;
public class TestAccountV2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer paul = new Customer(12, "BIGA Paul", 'm');
		System.out.println(paul);
		
		AccountV2 comptePaul = new AccountV2('1', paul, 500000000.99);
		System.out.println(comptePaul);
		
		System.out.println("customer is: " + comptePaul.getCustomer());
		comptePaul.deposit(150.0);
		System.out.println("balance is: " + comptePaul.getBalance());
		
		comptePaul.withdraw(150.0);
		System.out.println("balance is: " + comptePaul.getBalance());
		System.out.println("customer's name is: " + comptePaul.getCustomerName());

	}

}
