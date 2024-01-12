package com.javatest;

import java.util.List;
import java.util.stream.Collectors;

//1. How many male and female employees are there in the organization?

public class Question1 {
	public static void maleFemaleEmp() {
		
		MainClass mainClass=new MainClass();
		List empList=mainClass.employeeDetails();
		Employee emp=new Employee();
		
		Long maleList=(Long) empList.stream().filter(e->emp.getGender()=="Male").collect(Collectors.counting());
		Long femaleList=(Long) empList.stream().filter(e->emp.getGender()=="Female").collect(Collectors.counting());
		System.out.println(maleList);
		System.out.println(femaleList);
		
	}

}
