package com.j2core.avasiliev.week2.equation;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author avasiliev
 * @since  2016-06-14.
 */
public class CalculatorTest {
    
    private static final double EPSILON = InteractRunner.EPSILON;

    @Test
    public final void testZeroDiscriminant() throws Exception {
        assertEquals(0.0, Calculator.calculateDiscriminant(0, 0, 0), EPSILON);
    }

    @Test
    public final void testEpsilonIsCloseToZero() {
        assertEquals(0.0, EPSILON, EPSILON);
    }

    @Test
    public final void testOneRoot() {
        assertEquals(0.0, Calculator.calculateDiscriminant(1, -2, 1), EPSILON);
        assertEquals(1, (Calculator.calculateResult(1, -2, 1, EPSILON)).size());
    }

    @Test
    public final void testCloseToZeroDiscriminant() {
        assertEquals(0.0, Calculator.calculateDiscriminant(1 + EPSILON / 10, -2 - EPSILON / 10, 1 + EPSILON / 10), EPSILON);
        assertEquals(1, (Calculator.calculateResult(1 + EPSILON / 10, -2 - EPSILON / 10, 1 + EPSILON / 10, EPSILON)).size());
    }

    @Test
    public final void testCloseToZeroPositiveDiscriminant() {
        assertEquals(2, (Calculator.calculateResult(1 + EPSILON / 10, -2 - EPSILON, 1 + EPSILON / 10, EPSILON)).size());
    }

    @Test
    public final void testCloseToZeroNegativeDiscriminant() {
        assertEquals(0, (Calculator.calculateResult(1 + EPSILON, -2 - EPSILON / 10, 1 + EPSILON, EPSILON)).size());
    }

    @Test
    public final void testNoRoots() {
        assertEquals(0, (Calculator.calculateResult(1, 1, 4, EPSILON)).size());
    }

    @Test
    public final void testBigNegativeDiscriminant() {
        assertEquals(0, (Calculator.calculateResult(1, 1, 1000000, EPSILON)).size());
    }

    @Test
    public final void testBigPositiveDiscriminant() {
        assertEquals(2, (Calculator.calculateResult(1, 1000000, 1, EPSILON)).size());
    }

    @Test
    public final void testTwoRoots() {
        assertEquals(2, (Calculator.calculateResult(1, 16, 4, EPSILON)).size());
    }

    @Test
    public final void testZeroA() {
        assertEquals(1, (Calculator.calculateResult(0, 1, -1, EPSILON)).size());
    }

    @Test
    public final void testOneZeroRoot() {
        assertEquals(1, (Calculator.calculateResult(0, 1, 0, EPSILON)).size());
    }

    @Test
    public final void testZeroAB() {
        assertEquals(0, (Calculator.calculateResult(0, 0, 1, EPSILON)).size());
    }

    @Test
    public final void testZeroABC() {
        assertEquals(0, (Calculator.calculateResult(0, 0, 0, EPSILON)).size());
    }

    @Test
    public final void testZeroBC() {
        assertEquals(1, (Calculator.calculateResult(1, 0, 0, EPSILON)).size());
    }

    @Test
    public final void testZeroAC() {
        assertEquals(1, (Calculator.calculateResult(0, 1, 0, EPSILON)).size());
    }

    @Test
    public final void testEpsilonCoefs() {
        assertEquals(1, (Calculator.calculateResult(EPSILON, EPSILON, -EPSILON, EPSILON)).size());
    }
}
