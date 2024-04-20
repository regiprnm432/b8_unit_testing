package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ComputationTest {

    @Test
    public void testTambah() {
        double result = Computation.compute(10, 5, '1');
        assertEquals(15, result);
    }

    @Test
    public void testKurang() {
        double result = Computation.compute(10, 5, '2');
        assertEquals(5, result);
    }

    @Test
    public void testKali() {
        double result = Computation.compute(10, 5, '3');
        assertEquals(50, result);
    }

    @Test
    public void testBagi() {
        double result = Computation.compute(10, 5, '4');
        assertEquals(2, result);
    }

    @Test
    public void testInvalidOperator() {
        assertThrows(IllegalArgumentException.class, () -> {
            Computation.compute(10, 5, '5');
        });
    }
}
