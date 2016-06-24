package com.j2core.avasiliev.week2.equation;

import java.util.ArrayList;

/**
 * @author avasiliev
 * @since  2016-05-27.
 */

public final class Calculator {

    private Calculator() {
    }

    public static double calculateDiscriminant(final double a, final double b, final double c) {
        return  b * b - 4 * a * c;
    }

    private static double calculateProsEquationRoot(final double a, final double b, final double c) {
        double discriminant = calculateDiscriminant(a, b ,c);
        return (-b + Math.sqrt(discriminant)) / 2 * a;
    }

    private static double calculateConsEquationRoot(final double a, final double b, final double c) {
        double discriminant = calculateDiscriminant(a, b, c);
        return (-b - Math.sqrt(discriminant)) / 2 * a;
    }


    /**
     *
     * @return We return arraylist of roots
     * @param a x2 coef
     * @param b x coef
     * @param c coef
     * @param  epsilon Accuracy
     */
    public static final ArrayList calculateResult(final double a, final double b, final double c, final  double epsilon) {
        double discriminant = calculateDiscriminant(a, b, c);
        ArrayList result = new ArrayList();
        if ((a > -epsilon) && (a < epsilon)) {
            if ((b < -epsilon) || (b > epsilon)) {
                result.add(-c / b);
            }
            return result;
        }
        if (discriminant > epsilon) {
            result.add(calculateConsEquationRoot(a, b, c));
            result.add(calculateProsEquationRoot(a, b, c));
        } else if ((discriminant > -epsilon) && (discriminant < epsilon)) {
            double root = -b / 2 * a;
            result.add(root);
        }
        return result;
    }
}
