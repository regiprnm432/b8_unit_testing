import java.util.Scanner;

public class Kalkulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan angka pertama: ");
        double angka1 = scanner.nextDouble();
        
        System.out.print("Masukkan angka kedua: ");
        double angka2 = scanner.nextDouble();
        
        System.out.println("Pilih operator:");
        System.out.println("1. Tambah (+)");
        System.out.println("2. Kurang (-)");
        System.out.println("3. Kali (*)");
        System.out.println("4. Bagi (/)");
        
        int pilihan = scanner.nextInt();
        
        double hasil = 0;
        switch(pilihan) {
            case 1:
                hasil = tambah(angka1, angka2);
                break;
            case 2:
                hasil = kurang(angka1, angka2);
                break;
            case 3:
                hasil = kali(angka1, angka2);
                break;
            case 4:
                hasil = bagi(angka1, angka2);
                break;
            default:
                System.out.println("Pilihan tidak valid");
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
        if(angka2 == 0) {
            System.out.println("Error: Tidak dapat melakukan pembagian dengan nol");
            return 0;
        }
        return angka1 / angka2;
    }
}
