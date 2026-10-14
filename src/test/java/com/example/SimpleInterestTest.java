package com.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class SimpleInterestTest {
    @Test
    public void testCalculate() {
        double expected = 999.0;
        double actual = SimpleInterest.calculate(1000.0, 5.0, 2.0);
        assertEquals(expected, actual, 0.001, "The simple interest calculation is incorrect.");
    }
    @Test
    public void testCalculateWithZero() {
        double actual = SimpleInterest.calculate(0.0, 5.0, 2.0);
        assertEquals(0.0, actual, 0.001, "Simple interest with zero principal should be 0.");
    }
    @Test
    public void testNegativeValues() {
        assertThrows(IllegalArgumentException.class, () -> {
            SimpleInterest.calculate(-1000.0, 5.0, 2.0);
        }, "Should throw an exception for negative inputs.");
    }
}
