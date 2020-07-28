package com.thoughtworks.springbootemployee.controller;

import org.springframework.web.bind.annotation.*;

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

    @GetMapping
    public List<Employee> getEmployees() {
        return employees;
    }

    @PostMapping
    public void addEmployees(@RequestParam(value = "id") int id,
                             @RequestParam(value = "name") String name,
                             @RequestParam(value = "age") int age,
                             @RequestParam(value = "gender") String gender) {
        employees.add(new Employee(id, name, age, gender));
    }
}
