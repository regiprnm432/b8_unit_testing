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
            System.out.println("Error: Input harus berupa angka");
            System.exit(0);
        }
        double angka = Double.parseDouble(input);
        if (!isInRange((int) angka)) {
            System.out.println("Error: Angka harus berada dalam range -32,768 hingga 32,767");
            System.exit(0);
        }
    }

    public static void validateOperator(char operator, double angka2) {
        if (!isValidOperator(operator)) {
            System.out.println("Error: Operator tidak valid");
            System.exit(0);
        }
        if (operator == '4' && !isValidDivision(angka2)) {
            System.out.println("Error: Tidak dapat melakukan pembagian dengan nol");
            System.exit(0);
        }
    }

}
