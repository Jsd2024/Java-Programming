package org.jp.demo;

import lombok.extern.slf4j.Slf4j;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;



//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main1 {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", "New York", 90000,"IT"),
                new Employee("Bob", "San Francisco", 220000,"EE"),
                new Employee("Hunter", "Canada", 220000,"EE"),
                new Employee("Charlie", "Chicago", 110000, "IT"),
                new Employee("Picaso", "CA", 210000, "ECE")
        );
        Employee highestSalaryEmployee = employees
                .stream()
                .max(Comparator.comparingInt(Employee::getSalary))
                .orElse(null);



        if (highestSalaryEmployee != null) {
            System.out.println("Employee with the highest salary: " + highestSalaryEmployee);
        } else {
            System.out.println("No employees found.");
        }

//        Employee deptHighestSalaryEmployee = employees
//                .stream()
//                .max((e1, e2) -> Integer.compare(e1.getSalary(),
//                        e2.getSalary()))
//                .orElse(null);
//
//        Map<String, List<Employee>> employeesByDept =
//                employees
//                        .stream()
//                        .collect(Collectors.groupingBy(e->e.getDept()));
//
//        employeesByDept.entrySet()
//                        .stream()
//                .max((e1, e2) -> Integer.compare(e1.getValue().get(0).getSalary(),
//                e2.getSalary()))
//                .orElse(null))


//        System.out.println("Employee with the Depthighest salary: " + employeesByDept);
    }
}