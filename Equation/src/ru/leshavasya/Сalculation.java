package ru.leshavasya;

/**
 * @author avasiliev
 *         Created: 2016-05-27.
 */
public class Сalculation {
    private final double a;
    private final double b;
    private final double c;

    public Сalculation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

   private Double getDiscriminant (double a, double b, double c){
        return  b*b - 4*a*c;
    }

   private Boolean checkDiscriminant (double discriminant){
       return discriminant >= 0;
   }

    public void Calculate(){
        double discriminant = getDiscriminant(a,b,c);
        if(!checkDiscriminant(discriminant)){
            System.out.println("The equation couldn't be solved because discriminant is less than zero: "+discriminant);
            System.out.println("a = "+a);
            System.out.println("b = "+b);
            System.out.println("c = "+c);
        }
    }
}
