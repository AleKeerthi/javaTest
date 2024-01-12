package com.javatest;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

// List down the names of all employees in each department?

public class Question5 {
public static void nameOfEmp() {
	
	
	MainClass mainClass=new MainClass();
	List empList=mainClass.employeeDetails();
	Employee emp=new Employee();
	

    Map<String, List<String>> employeesByDepartment = (Map<String, List<String>>) empList.stream()
            .collect(Collectors.groupingBy(Employee::getDepartment));
 
    System.out.println(employeesByDepartment);

  
	
}
}
