package ar.edu.unahur.obj2.ejercicio2;

import ar.edu.unahur.obj2.ejercicio2.Ejercicio2;

import java.util.Scanner;

import static org.testng.Assert.*;


public class Ejercicio2Test {
    int nroPrueba=3;
    Ejercicio2 ej2= new Ejercicio2();

    @org.testng.annotations.Test
    public void main() {
        Scanner input = new Scanner(System.in);
        System.out.println("ingresa un numero entero: ");

        int primero=input.nextInt();

        ej2.setPrimerNro(primero);
        assertEquals(ej2.getPrimerNro(), nroPrueba);

    }

}
