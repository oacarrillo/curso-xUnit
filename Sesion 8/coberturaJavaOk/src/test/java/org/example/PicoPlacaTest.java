package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PicoPlacaTest {
    PicoPlaca picoPlaca= new PicoPlaca();

    @Test
    public void testTienePicoPlacaLunesBogota(){
        boolean expected=picoPlaca.tienePicoPlaca("Bogota","Lunes","ABC123");
        assertEquals(true, expected);
    }

    @Test
    public void testNoTienePicoPlacaLunesBogota(){
        boolean expected=picoPlaca.tienePicoPlaca("Bogota","Lunes","ABC125");
        assertEquals(false, expected);
    }

    @Test
    public void testPlacaNula(){
        assertThrows(IllegalArgumentException.class, () -> picoPlaca.tienePicoPlaca("Bogota","Lunes",""));
    }
}
