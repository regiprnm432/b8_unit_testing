package org.example;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class MainAppTest {

    @Test
    public void testMainApp_InputValid() {
        String simulatedInput = "10\n5\n1\n"; // Simulasi input: 10 (angka pertama), 5 (angka kedua), 1 (operator tambah)
        InputStream savedStandardInputStream = System.in;
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        try {
            MainApp.main(new String[0]);
        } catch (Exception e) {
            fail("Exception should not be thrown");
        } finally {
            System.setIn(savedStandardInputStream);
        }
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
