package ar.edu.unahur.obj2.ejercicio8;

public class Administrativo extends Empleado {
    int horasMes;
    int horasExtra;

    public Administrativo(String nombre, String apellido, String email, int dni, int sueldoBase, int horasExtra, int horasMes) {
        super(nombre, apellido, email, dni, sueldoBase);
        this.horasExtra=horasExtra;
        this.horasMes=horasMes;
    }

    public double getSueldo() {
        return sueldoBase*((horasExtra*1.5) + horasMes)/horasMes;
    }
}
