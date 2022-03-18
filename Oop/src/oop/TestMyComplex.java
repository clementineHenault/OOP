package oop;
public class TestMyComplex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyComplex nb = new MyComplex(1.1, 2.2);
		System.out.println(nb);
		System.out.println("real is: " + nb.getReal());
		nb.setImag(3.3);
		System.out.println("imag is: " + nb.getImag());
		nb.setValue(1.1, 2.2);
		System.out.println(nb.isReal());
		System.out.println(nb.isImaginary());
		System.out.println(nb.equals(nb));
		

	}

}
