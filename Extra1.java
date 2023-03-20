/*
Realizar un algoritmo que calcule la suma de todos los elementos de un vector de tamaño N, 
con los valores ingresados por el usuario.
 */
package Guia5Encuentros9y10y11;

import java.util.Scanner;

public class Extra1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int n, suma = 0;

        System.out.print("Ingrese la cantidad de numeros a ingresar: ");
        n = leer.nextInt();

        int vector[] = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print((i + 1) + " : ");
            suma += leer.nextInt();
        }

        System.out.println("La suma de los numeros: " + suma);
    }
}
