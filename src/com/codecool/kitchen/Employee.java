package com.codecool.kitchen;

public class Employee {

    protected String name;
    protected String birthday;
    protected int salary;

    public Employee() {
    }

    public float createTaxReport(int salary) {
        return (float) (salary * 0.99);
    }

    public void printTax() {
        System.out.println(createTaxReport(this.salary));
    }
}
