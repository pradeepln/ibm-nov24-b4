package com.ibm.training.basics;

public class MyDSUser {

	public static void main(String[] args) {
		Car c = new Car();
		Point p = new Point(23, 123);
		ChemicalElement h = new ChemicalElement(1, "hyd", "H");
		
		MyDS ds = new MyDS();
		
		ds.addElement(c);
		ds.addElement(h);
		ds.addElement(p);

	}

}
