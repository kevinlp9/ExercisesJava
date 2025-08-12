package Ciclos;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        double notas, notas6=0, notas5=0, notas1=0;
        double prom1=0, prom2=0, prom3=0, promtotal=0;
        Scanner sc = new Scanner(System.in);
        int j=1, k=1, l=1;
        for (int i=1; i<=20; i++){
            System.out.println("Ingresa la nota: " + i);
            notas=sc.nextDouble();
            promtotal+=notas;
                if (notas>=6 && notas<=10){
                    notas6+=notas;
                    prom1=notas6/j;
                    j++;
                } else if (notas<6 && notas>1) {
                    notas5+=notas;
                    prom2=notas5/k;
                    k++;
                } else if (notas==1) {
                    notas1+=notas;
                    prom3=notas1/l;
                    l++;
                } else {
                    return;
                }
            }
        sc.close();
        System.out.println("La cantidad de notas mayores e iguales a 6 es: " + j + " y el promedio es: " + prom1);
        System.out.println("La cantidad de notas menores a 6 es: " + k + " y el promedio es: " + prom2 );
        System.out.println("La cantidad de notas iguales a 1 es: " + l + " y el promedio es: " + prom3);
        System.out.println("El promedio total es: " + promtotal/20);
        }

    }

