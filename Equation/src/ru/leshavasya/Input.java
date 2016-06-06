package ru.leshavasya;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author avasiliev
 *         Created: 2016-05-27.
 */
public class Input {
    private static double getValueFromConsole(String input) {
        Scanner reader = new Scanner(System.in);
        Double variable = null;
        do {
            System.out.println(String.format("Please enter the '%s' double  value:", input));
            try {
                variable = reader.nextDouble();
            }
            catch (InputMismatchException ime) {
                System.out.println(String.format("​Incorrect '%s' value. Possibly not double. Please try again:", input));
                System.out.print(ime.getMessage());
                reader.next();
            }
            catch (NumberFormatException nfe) {
                System.out.println(String.format("​Incorrect '%s' value. Possibly using comma instead of dot. Please try again:", input));
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
