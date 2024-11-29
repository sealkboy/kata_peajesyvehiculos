package dev.sealkboy.kata_peajesyvehiculos;

public class Camion extends Vehiculo {
    private int numEjes;

    public Camion(String placa, int numEjes) {
        super(placa);
        this.numEjes = numEjes;
    }

    @Override
    public double calcularPeaje() {
        return numEjes * 50; 
    }
}
