package ar.edu.unahur.obj2.ejercicio5;
import java.util.ArrayList;
import java.util.Scanner;

public class ContadorLetras {
    String texto;
    int ocurrenciasTotal;
    ArrayList<Integer> listaOcurrencias = new ArrayList<>();

    public void introducirDatos(String leyenda) {
        Scanner scanTexto = new Scanner(System.in);
        System.out.println(leyenda);
        texto = scanTexto.nextLine();
    }
    public int ocurrenciasXLetra(char letra) {
        int ocurrencias = 0;
        for(int i=0; i<texto.length(); i++) {
            if(letra == texto.charAt(i)) {
                ocurrencias+=1;
            }
        }
        return ocurrencias;
    }

    public void contarLetrasASCII() {
        for(int i=97; i<123; i++) {
            listaOcurrencias.add(this.ocurrenciasXLetra((char)i));
        }
    }
    public void visualizarRecuento() {
        for(int i=1; i<27; i++) {
            System.out.println((char)(i + 96) + "--> " + listaOcurrencias.get(i - 1));
        }
    }
    public void hacerTodo() {
        this.introducirDatos("ingresa un texto: ");
        this.contarLetrasASCII();
        this.visualizarRecuento();

    }

    public static void main(String[] args) {
        ContadorLetras contOcurr = new ContadorLetras();
        contOcurr.hacerTodo();
    }
}
