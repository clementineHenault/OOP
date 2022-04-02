package oop;

public class CircleA extends Shape {
	protected double radius = 1.0;
	
	public CircleA() {
		super();
	}

	public CircleA(double radius) {
		super();
		this.radius = radius;
	}

	public CircleA(String color, boolean filled) {
		super(color, filled);
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	//Implementation of the Shape abstract methods
	@Override
	public double getArea() {
		return Math.PI * radius * radius;
	}
	
	@Override
	public double getPerimeter() {
		return 2 * Math.PI * radius;
	}

	@Override
	public String toString() {
		return "Circle[=" + super.toString() + ",radius=" + radius + "]";
	}

}
