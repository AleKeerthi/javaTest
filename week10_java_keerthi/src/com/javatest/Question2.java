package com.javatest;

import java.util.List;
import java.util.stream.Collectors;

//Get the names of all employees who have joined after 2015?

public class Question2 {
	public static void joinedAfter2015() {
		
       MainClass mainClass=new MainClass();
		List empList=mainClass.employeeDetails();
		Employee emp=new Employee();
		
		empList.stream().filter(e->emp.getSalary()>2015).forEach(e->System.out.println(emp.getName()));
	
		
	}

}
