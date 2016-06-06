package ru.lv.Equation;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InteractRunner {

    public static void main(String[] args) {
        Double a = getValueFromConsole("X2 Coef");
        Double b = getValueFromConsole("X Coef");
        Double c = getValueFromConsole("Coef");
        Calculator equation = new Calculator(a,b,c);
        equation.calculate();
    }

    public static double getValueFromConsole(String input) {
        Scanner reader = new Scanner(System.in);
        Double variable = null;
        do {
            System.out.println(String.format("Please enter the '%s' value:", input));
            try {
                variable = reader.nextDouble();
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
            finally{
                reader.close();
            }
        }
        while (variable == null);
        return variable;
    }
}
