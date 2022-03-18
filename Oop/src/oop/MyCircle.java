package oop;
public class MyCircle {
	private MyPoint center = new MyPoint(0, 0);
	private int radius = 1;
	
	public MyCircle() {
		center = new MyPoint(0, 0);
		radius = 1;
	}
	
	public MyCircle(int x, int y, int radius) {
		center = new MyPoint(x, y);
		this.radius = radius;
	}
	
	public MyCircle(MyPoint center, int radius) {
		super();
		this.center = center;
		this.radius = radius;
	}

	public MyPoint getCenter() {
		return center;
	}

	public void setCenter(MyPoint center) {
		this.center = center;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	public int getCenterX() {
		return center.getX();
	}
	
	public void setCenterX(int x) {
		center.setX(x);
	}
	
	public int getCenterY() {
		return center.getY();
	}
	
	public void setCenterY(int y) {
		center.setY(y);
	}
	
	public int[] getCenterXY() {
		return center.getXY();
	}
	
	public void setCenterXY(int x, int y) {
		center.setXY(x, y);
	}
	
	public String toString() {
		return "MyCircle[radius=" + radius + ",center=" + center.toString() + "]" ;
	}
	
	public double calculateArea() {
		return 2*Math.PI*radius;
	}
	
	public double calculateCircumference() {
		return Math.PI*Math.pow(radius, 2);
	}
	
	public double distance(MyCircle another) {
		return center.distance(another.center);
	}
	

}
