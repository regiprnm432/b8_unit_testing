package org.example;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Masukkan angka pertama: ");
            String input1 = scanner.next();
            Validator.validateInput(input1); // Validasi input pertama
            double angka1 = Double.parseDouble(input1);

            System.out.print("Masukkan angka kedua: ");
            String input2 = scanner.next();
            Validator.validateInput(input2); // Validasi input kedua
            double angka2 = Double.parseDouble(input2);

            System.out.println("Pilih operator:");
            System.out.println("1. Tambah (+)");
            System.out.println("2. Kurang (-)");
            System.out.println("3. Kali (*)");
            System.out.println("4. Bagi (/)");
            System.out.println("Masukkan pilihan: (1/2/3/4)");

            char operator = scanner.next().charAt(0);
            Validator.validateOperator(operator, angka2); // Validasi operator

            double hasil = Computation.compute(angka1, angka2, operator);
            System.out.println("Hasil: " + hasil);
        } finally {
            scanner.close();
        }
    }
}
