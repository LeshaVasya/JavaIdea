package ru.lv.Equation;

/**
 * @author avasiliev
 *         Created: 2016-05-27.
 */

public class Calculator {
    private final double a;
    private final double b;
    private final double c;
    private final double zero = 0.0;
    private final double discriminant;

    public Calculator(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.discriminant = getDiscriminant();
    }

    private Double getDiscriminant (){
        return  b*b - 4*a*c;
    }

    private Double getProsEquationRoot(){
        return (-b + Math.sqrt(discriminant))/2*a;
    }

    private Double getConsEquationRoot() {
        return (-b - Math.sqrt(discriminant))/2*a;
    }

    public void calculate(){
        switch (Double.compare(discriminant, zero)){
            case 1:
                System.out.println("The equation has two roots:");
                System.out.println("root1 = "+getProsEquationRoot());
                System.out.println("root2 = "+getConsEquationRoot());
                break;
            case 0:
                double root = -b/2*a;
                System.out.println("The equation has only one root = "+root);
                break;
            case -1:
                System.out.println("The equation couldn't be solved because discriminant is less than zero: "+discriminant);
                System.out.println("a = "+a);
                System.out.println("b = "+b);
                System.out.println("c = "+c);
                break;
        }
    }
}
