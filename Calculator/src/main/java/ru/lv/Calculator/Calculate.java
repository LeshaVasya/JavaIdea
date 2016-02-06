package ru.lv.Calculator;

public class Calculate {

    public static void main(String[] args) {
        System.out.println("Calculate...");
		int first = Integer.valueOf(args[0]);
		int second = Integer.valueOf(args[1]);
		double third = Double.valueOf(args[2]);
		int summ = first+second;
		int multiply = first*second; 
		double relate = first/third;
		double power = Math.pow(first,second);
		System.out.println("Sum = "+summ);
		System.out.println("Multiply = "+multiply);
		System.out.println("Relation = "+relate);
		System.out.println("Power = "+power);
    }
}