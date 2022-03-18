package oop;
public class Staff extends Person {
	//Private class variables
	private String school;
	private double pay;
	
	//Constructor
	public Staff(String name, String address, String school, double pay) {
		super(name, address);
		this.school = school;
		this.pay = pay;
	}

	//Public methods
	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public double getPay() {
		return pay;
	}

	public void setPay(double pay) {
		this.pay = pay;
	}

	@Override 
	public String toString() {
		return "Staff[" + super.toString() + ",school=" + school + ",pay=" + pay + "]";
	}
	
}