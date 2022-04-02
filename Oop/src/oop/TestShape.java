package oop;

public class TestShape {
	public static void main(String[] args) {
		Shape carre = new SquareA(4);
		Shape cercle = new CircleA(3.2);
		Shape rectangle = new RectangleA(2, 5);
		
		System.out.println(carre);
		System.out.println(cercle);
		System.out.println(rectangle);
		
		
	}

}
