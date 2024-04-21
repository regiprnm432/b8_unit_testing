package org.example;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Masukkan angka pertama: ");
            String input1 = scanner.next();
            if (!Validator.isNumeric(input1)) {
                throw new NumberFormatException("Input harus berupa angka");
            }
            double angka1 = Double.parseDouble(input1);

            if (!Validator.isInRange((int) angka1)) {
                throw new IllegalArgumentException("Angka harus berada dalam range -32,768 hingga 32,767");
            }

            System.out.print("Masukkan angka kedua: ");
            String input2 = scanner.next();
            if (!Validator.isNumeric(input2)) {
                throw new NumberFormatException("Input harus berupa angka");
            }
            double angka2 = Double.parseDouble(input2);

            if (!Validator.isInRange((int) angka2)) {
                throw new IllegalArgumentException("Angka harus berada dalam range -32,768 hingga 32,767");
            }

            System.out.println("Pilih operator:");
            System.out.println("1. Tambah (+)");
            System.out.println("2. Kurang (-)");
            System.out.println("3. Kali (*)");
            System.out.println("4. Bagi (/)");
            System.out.println("Masukkan pilihan: (1/2/3/4)");

            char operator = scanner.next().charAt(0);
            if (!Validator.isValidOperator(operator)) {
                throw new IllegalArgumentException("Operator tidak valid");
            }

            if (operator == '4' && angka2 == 0) {
                throw new IllegalArgumentException("Tidak dapat melakukan pembagian dengan nol");
            }

            double hasil = Computation.compute(angka1, angka2, operator);
            System.out.println("Hasil: " + hasil);
        } catch (NumberFormatException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
