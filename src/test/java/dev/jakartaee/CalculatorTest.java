package dev.jakartaee;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void add13() {
        int result = Calculator.add(1, 3);
        assertEquals(4, result);
    }

    @Test
    void addMaxIntegerWith1() {
        assertThrows(RuntimeException.class, () -> Calculator.add(1, Integer.MAX_VALUE));
    }

    @Test
    void  addMinIntegerWithNegative() {
        assertThrows(RuntimeException.class, () -> Calculator.add(-1, Integer.MIN_VALUE));
    }
}