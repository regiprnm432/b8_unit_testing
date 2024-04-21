package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ComputationTest {

    @Test
    public void testTambah() {
        double result = Computation.compute(10, 5, '1');
        assertEquals(15, result);
        System.out.println("Test case: testTambah passed");
    }

    @Test
    public void testKurang() {
        double result = Computation.compute(10, 5, '2');
        assertEquals(5, result);
        System.out.println("Test case: testKurang passed");
    }

    @Test
    public void testKali() {
        double result = Computation.compute(10, 5, '3');
        assertEquals(50, result);
        System.out.println("Test case: testKali passed");
    }

    @Test
    public void testBagi() {
        double result = Computation.compute(10, 5, '4');
        assertEquals(2, result);
        System.out.println("Test case: testBagi passed");
    }

    @Test
    public void testInvalidOperator() {
        assertThrows(IllegalArgumentException.class, () -> {
            Computation.compute(10, 5, '5');
        });
        System.out.println("Test case: testInvalidOperator passed");
    }
}
