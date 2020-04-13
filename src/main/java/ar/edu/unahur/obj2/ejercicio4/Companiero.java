package ar.edu.unahur.obj2.ejercicio4;

public class Companiero {
    protected String nombre;
    protected String apellido;

    public Companiero (String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getNombre() { return nombre; }
    public String getApellido() { return apellido; }
}
