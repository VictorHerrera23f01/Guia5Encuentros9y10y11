/*
Escriba un programa que averigüe si dos vectores de N enteros son iguales (la 
comparación deberá detenerse en cuanto se detecte alguna diferencia entre los 
elementos).

 */
package Guia5Encuentros9y10y11;

import java.util.Scanner;

public class Extra2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int n;

        System.out.print("Ingrese el tamaño del vector: ");
        n = leer.nextInt();

        int vector1[] = new int[n];
        int vector2[] = new int[n];

        System.out.println("\nVector 1");
        for (int i = 0; i < n; i++) {
            System.out.print("V1 [" + (i + 1) + "] : ");
            vector1[i] = leer.nextInt();
        }

        System.out.println("\nVector 2");
        for (int i = 0; i < n; i++) {
            System.out.print("V2 [" + (i + 1) + "] : ");
            vector2[i] = leer.nextInt();
        }

        boolean iguales = true;
        System.out.println("");
        for (int i = 0; i < n; i++) {
            if (vector1[i] != vector2[i]) {
                iguales = false;
                System.out.println("\nNo son iguales en todos los elementos");
                break;
            } else {
                System.out.println("V1 = V2 [" + (i + 1) + "]");
            }
        }

        if (iguales) {
            System.out.println("\nSon iguales");
        }

    }
}
