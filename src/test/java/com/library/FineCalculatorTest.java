
package com.library;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FineCalculatorTest {

    FineCalculator calculator = new FineCalculator();

    @Test
    public void testOnTimeReturn() {
        assertEquals(0, calculator.calculateFine(0));
    }

    @Test
    public void testOneDayLate() {
        assertEquals(2, calculator.calculateFine(1));
    }

    @Test
    public void testFiveDaysLate() {
        assertEquals(10, calculator.calculateFine(5));
    }

    @Test
    public void testTenDaysLate() {
        assertEquals(20, calculator.calculateFine(10));
    }

    @Test
    public void testFifteenDaysLate() {
        assertEquals(30, calculator.calculateFine(15));
    }

    @Test
    public void testNegativeDays() {
        assertThrows(IllegalArgumentException.class,
            () -> calculator.calculateFine(-1));
    }
}
