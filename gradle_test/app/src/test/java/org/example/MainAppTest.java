// MainAppTest.java

package org.example;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.After;

public class MainAppTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final InputStream originalIn = System.in;
    private final PrintStream originalOut = System.out;
    private final PrintStream originalErr = System.err;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
        System.setErr(originalErr);
        System.setIn(originalIn);
    }

    @Test
    public void testValidAddition() {
        String input = "1\n2\n1\n";
        provideInput(input);
        MainApp.main(new String[0]);
        assertEquals("Hasil: 3.0\n", outContent.toString());
    }

    @Test
    public void testInvalidOperand1() {
        String input = "a\n";
        provideInput(input);
        MainApp.main(new String[0]);
        assertEquals("Error: Input harus berupa angka\n", outContent.toString());
    }

    @Test
    public void testValidSubtraction() {
        String input = "1\n2\n2\n";
        provideInput(input);
        MainApp.main(new String[0]);
        assertEquals("Hasil: -1.0\n", outContent.toString());
    }

    @Test
    public void testInvalidOperand2() {
        String input = "1\nb\n1\n";
        provideInput(input);
        MainApp.main(new String[0]);
        assertEquals("Error: Input harus berupa angka\n", outContent.toString());
    }

    @Test
    public void testValidMultiplication() {
        String input = "1\n2\n3\n";
        provideInput(input);
        MainApp.main(new String[0]);
        assertEquals("Hasil: 2.0\n", outContent.toString());
    }

    @Test
    public void testInvalidOperand3() {
        String input = "a\nb\n3\n";
        provideInput(input);
        MainApp.main(new String[0]);
        assertEquals("Error: Input harus berupa angka\n", outContent.toString());
    }

    @Test
    public void testValidDivision() {
        String input = "1\n2\n4\n";
        provideInput(input);
        MainApp.main(new String[0]);
        assertEquals("Hasil: 0.5\n", outContent.toString());
    }

    @Test
    public void testInvalidOperand4() {
        String input = "a\nb\n4\n";
        provideInput(input);
        MainApp.main(new String[0]);
        assertEquals("Error: Input harus berupa angka\n", outContent.toString());
    }

    @Test
    public void testValidDivisionByZero() {
        String input = "1\n0\n4\n";
        provideInput(input);
        MainApp.main(new String[0]);
        assertEquals("Error: Tidak dapat melakukan pembagian dengan nol\n", outContent.toString());
    }

    @Test
    public void testInvalidOperator() {
        String input = "1\n2\n@\n";
        provideInput(input);
        MainApp.main(new String[0]);
        assertEquals("Error: Operator tidak valid\n", outContent.toString());
    }

    private void provideInput(String data) {
        ByteArrayInputStream testIn = new ByteArrayInputStream(data.getBytes());
        System.setIn(testIn);
    }

}
