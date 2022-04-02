package oop;

public class TestGeometricObject {
	public static void main(String[] args) {
		CircleI cercle = new CircleI(5);
		RectangleI rectangle = new RectangleI(3,4);
		System.out.println(cercle);
		System.out.println(rectangle);
		System.out.println("Aire du cercle: " + cercle.getArea());
		System.out.println("Perimetre du rectangle: " + rectangle.getPerimeter());
	}
	

}
