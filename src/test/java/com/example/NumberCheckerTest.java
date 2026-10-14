package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class NumberCheckerTest {
    @Test
    public void testIsEven() {
        NumberChecker nc = new NumberChecker();
        assertTrue(nc.isEven(4));
        assertFalse(nc.isEven(5));
    }
}
