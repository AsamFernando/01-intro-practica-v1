package ar.edu.unahur.obj2.ejercicio8;

public abstract class Empleado {
    int dni, sueldoBase;
    String nombre, apellido, email;

    public Empleado(String nombre, String apellido, String email, int dni, int sueldoBase) {
        this.nombre=nombre;
        this.apellido=apellido;
        this.email=email;
        this.dni=dni;
        this.sueldoBase=sueldoBase;
    }

    public int getDni() { return dni; }
    public void setDni(int dni) { this.dni = dni; }
    public int getSueldoBase() { return sueldoBase; }
    public void setSueldoBase(int sueldoBase) { this.sueldoBase = sueldoBase; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getApellido() { return apellido; }
    public void setApellido(String apellido) { this.apellido = apellido; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public abstract double getSueldo();
}
