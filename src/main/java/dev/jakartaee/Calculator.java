package dev.jakartaee;


public class Calculator {

    public static int add (int firstNumber, int secondNumber) {
        if (firstNumber/2.0 + secondNumber/2.0 > Integer.MAX_VALUE/2.0) {
            throw new RuntimeException("Out of range");
        }
         if (firstNumber/2.0 + secondNumber/2.0 < Integer.MIN_VALUE/2.0) {
             throw new RuntimeException("Out of range");
         }
        return firstNumber + secondNumber;
    }
}
