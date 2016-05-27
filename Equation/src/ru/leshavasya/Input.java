package ru.leshavasya;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author avasiliev
 *         Created: 2016-05-27.
 */
public class Input {
    private static double getValueFromConsole(String variable) {
        Scanner scanner = new Scanner(System.in);
        Double val = null;
        do {
            System.out.println(String.format("Please enter the '%s' value:", variable));
            try {
                  val = scanner.nextDouble();
                 } catch (InputMismatchException e) {
                    System.out.println(String.format("​Incorrect value. Please enter correct '%s' value:", variable));
                       scanner.next();
                     }
            catch (NumberFormatException nfe){

            }
               } while (val == null);
            return val;


    }

    Scanner reader = new Scanner(System.in);
    try{
        Calculator calc = new Calculator();
        String exit = "no";
        while (!exit.equals("yes")){
            System.out.println("Enter first arg: ");
            String first = reader.next();
            System.out.println("Enter second arg: ");
            String second = reader.next();
            calc.add(Integer.valueOf(first), Integer.valueOf(second));
            System.out.println("The addiction result is: "+calc.getResult());
            try {
                calc.div(Integer.valueOf(first), Integer.valueOf(second));
            } catch (UserException ue) {
                System.out.println(ue.getMessage());
                ue.printStackTrace();
            }
            System.out.println("The division result is: "+calc.getResult());
            calc.cleanResult();
            System.out.println("Exit? (yes/no)");
            exit = reader.next();
        }
    }
    //Where is catch?
    catch(NumberFormatException nfe){
        System.out.println("Args should be Integer numbers!");
        System.out.println(nfe.getMessage());
    }
    finally{
        reader.close();
    }
}
