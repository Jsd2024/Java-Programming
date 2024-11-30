package org.jp.demo;
import java.util.*;
import java.util.stream.Collectors;

public class HighestEmpSalByDept {

    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", "New York", 90000, "Engineering"),
                new Employee("Bob", "San Francisco", 120000, "Marketing"),
                new Employee("Charlie", "Chicago", 110000, "Finance"),
                new Employee("David", "New York", 95000, "Engineering"),
                new Employee("Eva", "San Francisco", 130000, "Marketing"),
                new Employee("Frank", "Chicago", 105000, "Finance")
        );

        Map<String, Employee> highestSalariedEmployees = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDept,
                        Collectors.collectingAndThen(
                                Collectors.maxBy(Comparator.comparingInt(Employee::getSalary)),
                                java.util.Optional::get
                        )
                ));

        highestSalariedEmployees.forEach((dept, emp) ->
                System.out.println("Department: " + dept + ", Employee: " + emp));
    }
}
