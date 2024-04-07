package app.src.main.java.org.example;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan angka pertama: ");
        String input1 = scanner.next();
        if (!isNumeric(input1)) {
            System.out.println("Error: Input harus berupa angka");
            scanner.close();
            return;
        }
        double angka1 = Double.parseDouble(input1);
        if (!isInRange((int)angka1)) {
            System.out.println("Error: Angka harus berada dalam range -32,768 hingga 32,767");
            scanner.close();
            return;
        }
        
        System.out.print("Masukkan angka kedua: ");
        String input2 = scanner.next();
        if (!isNumeric(input2)) {
            System.out.println("Error: Input harus berupa angka");
            scanner.close();
            return;
        }
        double angka2 = Double.parseDouble(input2);
        if (!isInRange((int)angka2)) {
            System.out.println("Error: Angka harus berada dalam range -32,768 hingga 32,767");
            scanner.close();
            return;
        }
        
        System.out.println("Pilih operator:");
        System.out.println("1. Tambah (+)");
        System.out.println("2. Kurang (-)");
        System.out.println("3. Kali (*)");
        System.out.println("4. Bagi (/)");
        System.out.println("Masukkan pilihan: (1/2/3/4)");
        
        char operator = scanner.next().charAt(0);
        if (!isValidOperator(operator)) {
            System.out.println("Error: Operator tidak valid");
            scanner.close();
            return;
        }
        
        if (operator == '/' && !isValidDivision(angka2)) {
            System.out.println("Error: Tidak dapat melakukan pembagian dengan nol");
            scanner.close();
            return;
        }
        
        double hasil = 0;
        switch(operator) {
            case '1':
                hasil = tambah(angka1, angka2);
                break;
            case '2':
                hasil = kurang(angka1, angka2);
                break;
            case '3':
                hasil = kali(angka1, angka2);
                break;
            case '4':
                hasil = bagi(angka1, angka2);
                break;
        }
        
        System.out.println("Hasil: " + hasil);
        
        scanner.close();
    }
    public static double tambah(double angka1, double angka2) {
        return angka1 + angka2;
    }
    
    public static double kurang(double angka1, double angka2) {
        return angka1 - angka2;
    }
    
    public static double kali(double angka1, double angka2) {
        return angka1 * angka2;
    }
    
    public static double bagi(double angka1, double angka2) {
        return angka1 / angka2;
    }

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
}
