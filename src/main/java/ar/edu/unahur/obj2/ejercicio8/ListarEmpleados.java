package ar.edu.unahur.obj2.ejercicio8;
import java.util.ArrayList;

public class ListarEmpleados {
    ArrayList<Empleado> listaEmpleados = new ArrayList<>();

    public void mostrarsueldoFinal() {
        listaEmpleados.forEach(empleado -> { System.out.printf("%.2f%n", empleado.getSueldo());});
    }

    public void crearEmpleadosYLlenarLista() {
        Empleado admin1 = new Administrativo("fer", "rodriguez", "sarasa", 12226519, 10000, 20, 50);
        Empleado admin2 = new Administrativo("nico", "perez", "pepe", 16226519, 20000, 25, 40);
        Empleado vend1 = new Vendedor("leo", "gonzalez", "papa", 15226519, 30000, 25, 100);
        Empleado vend2 = new Vendedor("arturo", "lopez", "popo", 14226519, 40000, 30, 120);
        Empleado vend3 = new Vendedor("marta", "gomez", "gordo", 13226519, 50000, 15, 150);

        listaEmpleados.add(admin1);
        listaEmpleados.add(admin2);
        listaEmpleados.add(vend1);
        listaEmpleados.add(vend2);
        listaEmpleados.add(vend3);
    }
    public static void main(String[] args) {
        ListarEmpleados listaMostrarSueldos = new ListarEmpleados();
        listaMostrarSueldos.crearEmpleadosYLlenarLista();
        listaMostrarSueldos.mostrarsueldoFinal();
    }
}
