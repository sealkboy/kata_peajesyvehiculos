package dev.sealkboy.kata_peajesyvehiculos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CamionTest {

    @Test
    void testCalcularPeaje() {
        Vehiculo camion = new Camion("LMN-456", 4);
        assertEquals(200, camion.calcularPeaje(), "Debe de pagar 200");
    }
}