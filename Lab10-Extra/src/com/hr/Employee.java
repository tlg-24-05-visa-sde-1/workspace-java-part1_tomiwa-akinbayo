package com.hr;

import com.transportation.Car;
import com.transportation.DestinationUnreachableException;

public class Employee {
    // INSTANCE VARIABLES
    private String name;

    // CONSTRUCTORS
    public Employee(String name) {
        this.name = name;
    }

    // BUSINESS METHODS

    /*
    Option 4: try catch and throw a different exception at the client.
    NOTE: we will "wrap" the DestinationUnreachableException into a new
    WorkException.
     */
    public void goToWork() throws WorkException{
        Car c = new Car("2048", "BMW", "M!");
        try {
            c.start();
            c.moveTo("West Seattle");
        } catch (DestinationUnreachableException e) {
            // insert this exception into a new work exception and throw that.
            throw new WorkException("Unable to get to work", e);
        } finally {
            c.stop();
        }
    }

    /*
    Option 3: try-catch, "react in some way," and re-throw it back at client
     */
/*        public void goToWork() throws DestinationUnreachableException{
        // create an instance of Car with all three properties: vin, make, model
        Car c = new Car("2408", "BMW", "M1");

        try {
            c.start();
            c.moveTo("West Seattle");
        } catch (DestinationUnreachableException e) {
            System.out.println("Emailing Lisa Herbold to complain");
            throw e;
        } finally {
            c.stop();
        }
    }*/

    /*
    Option 2: punt. don't catch the exception. ignore it
    NOTE: USe a try finally to make sure c.stop gets called
     */

/*    public void goToWork() throws DestinationUnreachableException{
        Car c = new Car("2408", "BMW", "M1");

        try {
            c.start();
            c.moveTo("West Seattle");
        } finally {
            c.stop();
        }

    }*/

    /*
    Option 1:try-catch and handle it. exception stops here.
     */
//    public void goToWork()  {
//        // create an instance of Car with all three properties: vin, make, model
//        Car c = new Car("2408", "BMW", "M1");
//
//        try {
//            c.start();
//            c.moveTo("West Seattle");
//        } catch (DestinationUnreachableException e) {
//            System.out.println(e.getMessage());
//        } finally {
//            c.stop();
//        }
//    }

    // ACCESSOR METHODS
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + ": name=" + getName();
    }
}