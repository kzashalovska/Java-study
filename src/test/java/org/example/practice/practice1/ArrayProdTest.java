package org.example.practice.practice1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ArrayProdTest {
    public int[] massiv;
    @Before
    public void before(){
        massiv = new int[]{1,2,3,4};
    }

    @Test
    public void prod() throws Exception {
        int actual = ArrayProd.prod(massiv);
        int expected = 24;
        assertEquals(expected,actual);
    }
    @Test(expected = NullPointerException.class)
    public void prodExp() throws Exception {
        ArrayProd.prod(null);
    }
}