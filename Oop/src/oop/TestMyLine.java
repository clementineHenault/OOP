package oop;
public class TestMyLine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyPoint p1 = new MyPoint(3, 5);
		MyPoint p2 = new MyPoint(5, 10);
		
		MyLine line = new MyLine(p1, p2);
		System.out.println(line);
		System.out.println("Length is: " + line.getLength());
		System.out.println("Gradient is: " + line.getGradient());
		p1.setXY(0, 15);
		int[] p1Coos = p1.getXY();
		System.out.println("p1's coordonates are: "+ p1Coos[0] + "," + p1Coos[1]);

	}

}
