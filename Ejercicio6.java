/*
Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde 
la suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un programa 
que permita introducir un cuadrado por teclado y determine si este cuadrado es mágico 
o no. El programa deberá comprobar que los números introducidos son correctos, es 
decir, están entre el 1 y el 9.

 */
package Guia5Encuentros9y10y11;

import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int n = 3;
        int cuadrado[][] = new int[n][n];
        llenadoDeMatriz(cuadrado, n, leer);
        if (cuadradoMagico(cuadrado, n)) {
            System.out.println("El cuadrado es magico");
        } else {
            System.out.println("El cuadrado no es magico");
//            System.out.println("Aqui tienes una sugerencia");
//            sugerenciaCuadrado(cuadrado, n);
        }
    }

    public static void llenadoDeMatriz(int matriz[][], int n, Scanner leer) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                do {
                    System.out.print("Pocision [" + i + "][" + j + "] = ");
                    matriz[i][j] = leer.nextInt();
                } while (matriz[i][j] < 1 || matriz[i][j] > 9);

            }
            System.out.println(" ");
        }
    }

    public static boolean cuadradoMagico(int matriz[][], int n) {
        
        int sumaFila1 = 0, sumaFila2 = 0, sumaFila3 = 0;
        int sumaColum1 = 0, sumaColum2 = 0, sumaColum3 = 0;
        int diagonalP = 0, diagonalS = 0;
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                sumaFila1 += matriz[0][j];
                sumaFila2 += matriz[1][j];
                sumaFila3 += matriz[2][j];

                sumaColum1 += matriz[i][0];
                sumaColum2 += matriz[i][1];
                sumaColum3 += matriz[i][2];

                diagonalS += matriz[i][3 - (i + 1)];

                if (i == j) {
                    diagonalP += matriz[i][j];
                }

            }
        }

        if ((sumaFila1 == 15) && (sumaFila2 == 15) && (sumaFila3 == 15) && (sumaColum1 == 15) && (sumaColum2 == 15) && (sumaColum3 == 15) && (diagonalP == 15) && (diagonalS == 15)) {
            return true;
        } else {
            return false;
        }

    }

//    public static void sugerenciaCuadrado(int matriz[][], int n) {
//
//        int sumaFila1 = 0, sumaFila2 = 0, sumaFila3 = 0;
//        int sumaColum1 = 0, sumaColum2 = 0, sumaColum3 = 0;
//        int diagonalP = 0, diagonalS = 0;
//        boolean magico = true;
//
//        do {
//            for (int i = 0; i < n; i++) {
//                for (int j = 0; j < n; j++) {
//                    matriz[i][j] = (int) (Math.random() * 10) + 1;
//
//                    sumaFila1 += matriz[0][j];
//                    sumaFila2 += matriz[1][j];
//                    sumaFila3 += matriz[2][j];
//
//                    sumaColum1 += matriz[i][0];
//                    sumaColum2 += matriz[i][1];
//                    sumaColum3 += matriz[i][2];
//
//                    diagonalS += matriz[i][3 - (i + 1)];
//
//                    if (i == j) {
//                        diagonalP += matriz[i][j];
//                    }
//
//                }
//
//                if (sumaFila1 != 15) {
//                    magico = false;
//                    break;
//                }
//
//                System.out.println(" ");
//            }
//
//            if ((sumaFila1 == 15) && (sumaFila2 == 15) && (sumaFila3 == 15) && (sumaColum1 == 15) && (sumaColum2 == 15) && (sumaColum3 == 15) && (diagonalP == 15) && (diagonalS == 15)) {
//                magico = true;
//            } else {
//                magico = false;
//            }
//
//        } while (magico == false);
//
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                System.out.print(matriz[i][j] + " ");
//            }
//            System.out.println(" ");
//        }
//    }
}
