package com.app.src.test;

import com.app.dto.Employee;
import com.app.src.EmpService;


public class EmpServiceStub implements EmpService{

	public Employee getEmployee(int id) {
		return new Employee(1,"naveen");
	}
}
