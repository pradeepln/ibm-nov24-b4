package com.ibm.training.basics;

public class ReferenceVsObjects {

	public static void main(String[] args) {
		Point p1; // this is reference
		
		p1 = new Point(10, 20); // created an obj, p1 points to that obj
		
		Point p2; // this is a reference
		
		
		
//		System.out.println(p2.x);
//		p1.x = 100;
//		System.out.println(p2.x);
		
		p2 = new Point(10, 20); // p2 is pointing to a different object, albeit with same values
		//p2 = p1; //p2 starts pointing to same obj as p1
		
		
		System.out.println(p1 == p2);
		
		System.out.println(p1.equals(p2));

	}

}
