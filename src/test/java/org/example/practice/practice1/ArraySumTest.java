package org.example.practice.practice1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArraySumTest {
    int[] massiv;

    @Before
    public void before() {
        massiv = new int[]{1,2,3,4};
    }

    @Test
    public void sumStatic() throws Exception {
        ArraySum testSum = new ArraySum(massiv);
        testSum.sum();
    }

    @Test
    public void sumNoStatic() throws Exception {
        ArraySum testSum = new ArraySum();
        testSum.sum(massiv);
    }
}