package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MainAppTest {

    private final InputStream originalSystemIn = System.in;
    private final PrintStream originalSystemOut = System.out;
    private ByteArrayOutputStream outputStream;

    @BeforeEach
    public void setUpStreams() {
        // Simpan InputStream asli
        System.setIn(originalSystemIn);
        outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
    }

    @AfterEach
    public void restoreSystemInAndOut() {
        // Restore original System.in dan System.out
        System.setIn(originalSystemIn);
        System.setOut(originalSystemOut);
    }

    @Test
    public void testValidAddition() {
        String input = "10\n5\n1\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        MainApp.main(new String[] {});
        // Tambahkan asert bahwa tidak ada pengecualian yang dilemparkan
    }

    @Test
    public void testValidSubtraction() {
        String input = "10\n5\n2\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        MainApp.main(new String[] {});
        // Tambahkan asert bahwa tidak ada pengecualian yang dilemparkan
    }

    @Test
    public void testValidMultiplication() {
        String input = "10\n5\n3\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        MainApp.main(new String[] {});
        // Tambahkan asert bahwa tidak ada pengecualian yang dilemparkan
    }

    @Test
    public void testValidDivision() {
        String input = "10\n5\n4\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        MainApp.main(new String[] {});
        // Tambahkan asert bahwa tidak ada pengecualian yang dilemparkan
    }

    @Test
    public void testInvalidFirstOperand() {
        // Input operand pertama non numerik
        String input = "test\n5\n1\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        // Memanggil main method
        MainApp.main(new String[] {});

        // Memeriksa apakah output mengandung pesan kesalahan yang diharapkan
        assertTrue(outputStream.toString().contains("Error: Input harus berupa angka"));
    }

    @Test
    public void testOperandOutOfRangeFirst() {
        // Input operand pertama diluar rentang
        String input = "32777\n5\n1\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        // Memanggil main method
        MainApp.main(new String[] {});

        // Memeriksa apakah output mengandung pesan kesalahan yang diharapkan
        assertTrue(outputStream.toString().contains("Error: Angka harus berada dalam range -32,768 hingga 32,767"));
    }

    @Test
    public void testNonNumericSecondOperand() {
        // Input operand kedua non numerik
        String input = "10\ntest\n1\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        // Memanggil main method
        MainApp.main(new String[] {});

        // Memeriksa apakah output mengandung pesan kesalahan yang diharapkan
        assertTrue(outputStream.toString().contains("Error: Input harus berupa angka"));
    }

    @Test
    public void testOperandOutOfRangeSecond() {
        // Input operand kedua diluar rentang
        String input = "10\n40000\n1\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        // Memanggil main method
        MainApp.main(new String[] {});

        // Memeriksa apakah output mengandung pesan kesalahan yang diharapkan
        assertTrue(outputStream.toString().contains("Error: Angka harus berada dalam range -32,768 hingga 32,767"));
    }

    @Test
    public void testInvalidOperatorSymbol() {
        // Input operator tidak valid
        String input = "10\n5\n9\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        // Memanggil main method
        MainApp.main(new String[] {});

        // Memeriksa apakah output mengandung pesan kesalahan yang diharapkan
        assertTrue(outputStream.toString().contains("Error: Operator tidak valid"));
    }

    @Test
    public void testDivisionByZero() {
        // Input operator pembagian dengan angka kedua nol
        String input = "10\n0\n4\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        // Memanggil main method
        MainApp.main(new String[] {});

        // Memeriksa apakah output mengandung pesan kesalahan yang diharapkan
        assertTrue(outputStream.toString().contains("Error: Tidak dapat melakukan pembagian dengan nol"));
    }
}
