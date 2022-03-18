package oop;
public class TestMyRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyPoint p1 = new MyPoint(4, 4);
		MyPoint p2 = new MyPoint(0, 0);
		MyRectangle r = new MyRectangle(p1, p2);
		System.out.println(r);
		System.out.println("Perimeter is: " + r.calculatePerimeter());

	}

}
