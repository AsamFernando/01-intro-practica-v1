package ar.edu.unahur.obj2.ejercicio6;

public class Matriz3X3 {
    //int[][] matriz3X3 = new int[3][3];
    int[][] matriz3X3 = {{1, 2, 3}, {4, 5, 6, 10, 11}, {7, 8, 9, 10}, {12, 13}};

    public void rellenarMatriz() {
        for(int filas=0; filas<matriz3X3.length;filas++) {
            for(int columna=0;columna<matriz3X3[filas].length;columna++) {
                matriz3X3[filas][columna] = columna;
            }
        }
    }
    public void imprimirMatriz() {
        for(int filas=0; filas<matriz3X3.length;filas++) {
            for(int columnas=0; columnas<matriz3X3[filas].length; columnas++) {
                //System.out.print(matriz3X3[filas][columnas] + "\t");
                System.out.printf("%d\t", matriz3X3[filas][columnas]);
            }
        System.out.print("\n");
        }
    }
    public static void main(String[] args) {
        Matriz3X3 matrix= new Matriz3X3();
        //matrix.rellenarMatriz();
        matrix.imprimirMatriz();
    }
}
