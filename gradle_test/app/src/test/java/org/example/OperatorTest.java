package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Assertions;

public class OperatorTest {

    @Test
    public void testTambah() {
        double angka1 = 1;
        double angka2 = 2;
        double expected = 3;
        double result = Operator.tambah(angka1, angka2);
        Assertions.assertEquals(expected, result);
        System.out.println("Test case testTambah passed");
    }

    @Test
    public void testTambahBilanganNegatif() {
        double angka1 = -1;
        double angka2 = 2;
        double expected = 1;
        double result = Operator.tambah(angka1, angka2);
        Assertions.assertEquals(expected, result);
        System.out.println("Test case testTambahBilanganNegatif passed");
    }

    @Test
    public void testTambahBilanganPositifDanNegatif() {
        double angka1 = 1;
        double angka2 = -2;
        double expected = -1;
        double result = Operator.tambah(angka1, angka2);
        Assertions.assertEquals(expected, result);
        System.out.println("Test case testTambahBilanganPositifDanNegatif passed");
    }

    @Test
    public void testTambahDuaBilanganNegatif() {
        double angka1 = -1;
        double angka2 = -2;
        double expected = -3;
        double result = Operator.tambah(angka1, angka2);
        Assertions.assertEquals(expected, result);
        System.out.println("Test case testTambahDuaBilanganNegatif passed");
    }

    @Test
    public void testKurang() {
        double angka1 = 2;
        double angka2 = 1;
        double expected = 1;
        double result = Operator.kurang(angka1, angka2);
        Assertions.assertEquals(expected, result);
        System.out.println("Test case testKurang passed");
    }

    @Test
    public void testKurangBilanganLebihKecil() {
        double angka1 = 1;
        double angka2 = 2;
        double expected = -1;
        double result = Operator.kurang(angka1, angka2);
        Assertions.assertEquals(expected, result);
        System.out.println("Test case testKurangBilanganLebihKecil passed");
    }

    public void testKurangBilanganNegatif() {
        double angka1 = -2;
        double angka2 = 1;
        double expected = -1;
        double result = Operator.kurang(angka1, angka2);
        Assertions.assertEquals(expected, result);
        System.out.println("Test case testKurangBilanganNegatif passed");
    }

    @Test
    public void testKurangBilanganPositifDanNegatif() {
        double angka1 = 2;
        double angka2 = -1;
        double expected = 3;
        double result = Operator.kurang(angka1, angka2);
        Assertions.assertEquals(expected, result);
        System.out.println("Test case testKurangBilanganPositifDanNegatif passed");
    }

    @Test
    public void testKurangDuaBilanganNegatif() {
        double angka1 = -2;
        double angka2 = -1;
        double expected = -1;
        double result = Operator.kurang(angka1, angka2);
        Assertions.assertEquals(expected, result);
        System.out.println("Test case testKurangDuaBilanganNegatif passed");
    }

    @Test
    public void testKali() {
        double angka1 = 1;
        double angka2 = 2;
        double expected = 2;
        double result = Operator.kali(angka1, angka2);
        Assertions.assertEquals(expected, result);
        System.out.println("Test case testKali passed");
    }

    @Test
    public void testKaliBilanganNegatif() {
        double angka1 = -1;
        double angka2 = 2;
        double expected = -2;
        double result = Operator.kali(angka1, angka2);
        Assertions.assertEquals(expected, result);
        System.out.println("Test case testKaliBilanganNegatif passed");
    }

    @Test
    public void testKaliBilanganPositifDanNegatif() {
        double angka1 = 1;
        double angka2 = -2;
        double expected = -2;
        double result = Operator.kali(angka1, angka2);
        Assertions.assertEquals(expected, result);
        System.out.println("Test case testKaliBilanganPositifDanNegatif passed");
    }

    @Test
    public void testKaliDuaBilanganNegatif() {
        double angka1 = -1;
        double angka2 = -2;
        double expected = 2;
        double result = Operator.kali(angka1, angka2);
        Assertions.assertEquals(expected, result);
        System.out.println("Test case testKaliDuaBilanganNegatif passed");
    }

    @Test
    public void testBagi() {
        double angka1 = 2;
        double angka2 = 1;
        double expected = 2;
        double result = Operator.bagi(angka1, angka2);
        Assertions.assertEquals(expected, result);
        System.out.println("Test case testBagi passed");
    }

    @Test
    public void testBagiBilanganLebihKecil() {
        double angka1 = 1;
        double angka2 = 2;
        double expected = 0.5;
        double result = Operator.bagi(angka1, angka2);
        Assertions.assertEquals(expected, result);
        System.out.println("Test case testBagiBilanganLebihKecil passed");
    }

    @Test
    public void testBagiBilanganNegatif() {
        double angka1 = -2;
        double angka2 = 1;
        double expected = -2;
        double result = Operator.bagi(angka1, angka2);
        Assertions.assertEquals(expected, result);
        System.out.println("Test case testBagiBilanganNegatif passed");
    }

    @Test
    public void testBagiBilanganPositifDanNegatif() {
        double angka1 = 2;
        double angka2 = -1;
        double expected = -2;
        double result = Operator.bagi(angka1, angka2);
        Assertions.assertEquals(expected, result);
        System.out.println("Test case testBagiBilanganPositifDanNegatif passed");
    }

    @Test
    public void testBagiDuaBilanganNegatif() {
        double angka1 = -2;
        double angka2 = -1;
        double expected = 2;
        double result = Operator.bagi(angka1, angka2);
        Assertions.assertEquals(expected, result);
        System.out.println("Test case testBagiDuaBilanganNegatif passed");
    }
}
