package ar.edu.unahur.obj2.ejercicio3;

import java.util.Scanner;
import java.lang.Math;

public class Ejercicio3 {
    float[] listaTemps = new float[10];
    float tempMax = -9999999.0f;
    float tempMin = 99999999.0f;
    float mediaTemps = 0.0f;

    public void pedirTempsYcalcularMedia() {
        Scanner scanTemp = new Scanner(System.in);
        for(int i=0; i<listaTemps.length; i++) {
            System.out.printf("Ingresa una temperatura para la hora %d%n: ", i);
            float tempXHora = scanTemp.nextFloat();
            listaTemps[i] = tempXHora;
            mediaTemps += tempXHora;
        }
        mediaTemps=mediaTemps/listaTemps.length;
    }
    String crearUnaBarra(float nroTemp) {
        int intTemp = (int)nroTemp;
        String barra = "";
        for(int i=0; i<intTemp; i++) {
            barra = barra + "*";
        }
        return barra;
    }
    public void CrearGraficoBarras() {
        for(int i=0; i<listaTemps.length; i++) {
            System.out.println(i + "  " + this.crearUnaBarra(listaTemps[i]) + "  " + this.esMaxOMin(listaTemps[i]));
        }
    }
    public void esMayorOMenorTemp(float temp) {
        tempMax=Math.max(tempMax, temp);
        tempMin=Math.min(tempMin, temp);
    }

    public void calcularMaxMinTemp() {
        for(int i=0; i<listaTemps.length; i++) {
            esMayorOMenorTemp(listaTemps[i]);
        }
    }
    public String esMaxOMin(float temp) {
        String maxOMin = Float.toString(temp);
        if(temp==tempMax) {
            maxOMin = maxOMin + "  --> MAX";
        }
        if(temp==tempMin) {
            maxOMin = maxOMin + "  --> MIN";
        }
        return maxOMin;
    }
    public void hacerTodo() {
        this.pedirTempsYcalcularMedia();
        this.calcularMaxMinTemp();
        this.CrearGraficoBarras();
        System.out.printf("Media: %.1f%n", mediaTemps);
    }
    public static void main(String[] args) {
        Ejercicio3 ej3 = new Ejercicio3();
        ej3.hacerTodo();
    }
}