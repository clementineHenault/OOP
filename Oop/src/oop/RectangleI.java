package oop;

public class RectangleI implements GeometricObject{
	private double width;
	private double length;
	
	public RectangleI(double width, double length) {
		super();
		this.width = width;
		this.length = length;
	}

	@Override
	public String toString() {
		return "RectangleI [width=" + width + ", length=" + length + "]";
	}
	
	@Override
	public double getArea() {
		return width * length;
	}
	
	@Override
	public double getPerimeter() {
		return (2 * (width + length));
	}

}
