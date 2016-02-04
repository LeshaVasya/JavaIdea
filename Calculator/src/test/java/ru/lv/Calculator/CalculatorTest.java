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
        assertEquals(testCalc.getResult(),3);
    }

    @Test
    public void testGetResult() throws Exception {

    }

    @Test
    public void testCleanResult() throws Exception {

    }
}