/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */

package com.hr.corp.client;

import com.hr.corp.Corporation;
import com.hr.personnel.Executive;
import com.hr.personnel.HourlyEmployee;
import com.hr.personnel.SalariedEmployee;
import gov.irs.IRS;

import java.time.LocalDate;

class TaxClient {
    
    public static void main(String[] args) {
        // create the IRS
        IRS irs = new IRS();
        
        // create the Corporation and register it with the IRS
        Corporation corp = new Corporation("HR, Inc.");
        irs.register(corp);

        HourlyEmployee hourly = new HourlyEmployee("Jason", LocalDate.of(1990, 8, 24), 22.5, 40.0);

        irs.register(hourly);
        irs.register(new SalariedEmployee("Tina", LocalDate.of(2000, 2, 2), 1250.0));
        irs.register(new HourlyEmployee("John",   LocalDate.of(2010, 10, 11), 25.0, 40.0));
        irs.register(new SalariedEmployee("Jane", LocalDate.of(2005, 7, 1), 1500.0));
        irs.register(new Executive("Tomiwa", LocalDate.of(2029, 8, 5), 2_000_000));


        // IRS collects taxes
        System.out.println("IRS collects taxes:");
        irs.collectTaxes();
    }
}