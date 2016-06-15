package ru.leshavasya;

public class Main {

    public static void main(String[] args) {
        Double a = 2.1/10;
        Double b = 0.21;
        switch (Double.compare(a,b)){
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
	// write your code here
    }
}
