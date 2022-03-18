package oop;
public class TestMyCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyPoint centre = new MyPoint(5, 5);
		MyCircle cercle = new MyCircle(centre, 3);
		
		System.out.println(centre);
		System.out.println(cercle);
		System.out.println("The area is: " + cercle.calculateArea());
		System.out.println("The circumference is: " + cercle.calculateCircumference());
		
		MyPoint centre2 = new MyPoint(2, 2);
		MyCircle cercle2 = new MyCircle(centre2, 4);
		System.out.println("Distance is: " + cercle.distance(cercle2));
	}

}
