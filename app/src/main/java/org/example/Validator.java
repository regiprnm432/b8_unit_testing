package org.example;

public class Validator {
    public static boolean isNumeric(String str) {
        try {
            double d = Double.parseDouble(str);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }

    public static boolean isInRange(int num) {
        return num >= -32768 && num <= 32767;
    }

    public static boolean isValidOperator(char operator) {
        return operator == '1' || operator == '2' || operator == '3' || operator == '4';
    }

    public static boolean isValidDivision(double angka2) {
        return angka2 != 0;
    }

    public static void validateInput(String input) {
        if (!isNumeric(input)) {
            throw new IllegalArgumentException("Error: Input harus berupa angka");
        }
        double angka = Double.parseDouble(input);
        if (!isInRange((int) angka)) {
            throw new IllegalArgumentException("Error: Angka harus berada dalam range -32,768 hingga 32,767");
        }
    }

    public static void validateOperator(char operator, double angka2) {
        if (!isValidOperator(operator)) {
            throw new IllegalArgumentException("Error: Operator tidak valid");
        }
        if (operator == '4' && !isValidDivision(angka2)) {
            throw new IllegalArgumentException("Error: Tidak dapat melakukan pembagian dengan nol");
        }
    }

}
