package ar.edu.unahur.obj2.ejercicio8;

public class Vendedor extends Empleado {
    double porcenComision;
    int totalVentas;

    public Vendedor(String nombre, String apellido, String email, int dni, int sueldoBase, double porcenComision, int totalVentas) {
        super(nombre, apellido, email, dni, sueldoBase);
        this.porcenComision=porcenComision;
        this.totalVentas=totalVentas;
    }

    public double getSueldo() {
        return sueldoBase + ((porcenComision*totalVentas)/100);
    }
}
