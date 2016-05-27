package ru.leshavasya;

/**
 * @author avasiliev
 *         Created: 2016-05-27.
 */
public class Сalculation {
    private final double a;
    private final double b;
    private final double c;
    private final double zero = 0.0;

    public Сalculation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

   private Double getDiscriminant (){
        return  b*b - 4*a*c;
   }

   private int checkDiscriminant (double discriminant){
       return  Double.compare(discriminant, zero);
   }

    public void calculate(){
        double discriminant = getDiscriminant();
        switch (checkDiscriminant(discriminant)){
            case 1:
                break;
            case 0:
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
