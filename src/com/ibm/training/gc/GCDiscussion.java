package com.ibm.training.gc;

import com.ibm.training.basics.Car;
import com.ibm.training.basics.ChemicalElement;
import com.ibm.training.basics.Point;

public class GCDiscussion {

	public static void main(String[] args) {
		
		int iMain = 42;
		Car c = new Car();
		m1();

		//point x
	}

	private static void m1() {
		
		float fM1 = 123.1f;
		int[] iArr = new int[10];
		Point p = new Point(10, 20);
		m2(p);
		//point y
	}

	private static void m2(Point x) {
		char cM2 = 'a';
		ChemicalElement unobtainium = new ChemicalElement(115, "Moscovium", "Ms");
		
		//point z
	}

}
