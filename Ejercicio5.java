/*
Realice un programa que compruebe si una matriz dada es antisimétrica. Se dice que 
una matriz A es antisimétrica cuando ésta es igual a su propia traspuesta, pero 
cambiada de signo. Es decir, A es antisimétrica si A = -AT. La matriz traspuesta 
de una matriz A se denota por AT y se obtiene cambiando sus filas por columnas 
(o viceversa).
 
 */
package Guia5Encuentros9y10y11;

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int n;
        System.out.print("Ingrese la cantidad de filas de su matriz: ");
        n = leer.nextInt();

        int matriz[][] = new int[n][n];
        llenadoDeMatriz(matriz, n, leer);
        System.out.println("Matriz Original\n");
        mostrarMatriz(matriz, n);
        
        System.out.println("\nMatriz Transpuesta");
        int matrizTrans[][] = matrizTranspuesta(matriz, n);
        mostrarMatriz(matrizTrans, n);

        if (simetria(matriz, matrizTrans, n)) {
            System.out.println("\nLa matriz es simetrica");
        } else if (comparoMatriz(matriz, matrizTrans, n)) {
            System.out.println("\nLa matriz es antisimetrica");
        } else {
            System.out.println("\nLa matriz ingresada no es simetrica");
        }
    }

    public static void llenadoDeMatriz(int matriz[][], int n, Scanner leer) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Pocision [" + i + "][" + j + "] = ");
                matriz[i][j] = leer.nextInt();
            }
            System.out.println(" ");
        }
    }

    public static void mostrarMatriz(int matriz[][], int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(" ");
        }
    }

    public static int[][] matrizTranspuesta(int matriz[][], int n) {
        int matrizt[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrizt[i][j] = matriz[j][i];
            }
            System.out.println(" ");
        }
        return matrizt;
    }

    public static boolean simetria(int matriz[][], int matrizTrans[][], int n) {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matriz[i][j] != matrizTrans[i][j]) {
                    return false;
                }
            }
        }

        return true;
    }

    public static boolean comparoMatriz(int matriz[][], int matrizTrans[][], int n) {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matriz[i][j] != -matrizTrans[i][j]) {
                    return false;
                }
            }
        }

        return true;
    }
}
