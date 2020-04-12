package ar.edu.unahur.obj2.ejercicio2;
import java.util.Scanner;
import java.util.ArrayList;

public class Ejercicio2 {
    //int[] listaInts= new int[10];
    ArrayList<Integer> listaInts = new ArrayList<>();
    int primerNro;

    public void setPrimerNro(int setPrimero) {
        primerNro = setPrimero;
    }
    public int getPrimerNro() {
        return primerNro;
    }

    public void ingresarPrimerNro() {
        Scanner scanPrimerNro = new Scanner(System.in);
        System.out.println("ingresa el primer numero: ");

        primerNro = scanPrimerNro.nextInt();
        this.setPrimerNro(primerNro);
    }
    public boolean esMayorAlPrimero(int nro) {
        return nro > primerNro;
    }
    public void imprimirLista() {
        for (int i:listaInts) {
            System.out.println(i);
        }
    }
    public void agregarAListaSiEsMayor(int nro) {
        if (this.esMayorAlPrimero(nro)) {
            listaInts.add(nro);
        }
    }
    public void ingresarAListaImprimir() {
        Scanner scanLista = new Scanner((System.in));
        for(int i = 0; i<10; i++) {
            System.out.println("ingresa un nro en la posicion " + i + " de la lista: ");
            int nuevoNro = scanLista.nextInt();
            this.agregarAListaSiEsMayor(nuevoNro);
        }
        this.imprimirLista();
    }
    public static void main(String[] args) {
        Ejercicio2 ej2= new Ejercicio2();
        ej2.ingresarPrimerNro();
        ej2.ingresarAListaImprimir();
    }
}
