package com.codecool.kitchen;

public class Employee {

    String name;
    String birthday;
    int salary;

    public Employee() {
    }

    public float createTaxReport(int salary) {
        return (float) (salary * 0.99);
    }

    public void printTax() {
        System.out.println(createTaxReport(this.salary));
    }
}
