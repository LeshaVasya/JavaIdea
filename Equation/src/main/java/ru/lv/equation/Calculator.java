package ru.lv.equation;

/**
 * @author avasiliev
 * @since  2016-05-27.
 */

public class Calculator {
    private final double a;
    private final double b;
    private final double c;
    private final double EPSILON = 0.000001D;
    private final double discriminant;

    public Calculator(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.discriminant = getDiscriminant();
    }

    public double getEpsilon() {return this.EPSILON; }

    public double getDiscriminant (){
        return  b*b - 4*a*c;
    }

    private double getProsEquationRoot(){
        return (-b + Math.sqrt(discriminant))/2*a;
    }

    private double getConsEquationRoot() {
        return (-b - Math.sqrt(discriminant))/2*a;
    }


    /**
     *
     * @return We return integer value to cover this method by unit tests
     */
    public int calculate(){
        if (discriminant > EPSILON) {
            System.out.println("Discriminant is greater than zero: " + discriminant);
            System.out.println("The equation has two roots:");
            System.out.println("root1 = " + getProsEquationRoot());
            System.out.println("root2 = " + getConsEquationRoot());
            return  2;
        }
        else if(discriminant < -EPSILON) {
            System.out.println("The equation couldn't be solved because discriminant is less than zero: " + discriminant);
            System.out.println("a = " + a);
            System.out.println("b = " + b);
            System.out.println("c = " + c);
            return 0;
        }
        else {
            double root = -b / 2 * a;
            System.out.println("Discriminant is close to zero: " + discriminant);
            System.out.println("The equation has only one root = " + root);
            return 1;
        }
    }
}
