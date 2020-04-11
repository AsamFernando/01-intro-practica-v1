package ar.edu.unahur.obj2.ejercicio1;

import static org.testng.Assert.*;

import ar.edu.unahur.obj2.ejercicio1.Ejercicio1;

public class Ejercicio1Test {
    int[] arrayPrueba= {5, 4, 3, 2, 1};

    @org.testng.annotations.Test
    public void testOrdenar() {
        Ejercicio1 ej1=new Ejercicio1();
        ej1.reverse();
        //assertEquals(ej1.getMyArray(), arrayPrueba);
    }
}