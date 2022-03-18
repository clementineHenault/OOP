/**
 * 
 * @author clementine
 *
 */
package oop;
public class Employee {
	//Private variables
	private int id;
	private String firstName;
	private String lastName;
	private int salary;
	
	//Constructors
	/** Constructs a Employee instance with the given id, first name, last name and salary */
	public Employee(int id, String firstName, String lastName, int salary) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
	}
	
	//Public methods
	public int getID() {
		return id;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public String getName() {
		return firstName + " " + lastName;
	}
	
	public int getSalary() {
		return salary;
	}
	
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public int getAnnualSalary() {
		return salary * 12;
	}
	
	public int raiseSalary(int percent) {
		salary = (int)(salary * (1.0 + (double)(percent)/100));
		return salary;
	}
	
	public String toString() {
		return "Employee[id=" + id + ",name=" + firstName + " " + lastName + ",salary=" + salary + "]";
	}

}
