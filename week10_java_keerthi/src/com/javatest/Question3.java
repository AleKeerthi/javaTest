package com.javatest;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//Get the youngest employee details each department wise
public class Question3 {
	
	public static void youngestEmpl() {
	MainClass mainClass=new MainClass();
	List empList=mainClass.employeeDetails();
	Employee emp=new Employee();
	
	
	 Map<String, Employee> youngestEmployee= (Map<String, Employee>) empList.stream()
             .collect(Collectors.groupingBy(Employee::getDepartment,
                       Collectors.minBy(Comparator.comparingInt(Employee::getAge))));
	 
	 System.out.println(youngestEmployee);
                           
 }


	}
