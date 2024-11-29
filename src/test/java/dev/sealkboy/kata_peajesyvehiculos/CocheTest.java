package dev.sealkboy.kata_peajesyvehiculos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CocheTest {

    @Test
    void testCalcularPeaje() {
        Vehiculo coche = new Coche("ABC-123");
        assertEquals(100, coche.calcularPeaje(), "Debe pagar 100");
    }
}

