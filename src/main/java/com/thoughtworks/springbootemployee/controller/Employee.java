package com.thoughtworks.springbootemployee.controller;

public class Employee {
    private int id;
    private String name;
    private int age;
    private String male;

    public Employee(int id, String name, int age, String male) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.male = male;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMale() {
        return male;
    }

    public void setMale(String male) {
        this.male = male;
    }
}
