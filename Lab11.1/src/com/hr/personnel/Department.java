/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */

package com.hr.personnel;

import java.util.ArrayList;
import java.util.Collection;

/**
 * The Department class manages employees.
 *
 * Properties:
 *   String name
 *   String location
 *   Employee[] employees  the Employees in this department.
 *   int currentIndex      internal counter for number of employees in the department.
 *
 * Methods (excluding get/set methods):
 *   void listEmployees()  print info on all employees in the department.
 *   void workEmployees()  make all employees in the department work.
 *   String toString()     self-explanatory.
 */
public class Department {
    // fields
    private String name;
    private String location;
    private final Collection<Employee> employees = new ArrayList<>();

    // constructors
    public Department() {
    }

    public Department(String name, String location) {
        setName(name);
        setLocation(location);
    }

    // business methods
    public void listEmployees() {
        for(Employee emp : employees) {
            System.out.println(emp);
        }
    }

    public void payEmployees() {
        for (Employee emp : employees){
            emp.pay();
        }
    }

    public void workEmployees() {
        for (Employee emp : employees){
            emp.work();
        }
    }

    // For all employees that take vacation, make them do that.
    // salaried employees only
    public void holidayBreak() {
        for (Employee emp : employees) {
            // if emp is actually referring to a salariedEmployee object,
            //"downcast' the employee reference to more specific type SalariedEmployee
            // then we can sell SalariedEmployee-specific methods like takeVacation()
            if (emp  instanceof SalariedEmployee) {
                // downcast-and-method call
                // ((SalariedEmployee) employees[i]).takeVacation();

                // explicitly creates new reference of type SalariedEmployee (semp)
                SalariedEmployee semp = (SalariedEmployee) emp;
                semp.takeVacation();
            }
        }
    }

    // helper method to add an Employee to the array
    public void addEmployee(Employee emp) {
        employees.add(emp);
    }

    // accessor methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "name" + getName() + ", location=" + getLocation();
    }
}