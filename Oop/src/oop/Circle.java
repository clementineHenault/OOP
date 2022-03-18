package oop;
/**
 * The Circle class models a circle with a radius and color.
 */

public class Circle {
	//Private instance variables
	private double radius = 1.0;
	private String color = "red";
	
	//Constructors
	/** Constructs a Circle instance with default radius and color */
	public Circle() {
		radius = 1.0;
		color = "red";
	}
	/** Constructs a Circle instance with the given radius and default color */
	public Circle(double radius) {
		this.radius = radius;
		color = "red";
	}
	/**Constructs a Circle instance with the given radius and color */
	public Circle(double radius, String color) {
		this.radius = radius;
		this.color = color;
	}
	
	//Public methods
	/** Returns the radius */
	public double getRadius() { //getter for radius
		return radius;
	}
	/** Returns the color */
	public String getColor() { //getter for color
		return color;
	}
	
	/** Returns the area */
	public double getArea() {
		return radius*radius*Math.PI;
	}
	
	//Setter for instance variable radius
	public void setRadius(double newRadius) {
		this.radius = newRadius;
	}
	
	//Setter for instance variable color
	public void setColor(String newColor) {
		this.color = newColor;
	}
	
	public double getCircumference() {
		   return 2*Math.PI*radius;
	}
	
	public String toString() {
		return "Circle[radius=" + radius + " color=" + color + "]";
	}
	
}
