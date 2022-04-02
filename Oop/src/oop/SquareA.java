package oop;

public class SquareA extends RectangleA {
	public SquareA() {
		super();
	}
	
	public SquareA(double side) {
		super(side, side);
	}
	
	public SquareA(double side, String color, boolean filled){
		super(side, side, color, filled);
	}
	
	public double getSide() {
		return this.length;
	}
	
	public void setSide(double side) {
		super.setLength(side);
		super.setWidth(side);
	}
	
	public void setWidth(double side) {
		super.setWidth(side);
	}
	
	public void setLength(double side) {
		super.setLength(side);
	}
	
	@Override
	public String toString() {
		return "Square[" + super.toString() + "]";
	}

}
