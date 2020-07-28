package com.thoughtworks.springbootemployee.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeesController {
    private final String MALE = "male";
    private final String FEMALE = "female";
    private List<Employee> employees = generateEmployees();

    private List<Employee> generateEmployees() {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(0, "Xiaoming", 190, MALE));
        employees.add(new Employee(1, "Xiaohong", 19, FEMALE));
        employees.add(new Employee(2, "Xiaozhi", 15, MALE));
        employees.add(new Employee(3, "Xiaogang", 16, MALE));
        employees.add(new Employee(4, "Xiaoxia", 15, FEMALE));
        return employees;
    }
}
