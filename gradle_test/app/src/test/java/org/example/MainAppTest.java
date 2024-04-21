// MainAppTest.java

package org.example;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayInputStream;
import java.io.InputStream;

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
    public void testMainApp_InputInvalid() {
        String simulatedInput = "abc\n5\n1\n"; // Simulasi input: abc (input pertama bukan angka)
        InputStream savedStandardInputStream = System.in;
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        assertThrows(IllegalArgumentException.class, () -> {
            MainApp.main(new String[0]);
        });

        System.setIn(savedStandardInputStream);
    }
}
