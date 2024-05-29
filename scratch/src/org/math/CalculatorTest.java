package org.math;

class CalculatorTest {
    public static void main(String[] args) {
        boolean isCorrect = true;

        // call Calculator.randomInt 1,000,000 times
        for (int i = 0; i < 100_000_000; i++) {
            int result = Calculator.randomInt(5, 20);
            if (result < 5 || result > 20) {
                isCorrect = false;
                break;
            }
        }

        if (isCorrect) {
            System.out.println("It works!");
        }
        else {
            System.out.println("Its broken");
        }
    }
}