package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class OperatorTest {

    @Test
    public void testTambah() {
        double result = Operator.tambah(10, 5);
        assertEquals(15, result);
        System.out.println("Test case: testTambah passed");
    }

    @Test
    public void testKurang() {
        double result = Operator.kurang(10, 5);
        assertEquals(5, result);
        System.out.println("Test case: testKurang passed");
    }

    @Test
    public void testKali() {
        double result = Operator.kali(10, 5);
        assertEquals(50, result);
        System.out.println("Test case: testKali passed");
    }

    @Test
    public void testBagi() {
        double result = Operator.bagi(10, 5);
        assertEquals(2, result);
        System.out.println("Test case: testBagi passed");
    }

    @Test
    public void testBagiDenganNol() {
        assertThrows(ArithmeticException.class, () -> {
            Operator.bagi(10, 0);
        });
        System.out.println("Test case: testBagiDenganNol passed");
    }
}
