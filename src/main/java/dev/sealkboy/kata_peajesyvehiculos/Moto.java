package dev.sealkboy.kata_peajesyvehiculos;

public class Moto extends Vehiculo {

    public Moto(String placa) {
        super(placa);
    }

    @Override
    public double calcularPeaje() {
        return 50; 
    }
}