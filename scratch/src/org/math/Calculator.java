package org.math;/*
This is an all static class, one with nothing but static methods.
These methods are called from clients as Calculator.add() etc.
 */

import static java.lang.Math.*;

class Calculator {

    /*
    Returns the average of the supplied integers
     */
    public static double average(int first, int...rest) {    // 3, 5, 10, 13
        double result = 0.0;

        int sum = first;
        for (int value : rest) {
            sum += value;

        }
        result = (double)sum / (rest.length + 1);

        return result;
    }
    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static boolean isEven(int value) {
       return value % 2 == 0;
    }

    // Returns a random integer between min and max (inclusive)

    public static int randomInt(int min, int max) {
        int result = 0;

        double rand = Math.random();
        double scaled = (rand * (max - min + 1)) + min;
        result = (int) scaled;

        return result;
    }


    // return a random number between 1 - 16 inclusive
    public static int randomInt() {
       return randomInt(1, 16);     // calling other randomInt method
    }

}