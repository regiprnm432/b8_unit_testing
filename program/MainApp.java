import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan angka pertama: ");
        String input1 = scanner.next();
        if (!Validator.isNumeric(input1)) {
            System.out.println("Error: Input harus berupa angka");
            return;
        }
        double angka1 = Double.parseDouble(input1);
        if (!Validator.isInRange((int) angka1)) {
            System.out.println("Error: Angka harus berada dalam range -32,768 hingga 32,767");
            return;
        }

        System.out.print("Masukkan angka kedua: ");
        String input2 = scanner.next();
        if (!Validator.isNumeric(input2)) {
            System.out.println("Error: Input harus berupa angka");
            return;
        }
        double angka2 = Double.parseDouble(input2);
        if (!Validator.isInRange((int) angka2)) {
            System.out.println("Error: Angka harus berada dalam range -32,768 hingga 32,767");
            return;
        }

        System.out.println("Pilih operator:");
        System.out.println("1. Tambah (+)");
        System.out.println("2. Kurang (-)");
        System.out.println("3. Kali (*)");
        System.out.println("4. Bagi (/)");
        System.out.println("Masukkan pilihan: (1/2/3/4)");

        char operator = scanner.next().charAt(0);
        if (!Validator.isValidOperator(operator)) {
            System.out.println("Error: Operator tidak valid");
            return;
        }

        if (operator == '4' && !Validator.isValidDivision(angka2)) {
            System.out.println("Error: Tidak dapat melakukan pembagian dengan nol");
            return;
        }

        double hasil = 0;
        switch (operator) {
            case '1':
                hasil = Operator.tambah(angka1, angka2);
                break;
            case '2':
                hasil = Operator.kurang(angka1, angka2);
                break;
            case '3':
                hasil = Operator.kali(angka1, angka2);
                break;
            case '4':
                hasil = Operator.bagi(angka1, angka2);
                break;
        }

        System.out.println("Hasil: " + hasil);

        scanner.close();
    }
}
