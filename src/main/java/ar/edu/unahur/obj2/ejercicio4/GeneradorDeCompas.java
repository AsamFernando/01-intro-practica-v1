package ar.edu.unahur.obj2.ejercicio4;
import java.util.Scanner;
import java.util.ArrayList;

public class GeneradorDeCompas {
    ArrayList<Companiero> listaCompanieros = new ArrayList<>();

    public String ingresarDatoString(String leyenda) {
        Scanner compas = new Scanner(System.in);
        System.out.println(leyenda);
        return compas.nextLine();
    }

    public void ingresarNombreYApellido() {
        int totalCompas = Integer.parseInt(this.ingresarDatoString("ingresa el total de compañeros: "));
        for(int i=0; i<totalCompas; i++) {
            listaCompanieros.add(new Companiero(this.ingresarDatoString("ingresa el nombre: "), this.ingresarDatoString("ingresa el apellido: ")));
        }
    }
    public void imprimirNomApeXInicial(Companiero compa, char inicial) {
        char inicialNombre = compa.getNombre().charAt(0);
        if(inicialNombre == inicial) {
            System.out.println(compa.getNombre() + "  " + compa.getApellido());
        }
    }
    public void mostrarCompasXInicial(char inicial) {
        for (Companiero compa:listaCompanieros) {
            this.imprimirNomApeXInicial(compa, inicial);
        }
    }
    public void mostrarHastaFin(String inicial) {
        while(!inicial.equals("FIN")) {
            mostrarSiCumpleTamaño(inicial);
            inicial = this.ingresarDatoString("ingresa la inicial del nombre: ");
        }
    }
    public void mostrarSiCumpleTamaño(String input) {
        if(input.length()==1) {
            this.mostrarCompasXInicial(input.charAt(0));
        }
        else {
            System.out.println("ingresaste mas de una letra, tenes q ingresar solo la inicial pelotudo! o FIN para salir...");
        }
    }
    public void hacerTodo() {
        this.ingresarNombreYApellido();
        String letraInicial = this.ingresarDatoString("ingresa la inicial del nombre: ");
        this.mostrarHastaFin(letraInicial);
    }
    public static void main(String[] args) {
        GeneradorDeCompas gen = new GeneradorDeCompas();
        gen.hacerTodo();
    }
}
