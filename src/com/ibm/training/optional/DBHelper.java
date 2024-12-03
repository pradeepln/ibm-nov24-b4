package com.ibm.training.optional;

import java.util.Optional;

public class DBHelper {
	
	public static Optional<Employee> findEmployee(int empid) {
		//select * from employee where emp_id=empid
		boolean found = false;
		if(found) {
			return Optional.of(new Employee(empid, "data from db"));
		}else {
			return Optional.empty();
		}
	}

}
