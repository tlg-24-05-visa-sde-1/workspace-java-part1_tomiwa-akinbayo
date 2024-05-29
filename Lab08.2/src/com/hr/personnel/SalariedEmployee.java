package com.hr.personnel;

import java.time.LocalDate;

public class SalariedEmployee extends Employee {
    private double salary;

    public SalariedEmployee() {
        super();
    }

    public SalariedEmployee(String name, LocalDate hireDate) {
        super(name, hireDate); // delegate to superclass ctor

        // register401k()
    }

    public SalariedEmployee(String name, LocalDate hireDate, double salary) {
        this(name, hireDate); // delegate to neighboring ctor that handles name and hireDate and 401k.
        setSalary(salary);
    }

    // business methods
    @Override
    public void pay() {
        System.out.printf("%s is paid salary %s", getName(), getSalary());
    }

    public void takeVacation() {
        System.out.println(getName() + " is on vacation");  // only available to salaried employees
    }

    // accessor methods
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return  super.toString() + ": name=" + getName() + ", salary=" + getSalary();
    }
}