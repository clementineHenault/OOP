package oop;

public class TestLine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point a = new Point(3, 5);
		Point b = new Point(7, 15);
		Line testLine = new Line(a, b);
		System.out.println(a);
		System.out.println(testLine);
		System.out.println("Length is: " + testLine.calculateLength());
		System.out.println("Gradient is: " + testLine.calculateGradient());

	}

}
