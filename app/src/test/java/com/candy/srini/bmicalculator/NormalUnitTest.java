package com.candy.srini.bmicalculator;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * Created by Srini on 17-06-2017.
 */

public class NormalUnitTest {

    Convert c = new Convert();
    @Test
    public void normalUnitTest() {
        String[] arr = c.convert("56", "1.72");
        assertArrayEquals(c.convert("56","1.72"), arr);
    }

    @Test
    public void underweightUnitTest() {
        String[] arr = c.convert("50", "1.72");
        assertArrayEquals(c.convert("50","1.72"), arr);
    }

    @Test
    public void overweightUnitTest() {
        String[] arr = c.convert("50", "1");
        assertArrayEquals(c.convert("50","1"), arr);
    }

}
