package com.codecool.kitchen;

public class Employee {

    private String name;
    private String birthday;
    private int salary;

    public Employee(String name, String birthday, int salary) {
        this.name = name;
        this.birthday = birthday;
        this.salary = salary;
    }

    public Employee() {}

    public int createTaxReport(int salary) {
        return (int) (salary * 0.99);
    }
}
