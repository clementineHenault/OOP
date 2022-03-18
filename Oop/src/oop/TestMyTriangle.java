package oop;
public class TestMyTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyPoint p1 = new MyPoint(1,3);
		MyPoint p2 = new MyPoint(4,5);
		MyPoint p3 = new MyPoint(7, 10);
		
		MyTriangle triangle = new MyTriangle(p1, p2, p3);
		System.out.println(triangle);
		System.out.println("Type is: " + triangle.getType());
		System.out.println("The perimeter is: " + triangle.calculatePerimeter());

	}

}
