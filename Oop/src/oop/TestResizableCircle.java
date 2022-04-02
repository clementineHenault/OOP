package oop;

public class TestResizableCircle {
	public static void main(String[] args) {
		ResizableCircle cercleMieux = new ResizableCircle(9);
		System.out.println(cercleMieux);
		cercleMieux.resize(110);
		System.out.println(cercleMieux);
	}

}
