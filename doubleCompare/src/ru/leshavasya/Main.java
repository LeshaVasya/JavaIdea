package ru.leshavasya;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        BigDecimal a =  (new BigDecimal(2.1)).divide(new BigDecimal(10));
        BigDecimal b = new BigDecimal(0.21);
        switch (a.compareTo(b)){
            case 1:
                System.out.print(String.format("%s > %s", a, b));
                break;
            case 0:
                System.out.print(String.format("%s = %s", a, b));
                break;
            case -1:
                System.out.print(String.format("%s < %s", a, b));
                break;
        }
    }
}
