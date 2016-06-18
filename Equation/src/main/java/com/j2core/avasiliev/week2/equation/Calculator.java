package com.j2core.avasiliev.week2.equation;

import java.util.ArrayList;

/**
 * @author avasiliev
 * @since  2016-05-27.
 */

public class Calculator {
    private final double a;
    private final double b;
    private final double c;
    public  static final double EPSILON = 0.000001D;
    private final double discriminant;

    public Calculator(final double a, final double b, final double c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.discriminant = calculateDiscriminant();
    }

    public final double getDiscriminant() {
        return discriminant;
    }

    private double calculateDiscriminant() {
        return  b * b - 4 * a * c;
    }

    private double calculateProsEquationRoot() {
        return (-b + Math.sqrt(discriminant)) / 2 * a;
    }

    private double calculateConsEquationRoot() {
        return (-b - Math.sqrt(discriminant)) / 2 * a;
    }


    /**
     *
     * @return We return arraylist of roots
     */
    public final ArrayList calculateResult() {
        ArrayList result = new ArrayList();
        if (discriminant > EPSILON) {
            result.add(calculateConsEquationRoot());
            result.add(calculateProsEquationRoot());
        } else if ((discriminant > -EPSILON) && (discriminant < EPSILON)) {
            double root = -b / 2 * a;
            result.add(root);
        }
        return result;
    }
}
