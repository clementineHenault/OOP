package oop;

public class CylinderC {
	private Circle base;
	private double height;
	
	public CylinderC() {
		Circle base = new Circle();
		height = 3.0;
	}
	
	public CylinderC(Circle base, double height) {
		super();
		this.base = base;
		this.height = height;
	}
	
	public CylinderC(int radius, double height) {
		base = new Circle(radius);
		this.height = height;
	}


	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	public double calculateVolume() {
		return base.getArea() * height;
	}
	
	public double calculateArea() {
		return 2 * Math.PI * base.getRadius() * height;
	}

	@Override
	public String toString() {
		return "CylinderC [base=" + base + ", height=" + height + "]";
	}
	
	
	

}
