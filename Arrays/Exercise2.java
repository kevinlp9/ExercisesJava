package Arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] array = new int[10];
        for (int i=0; i<10; i++){
            System.out.println("Ingrese el numero:" + (i+1));
            array[i]=sc.nextInt();
            if (array[i]<0 || array[i]>9){
                System.out.println("El numero no es valido");
            }else {
                System.out.println(array[i]);
            }
        }

        //usar for
        Map<Integer, Integer> frecuencia = new HashMap<>();
        for (int numero : array) {
            frecuencia.put(numero, frecuencia.getOrDefault(numero, 0) + 1);
        }

        int numeroMayorFrecuencia = array[0];
        int maxFrecuencia = 0;
        for (Map.Entry<Integer, Integer> entry : frecuencia.entrySet()) {
            if (entry.getValue() > maxFrecuencia) {
                maxFrecuencia = entry.getValue();
                numeroMayorFrecuencia = entry.getKey();
            }
        }
        System.out.println("El numero con mayor frecuencia es: "
                + numeroMayorFrecuencia + " con " + maxFrecuencia + " apariciones");
    }
}
