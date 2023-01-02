package org.example.practice.practice1;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArraySumExpTest {
    @Test(expected = NullPointerException.class)
    public void sumStaticExpTest() throws Exception {
        ArraySum.sum(null);
    }

    @Test(expected = NullPointerException.class)
    public void sumNoStaticExp() throws Exception {
        ArraySum test = new ArraySum(null);
        System.out.println(test.sum());
    }


}