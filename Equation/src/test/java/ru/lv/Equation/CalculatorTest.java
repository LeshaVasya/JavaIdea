package ru.lv.Equation;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author avasiliev
 *         Created: 2016-06-14.
 */
public class CalculatorTest {

    private final double TESTEPSILON = 0.000001D;

    @Test
    public void testTestsEpsilon1(){
        Calculator testCalc = new Calculator(0,0,0);
        assertEquals(TESTEPSILON, testCalc.getEpsilon(), testCalc.getEpsilon());
    }

    @Test
    public void testTestsEpsilon2(){
        Calculator testCalc = new Calculator(0,0,0);
        assertEquals(TESTEPSILON, testCalc.getEpsilon(), TESTEPSILON);
    }

    @Test
    public void testZeroDiscriminant() throws Exception {
        Calculator testCalc = new Calculator(0,0,0);
        assertEquals(0.0, testCalc.getDiscriminant(), testCalc.getEpsilon());
    }

    @Test
    public void testEpsilon(){
        Calculator testCalc = new Calculator(0,0,0);
        assertEquals(0.0, testCalc.getEpsilon(), testCalc.getEpsilon());
    }

    @Test
    public void testOneRoot(){
        Calculator testCalc = new Calculator(1,-2,1);
        assertEquals(0.0, testCalc.getDiscriminant(), testCalc.getEpsilon());
        assertEquals(1, testCalc.calculate());
    }

    @Test
    public void testCloseToZeroDiscriminant(){
        Calculator testCalc = new Calculator(1+TESTEPSILON/10,-2-TESTEPSILON/10,1+TESTEPSILON/10);
        assertEquals(0.0, testCalc.getDiscriminant(), testCalc.getEpsilon());
        assertEquals(1, testCalc.calculate());
    }

    @Test
    public void testCloseToZeroPositiveDiscriminant(){
        Calculator testCalc = new Calculator(1+TESTEPSILON/10,-2-TESTEPSILON,1+TESTEPSILON/10);
        assertEquals(2, testCalc.calculate());
    }

    @Test
    public void testCloseToZeroNegativeDiscriminant(){
        Calculator testCalc = new Calculator(1+TESTEPSILON,-2-TESTEPSILON/10,1+TESTEPSILON);
        assertEquals(0, testCalc.calculate());
    }

    @Test
    public void testNoRoots(){
        Calculator testCalc = new Calculator(1,1,4);
        assertEquals(0, testCalc.calculate());
    }

    @Test
    public void testBigNegativeDiscriminant(){
        Calculator testCalc = new Calculator(1,1,1000000);
        assertEquals(0, testCalc.calculate());
    }

    @Test
    public void testBigPositiveDiscriminant(){
        Calculator testCalc = new Calculator(1,1000000,1);
        assertEquals(2, testCalc.calculate());
    }


    @Test
    public void testTwoRoots(){
        Calculator testCalc = new Calculator(1,16,4);
        assertEquals(2, testCalc.calculate());
    }


}
