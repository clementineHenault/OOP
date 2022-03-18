package oop;

public class LineSub extends Point {
	private Point end;
	
	public LineSub(Point begin, Point end) {
		super(begin.getX(), begin.getY());
		this.end = end;
	}
	
	public LineSub(int beginX, int beginY, int endX, int endY) {
		super(beginX, beginY);
		end = new Point(endX, endY);
	}

	@Override
	public String toString() {
		return "LineSub [" + super.toString() + "end=" + end + "]";
	}

	public Point getBegin() {
		Point begin = new Point(super.getX(), super.getY());
		return begin;
	}
	
	public Point getEnd() {
		return end;
	}
	
	public void setBegin(Point begin) {
		super.setX(begin.getX());
		super.setY(begin.getY());
	}
	
	public void setEnd(Point end) {
		this.end = end;
	}
	
	
	
	

}
