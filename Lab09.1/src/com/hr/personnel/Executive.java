package com.hr.personnel;

import gov.irs.TaxPayer;

import java.time.LocalDate;

public class Executive extends SalariedEmployee {

    public Executive(String name, LocalDate hireDate, double salary) {
        super(name, hireDate, salary);
    }

    @Override
    public void work() {
        System.out.println(getName() + " enjoying a nice round of golf");
    }

    // would only need separate payTaxes() if taxes were different from Salaried employees
//    public void payTaxes() {
//        System.out.println(getName() + " paid taxes of " + (getSalary() * SALARIED_TAX_RATE));
//    }
}
