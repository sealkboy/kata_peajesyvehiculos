package dev.sealkboy.kata_peajesyvehiculos;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MotoTest {

    @Test
    void testCalcularPeaje() {
        Vehiculo moto = new Moto("XYZ-789");
        assertEquals(50, moto.calcularPeaje(), "Debe pagar 50");
    }
}
