/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txtt o change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package pryzoologico;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AveTest {

    @Test
    void testCrearAveConEdadInvalida() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new Ave(1.5, "Aguila", 0);
        });
        assertEquals("La edad debe ser mayor a 0.", exception.getMessage());
    }

    @Test
    void testVolar() {
        Ave ave = new Ave(2.0, "Halcon", 3);
        assertDoesNotThrow(() -> ave.volar());
    }
}

