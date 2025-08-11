package Ciclos;

import java.util.Scanner;

public class TablaMult {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Ingrese el numero: ");
        num = sc.nextInt();
        for (int i=1; i<=10; i++){
            System.out.println(num*i);
        }
    }
}
