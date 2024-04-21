package org.example;

public class Computation {
    public static double compute(double angka1, double angka2, char operator) {
        double result = 0;
        switch (operator) {
            case '1':
                result = Operator.tambah(angka1, angka2);
                break;
            case '2':
                result = Operator.kurang(angka1, angka2);
                break;
            case '3':
                result = Operator.kali(angka1, angka2);
                break;
            case '4':
                result = Operator.bagi(angka1, angka2);
                break;
            default:
                throw new IllegalArgumentException("Operator tidak valid: " + operator);
        }
        return result;
    }
}

