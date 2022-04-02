package oop;

public class CircleI implements GeometricObject {
	protected double radius;

	public CircleI(double radius) {
		super();
		this.radius = radius;
	}

	@Override
	public String toString() {
		return "CircleI [radius=" + radius + "]";
	}
	
	@Override 
	public double getArea() {
		return Math.PI * radius * radius;
	}
	
	@Override
	public double getPerimeter() {
		return 2 * Math.PI * radius;
	}

}
