package ar.edu.unahur.obj2.ejercicio7;
import java.util.Random;

public class Matriz10X10 {
    int[][] matrizDiez = new int[10][10];

    public void rellenarMatriz() {
        Random randInt=new Random();

        for(int filas=0; filas<matrizDiez.length;filas++) {
            for(int columna=0;columna<matrizDiez[filas].length;columna++) {
                matrizDiez[filas][columna] = randInt.nextInt(100);
            }
        }
    }
    public void imprimirMatriz() {
        for(int filas=0; filas<matrizDiez.length;filas++) {
            for(int columnas=0; columnas<matrizDiez[filas].length; columnas++) {
                //System.out.print(matrizDiez[filas][columnas] + "\t");
                System.out.printf("%d\t", matrizDiez[filas][columnas]);
            }
            System.out.print("\n");
        }
    }
    public static void main(String[] args) {
        Matriz10X10 matrix= new Matriz10X10();
        matrix.rellenarMatriz();
        matrix.imprimirMatriz();
    }
}
