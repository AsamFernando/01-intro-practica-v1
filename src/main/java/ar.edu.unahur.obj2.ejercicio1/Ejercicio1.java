package ar.edu.unahur.obj2.ejercicio1;

public class Ejercicio1 {
    int[] myArray= {1, 2, 3, 4, 5};
    //int[] myArrayAlReves= new int[5];

    public int[] getMyArray() {
        return myArray;
    }

    public void reverse() {
        for(int i = 4; i >= 0; i--) {
            //myArray[i] = myArray.length - i;
            System.out.println(myArray[i]);
        }
    }
}
