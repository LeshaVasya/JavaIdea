package ru.lv.Equation;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InteractRunner {

    public static void main(String[] args) {
        System.out.println("The app solves quadratic equation like: a*x^2 + b*x  + c = 0");
        Double a = getValueFromConsole("x^2 coef = a");
        Double b = getValueFromConsole("x coef = b");
        Double c = getValueFromConsole("coef = c");
        Calculator equation = new Calculator(a,b,c);
        equation.calculate();
    }

    private static double getValueFromConsole(String input) {
        Scanner reader = new Scanner(System.in);
        Double value = null;
        do {
            System.out.println(String.format("Please enter the '%s' value:", input));
            try {
                value = reader.nextDouble();
            }
            catch (InputMismatchException ime) {
                System.out.println(String.format("​Incorrect '%s' value. Possibly not double. Please try again:", input));
                System.out.print(ime.getMessage());
                reader.next();
            }
            catch (NumberFormatException nfe) {
                System.out.println(String.format("​Incorrect '%s' value. Possibly comma delimiter usage instead of dot one1. Please try again:", input));
                System.out.print(nfe.getMessage());
                reader.next();
            }
          //  finally {
         //       reader.close();
         //   }
        }
        while (value == null);
        return value;
    }
}
