package dev.sealkboy.kata_peajesyvehiculos;

public class EstacionPeaje {
    private String nombre;
    private String ciudad;
    private double totalPeaje;

    public EstacionPeaje(String nombre, String ciudad) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.totalPeaje = 0;
    }

    public void agregarVehiculo(Vehiculo vehiculo) {
        double peaje = vehiculo.calcularPeaje();
        totalPeaje += peaje;
        System.out.println("Vehículo con placa " + vehiculo.placa + " ha pagado: $" + peaje);
    }

    public void mostrarReporte() {
        System.out.println("Estación de Peaje: " + nombre + " - Ciudad: " + ciudad);
        System.out.println("Total de peajes recolectados: $" + totalPeaje);
    }
}
