package com.j2core.avasiliev.week2.equation;

/**
 * @author avasiliev
 * @since  2016-05-27.
 */


import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Class to run application.
 */
public class InteractRunner {

    /**
     *
     * @param args No arguments waiting
     */
    public static void main(final String[] args) {
        System.out.println("The app solves quadratic Equation like: a*x^2 + b*x  + c = 0 with accurancy to " + Calculator.EPSILON);
        Scanner reader = new Scanner(System.in);
        double a = readValueFromConsole("x^2 coef = a", reader);
        double b = readValueFromConsole("x coef = b", reader);
        double c = readValueFromConsole("coef = c", reader);
        reader.close();
        Calculator quadraticEquation = new Calculator(a, b, c);
        ArrayList result = quadraticEquation.calculateResult();
        double discriminant = quadraticEquation.getDiscriminant();
        printResult(result, discriminant, a, b, c);
    }

    /**
     *
     * @param input symbols from console till enter pushed
     * @param reader System.in Scanner to let him be closed after all method calls
     * @return parsed double number
     */
    private static double readValueFromConsole(final String input, final Scanner reader) {
        //Double used instead of double used here because of null
        Double value = null;
        do {
            System.out.println(String.format("Please enter the '%s' value:", input));
            try {
                value = reader.nextDouble();
            } catch (InputMismatchException ime) {
                System.out.println(String.format("​Incorrect '%s' value. Possibly not double. Please try again:", input));
                System.out.print(ime.getMessage());
                reader.next();
            } catch (NumberFormatException nfe) {
                System.out.println(String.format("​Incorrect '%s' value. Possibly comma delimiter usage instead of dot one1. Please try again:", input));
                System.out.print(nfe.getMessage());
                reader.next();
            }
        }
        while (value == null);
        return value;
    }

    /**
     * @param result Result to print
     * @param discriminant to print
     * @param a - x2 coef to print
     * @param b - x1 coef to print
     * @param c - x0 coef to print
     */
    private static void printResult(ArrayList result, final double discriminant, final double a, final double b, final double c) {
        switch (result.size()) {
            case 0:
                System.out.printf("The equation couldn't be solved because discriminant=%.6f is less than zero or a = b = 0\n", discriminant );
                System.out.println("a = " + a);
                System.out.println("b = " + b);
                System.out.println("c = " + c);
                break;
            case 1:
                System.out.println("The equation has only one root");
                break;
            case 2:
                System.out.println("The equation has two roots");
                break;
        }
        for (int i = 0; i < result.size(); i++) {
            System.out.printf("root%d = %.6f\n", i + 1, result.get(i));
        }
    }
}
