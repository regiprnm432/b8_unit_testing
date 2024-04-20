package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class OperatorTest {

    @Test
    public void testTambah() {
        double result = Operator.tambah(10, 5);
        assertEquals(15, result);
    }

    @Test
    public void testKurang() {
        double result = Operator.kurang(10, 5);
        assertEquals(5, result);
    }

    @Test
    public void testKali() {
        double result = Operator.kali(10, 5);
        assertEquals(50, result);
    }

    @Test
    public void testBagi() {
        double result = Operator.bagi(10, 5);
        assertEquals(2, result);
    }

    @Test
    public void testBagiDenganNol() {
        assertThrows(ArithmeticException.class, () -> {
            Operator.bagi(10, 0);
        });
    }
}
