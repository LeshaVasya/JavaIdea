package com.j2core.avasiliev.week2.equation;

/**
 * @author avasiliev
 * @since  2016-05-27.
 */


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
        System.out.println("The app solves quadratic equation like: a*x^2 + b*x  + c = 0");
        Scanner reader = new Scanner(System.in);
        double a = getValueFromConsole("x^2 coef = a", reader);
        double b = getValueFromConsole("x coef = b", reader);
        double c = getValueFromConsole("coef = c", reader);
        reader.close();
        Calculator equation = new Calculator(a, b, c);
        equation.calculate();
    }

    /**
     *
     * @param input symbols from console till enter pushed
     * @param reader System.in Scanner to let him be closed after all method calls
     * @return parsed double number
     */
    private static double getValueFromConsole(final String input, final Scanner reader) {
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
}
