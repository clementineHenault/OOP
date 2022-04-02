package oop;

public class RectangleA extends Shape{
	protected double width = 1.0;
	protected double length = 1.0;
	
	public RectangleA() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public RectangleA(double width, double length) {
		super();
		this.width = width;
		this.length = length;
	}

	public RectangleA(double width, double length, String color, boolean filled) {
		super(color, filled);
		this.width = width;
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}
	
	@Override
	public double getArea() {
		return width * length;
	}
	
	@Override 
	public double getPerimeter() {
		return (2 * (width + length));
	}

	@Override
	public String toString() {
		return "RectangleA [" + super.toString() + "width=" + width + ", length=" + length + "]";
	}

}
