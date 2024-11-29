package dev.sealkboy.kata_peajesyvehiculos;

class Coche extends Vehiculo {
    public Coche(String placa) {
        super(placa);
    }

    @Override
    public double calcularPeaje() {
        return 100;
    }
}