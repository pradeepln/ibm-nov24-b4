package com.ibm.training.optional;

import java.util.Optional;

public class HRApp {

	public static void main(String[] args) {
		int empidFromUi = 1;
		
//		Optional<Employee> opt = DBHelper.findEmployee(empidFromUi);
//		
//		if( opt.isPresent() ) {
//			Employee e = opt.get();
//			System.out.println("__________");
//			System.out.println("Name: "+e.getName());
//			System.out.println("__________");
//		}
		
		Employee defEmp = new Employee(-1, "not found");
		
		Employee e = DBHelper.findEmployee(empidFromUi).orElse(defEmp);

		System.out.println("__________");
		System.out.println("Name: "+e.getName());
		System.out.println("__________");
	}

}
