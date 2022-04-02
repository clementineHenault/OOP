package oop;

public class ResizableCircle extends CircleI implements Resizable {
	public ResizableCircle(double radius) {
		super(radius);
	}
	
	@Override
	public String toString() {
		return "ResizableCircle[" + super.toString() + "]";
	}
	
	public void resize(int percent) {
		radius *= percent/100.0;
	}

}
