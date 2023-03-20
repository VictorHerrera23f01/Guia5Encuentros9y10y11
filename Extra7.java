/*
Realizar un programa que complete un vector con los N primeros números de la sucesión 
de Fibonacci. Recordar que la sucesión de Fibonacci es la sucesión de los siguientes números:
1, 1, 2, 3, 5, 8, 13, 21, 34, ...

Donde cada uno de los números se calcula sumando los dos anteriores a él. Por ejemplo:
La sucesión del número 2 se calcula sumando (1+1)
Análogamente, la sucesión del número 3 es (1+2),
Y la del 5 es (2+3),
Y así sucesivamente…

La sucesión de Fibonacci se puede formalizar de acuerdo a la siguiente fórmula:
Fibonaccin = Fibonaccin-1 + Fibonaccin-2 para todo n>1
Fibonaccin = 1 para todo n<=1

Por lo tanto, si queremos calcular el término “n” debemos escribir una función 
que reciba como parámetro el valor de “n” y que calcule la serie hasta llegar a ese valor.

Para conocer más acerca de la serie de Fibonacci consultar el siguiente link: 
https://quantdare.com/numeros-de-fibonacci/
 
 */
package Guia5Encuentros9y10y11;

import java.util.Scanner;

public class Extra7 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.print("Ingrese un numero a calcular en la sucesion de Fibonacci: ");
        int n = leer.nextInt();

        int fibonacci[] = new int[n];
        fibonacci[0] = 0;
        fibonacci[1] = 1;

        for (int i = 0; i < n; i++) {

            /*
            para asegurarnos de no tomar valores respecto al tamaño del vector porque
            ya hemos predefinido dos valores previos
             */
            if (i == n - 2) {
                break;
            }

            fibonacci[i + 2] = (fibonacci[i] + fibonacci[i + 1]);

        }

        System.out.println("");

        for (int numeros : fibonacci) {
            System.out.print(numeros + " ");
        }

        System.out.println("\n\nLos primeros " + n + " numeros que integran la sucesion de fibonacci");
    }
}
