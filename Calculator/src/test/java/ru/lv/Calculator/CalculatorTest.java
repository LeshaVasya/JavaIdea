package ru.lv.Calculator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Vasyamfx on 04.02.2016.
 */
public class CalculatorTest {

    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void testCalculator() throws Exception {

    }

    @Test
    public void testAdd() throws Exception {
        Calculator testCalc = new Calculator();
        testCalc.add(1,2);
        assertEquals(3.0, testCalc.getResult(), 0.0001);
    }

    @Test
    public void testGetResult() throws Exception {

    }

    @Test
    public void testCleanResult() throws Exception {

    }

    @Test(expected = UserException.class)
    public void testDivMoreParams() throws UserException {
        Calculator testCalc = new Calculator();
        testCalc.div(4,2,1);
    }

    @Test(expected = UserException.class)
    public void testLeastParams() throws UserException {
        Calculator testCalc = new Calculator();
        testCalc.div(4);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDivByZero() throws Exception {
        Calculator testCalc = new Calculator();
        testCalc.div(4,0);
    }

    @Test
    public void testDiv() throws UserException {
        Calculator testCalc = new Calculator();
        testCalc.div(4,2);
        assertEquals(2.0,testCalc.getResult(), 0.00001);
    }
}