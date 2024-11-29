package dev.sealkboy.kata_peajesyvehiculos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class EstacionPeajeTest {

    @Test
    void testEstacionPeaje() {
        EstacionPeaje estacion = new EstacionPeaje("Peaje", "Córdoba");
        
        Vehiculo coche = new Coche("ABC123");
        Vehiculo moto = new Moto("XYZ456");
        Vehiculo camion = new Camion("LMN789", 4);

        estacion.agregarVehiculo(coche);
        estacion.agregarVehiculo(moto);
        estacion.agregarVehiculo(camion);

        double totalPeaje = estacion.getTotalPeaje();

        assertEquals(350, totalPeaje, "Debe pagar 350");
    }
}
