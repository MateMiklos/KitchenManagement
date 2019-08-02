package com.codecool.kitchen;

public class Cook extends Employee {

    private boolean hasKnifeSet;

    public Cook(String name, String birthday, int salary, boolean hasKnifeSet) {
        this.hasKnifeSet = true;
        this.name = name;
        this.birthday = birthday;
        this.salary = salary;
    }

    public void cook() {

    }
}
