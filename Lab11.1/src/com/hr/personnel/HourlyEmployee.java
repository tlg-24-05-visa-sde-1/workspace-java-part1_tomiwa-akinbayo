package com.hr.personnel;

import gov.irs.TaxPayer;

import java.time.LocalDate;

public class HourlyEmployee extends Employee {
    private double rate;
    private double hours;

    public HourlyEmployee() {
        super();
    }

    public HourlyEmployee(String name, LocalDate hireDate) {
        super(name, hireDate);
    }

    public HourlyEmployee(String name, LocalDate hireDate, double rate, double hours){
        this(name, hireDate);
        setRate(rate);
        setHours(hours);
    }

    // business methods
    @Override
    public void pay() {
        System.out.printf("%s is paid hourly %s", getName(), (getRate() * getHours()));
    }

    @Override
    public void payTaxes() {
        System.out.println(getName() + " paid taxes of " + (getRate() * getHours()) * HOURLY_TAX_RATE);
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    @Override
    public String toString() {
        return super.toString() + ", rate=" + getRate() + ", hours=" + getHours();
    }
}