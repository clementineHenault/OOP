/**
 * The Rectangle class models a rectangle with a length and a width
 * @author clementine
 *
 */
package oop;
public class Rectangle {
	//Private instance variables
	private float length = 1.0f;
	private float width = 1.0f;
	
	//Constructors
	/** Constructs a Rectangle instance with default value for length and width */
	public Rectangle() {
		length = 1.0f;
		width = 1.0f;
	}
	
	/** Constructs a Rectangle instance with the given length and width */
	public Rectangle(float length, float width) {
		this.length = length;
		this.width = width;
	}
	
	//Public methods
	public float getLength() {
		return length;
	}
	
	public void setLength(float length) {
		this.length = length;
	}
	
	public float getWidth() {
		return width;
	}
	
	public void setWidth(float width) {
		this.width = width;
	}
	
	public double getArea() {
		return length * width;
	}

	public double getPerimeter() {
		return (2 * (length + width));
	}
	
	public String toString() {
		return "Rectangle[length=" + length + ",width=" + width + "]"; 
	}
	
}
