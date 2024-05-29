package org.math;

import static org.math.Calculator.*;

class CalculatorClient {
    public static void main(String[] args) {

        double sum = Calculator.add(1.5, 4);
        System.out.println(sum);

        System.out.println("difference is: " + subtract(1, 4));

        System.out.println(isEven(5));

        System.out.println();

        int winner = randomInt(5, 20);
        System.out.println(winner);

        double avg = Calculator.average(3, 5, 10, 13);
        System.out.println("Average " + avg);

    }
}