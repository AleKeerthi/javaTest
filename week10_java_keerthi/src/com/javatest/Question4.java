package com.javatest;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//Number of male and female employees are there in the sales and marketing department?

public class Question4 {
public static void empInDiffDep() {
	MainClass mainClass=new MainClass();
	List empList=mainClass.employeeDetails();
	Employee emp=new Employee();
	

    Map<String, Map<String, Long>> genderCount= (Map<String, Map<String, Long>>) empList.stream()
            .filter(e -> "Sales".equals(emp.getDepartment()) || "Marketing".equals(emp.getDepartment()))
            .collect(Collectors.groupingBy(Employee::getDepartment,
                    Collectors.groupingBy(Employee::getGender, Collectors.counting())));

    System.out.println(genderCount);
 

}
}
