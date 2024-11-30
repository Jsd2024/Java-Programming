package org.jp.demo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

import java.util.Arrays;
import java.util.List;
@Data
@ToString
@AllArgsConstructor
class Employee {
    String name;
    String city;
    int salary;
    String dept;

//    public Employee(String name, String city, int salary) {
//        this.name = name;
//        this.city = city;
//        this.salary = salary;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public String getCity() {
//        return city;
//    }
//
//    public int getSalary() {
//        return salary;
//    }
//
//    @Override
//    public String toString() {
//        return "Employee{" +
//                "name='" + name + '\'' +
//                ", city='" + city + '\'' +
//                ", salary=" + salary +
//                '}';
//    }
}
