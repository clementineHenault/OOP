package oop;

abstract public class Shape {
	protected String color = "red";
	protected Boolean filled = true;
	
	//Constructors
	public Shape() {
		color = "red";
		filled = true;
	}
	
	public Shape(String color, boolean filled) {
		this.color = color;
		this.filled = filled;
	}

	//Public methods
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Boolean getFilled() {
		return filled;
	}

	public void setFilled(Boolean filled) {
		this.filled = filled;
	}
	
	//Public abstract methods
	abstract double getArea();
	
	abstract double getPerimeter();

	@Override
	public String toString() {
		return "Shape [color=" + color + ", filled=" + filled + "]";
	}

}
