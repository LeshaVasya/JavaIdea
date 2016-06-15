package com.j2core.avasiliev.week2.equation;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author avasiliev
 * @since  2016-06-14.
 */
public class CalculatorTest {

    private static final double TESTEPSILON = 0.000001D;

    @Test
    public final void testTestsEpsilon1() {
        Calculator testCalc = new Calculator(0, 0, 0);
        assertEquals(TESTEPSILON, testCalc.getEpsilon(), testCalc.getEpsilon());
    }

    @Test
    public final void testTestsEpsilon2() {
        Calculator testCalc = new Calculator(0, 0, 0);
        assertEquals(TESTEPSILON, testCalc.getEpsilon(), TESTEPSILON);
    }

    @Test
    public final void testZeroDiscriminant() throws Exception {
        Calculator testCalc = new Calculator(0, 0, 0);
        assertEquals(0.0, testCalc.getDiscriminant(), testCalc.getEpsilon());
    }

    @Test
    public final void testEpsilon() {
        Calculator testCalc = new Calculator(0, 0, 0);
        assertEquals(0.0, testCalc.getEpsilon(), testCalc.getEpsilon());
    }

    @Test
    public final void testOneRoot() {
        Calculator testCalc = new Calculator(1, -2, 1);
        assertEquals(0.0, testCalc.getDiscriminant(), testCalc.getEpsilon());
        assertEquals(1, testCalc.calculate());
    }

    @Test
    public final void testCloseToZeroDiscriminant() {
        Calculator testCalc = new Calculator(1 + TESTEPSILON / 10, -2 - TESTEPSILON / 10, 1 + TESTEPSILON / 10);
        assertEquals(0.0, testCalc.getDiscriminant(), testCalc.getEpsilon());
        assertEquals(1, testCalc.calculate());
    }

    @Test
    public final void testCloseToZeroPositiveDiscriminant() {
        Calculator testCalc = new Calculator(1 + TESTEPSILON / 10, -2-TESTEPSILON,1 + TESTEPSILON / 10);
        assertEquals(2, testCalc.calculate());
    }

    @Test
    public final void testCloseToZeroNegativeDiscriminant() {
        Calculator testCalc = new Calculator(1 + TESTEPSILON, -2 - TESTEPSILON / 10, 1 + TESTEPSILON);
        assertEquals(0, testCalc.calculate());
    }

    @Test
    public final void testNoRoots() {
        Calculator testCalc = new Calculator(1 ,1 ,4);
        assertEquals(0, testCalc.calculate());
    }

    @Test
    public final void testBigNegativeDiscriminant() {
        Calculator testCalc = new Calculator(1 ,1, 1000000);
        assertEquals(0, testCalc.calculate());
    }

    @Test
    public final void testBigPositiveDiscriminant() {
        Calculator testCalc = new Calculator(1, 1000000, 1);
        assertEquals(2, testCalc.calculate());
    }

    @Test
    public final void testTwoRoots() {
        Calculator testCalc = new Calculator(1, 16, 4);
        assertEquals(2, testCalc.calculate());
    }
}
