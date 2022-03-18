package oop;
public class MyRectangle {
	private MyPoint topLeft;
	private MyPoint bottomRight;
	
	public MyRectangle(int x1, int y1, int x2, int y2) {
		topLeft.setXY(x1, y1);
		bottomRight.setXY(x2, y2);
	}

	
	public MyRectangle(MyPoint topLeft, MyPoint bottomRight) {
		super();
		this.topLeft = topLeft;
		this.bottomRight = bottomRight;
	}

	public MyPoint getTopLeft() {
		return topLeft;
	}

	public void setTopLeft(MyPoint topLeft) {
		this.topLeft = topLeft;
	}

	public MyPoint getBottomRight() {
		return bottomRight;
	}

	public void setBottomRight(MyPoint bottomRight) {
		this.bottomRight = bottomRight;
	}
	

	public MyPoint getTopRight() {
		MyPoint topRight = new MyPoint(bottomRight.getX(), topLeft.getY());
		return topRight;
	}
	
	public MyPoint getBottomLeft() {
		MyPoint bottomLeft = new MyPoint(topLeft.getX(), bottomRight.getY());
		return bottomLeft;
	}
	
	public double calculatePerimeter() {
		return topLeft.distance(getTopRight()) + getTopRight().distance(bottomRight) + bottomRight.distance(getBottomLeft()) + getBottomLeft().distance(topLeft);
	}


	@Override
	public String toString() {
		return "MyRectangle [topLeft=" + topLeft + ", bottomRight=" + bottomRight + "]";
	}
	
	
	

}
