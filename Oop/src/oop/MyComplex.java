package oop;
public class MyComplex {
	private double real = 0.0;
	private double imag = 0.0;
	
	
	public MyComplex() {
		super();
		real = 0.0;
		imag = 0.0;
	}

	public MyComplex(double real, double imag) {
		super();
		this.real = real;
		this.imag = imag;
	}

	public double getReal() {
		return real;
	}

	public void setReal(double real) {
		this.real = real;
	}

	public double getImag() {
		return imag;
	}

	public void setImag(double imag) {
		this.imag = imag;
	}
	
	public void setValue(double real, double imag) {
		this.real = real;
		this.imag = imag;
	}

	@Override
	public String toString() {
		return real + "+" + imag + "i";
	}
	
	public boolean isReal() {
		return (imag == 0);
	}
	
	public boolean isImaginary() {
		return (real == 0);
	}
	
	public boolean equals(double real, double imag) {
		return (this.real == real && this.imag == imag);
	}
	
	public boolean equals(MyComplex another) {
		return (this.real == another.getReal() && this.imag == another.getImag());
	}
	
	public double magnitude() {
		return Math.sqrt((real*real + imag*imag));
	}
	
	public MyComplex addInto(MyComplex right) {
		real = real + right.getReal();
		imag = imag + right.getImag();
		return this;
	}
	
	public MyComplex addNew(MyComplex right) {
		return new MyComplex((real + right.getReal()), (imag + right.getImag()));
	}
	
	
	

}
