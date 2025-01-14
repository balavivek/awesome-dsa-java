package com.awesome.dsa.data;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DataProducer {

    public static List<Employee> getEmployees(){

        return Arrays.asList(
                new Employee(1, "Mike", "Dev", 100000),
                new Employee(2, "John", "QA", 90000),
                new Employee(3, "Sara", "DevOps", 110000),
                new Employee(4, "Anna", "HR", 95000),
                new Employee(5, "Tom", "Dev", 105000),
                new Employee(6, "Emma", "Marketing", 98000)
        );
    }

    public static Map<String, Double> getEmpSalaryMap(){
        return getEmployees().stream()
                .collect(Collectors.toMap(Employee::getName, Employee::getSalary));
    }
}
