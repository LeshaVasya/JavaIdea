package ru.lv.Calculator;
/**
    Class to run Calculator. Customer import support implementation.
*/
import java.util.Scanner;

public class InteractRunner{
    public static void main(String[] args){
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
}