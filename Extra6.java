/*
Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres 
y, a medida que el usuario las va ingresando, construya una “sopa de letras 
para niños” de tamaño de 20 x 20 caracteres. Las palabras se ubicarán todas 
en orden horizontal en una fila que será seleccionada de manera aleatoria. 
Una vez concluida la ubicación de las palabras, rellene los espacios no 
utilizados con un número aleatorio del 0 al 9. Finalmente imprima por pantalla 
la sopa de letras creada.

Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las 
siguientes funciones de Java substring(), Length() y Math.random().

 */
package Guia5Encuentros9y10y11;

import java.util.Scanner;

public class Extra6 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        String palabras[] = new String[5];
        String sopaDeLetras[][] = new String[20][20];
        String letras[] = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};

        for (int i = 0; i < 5; i++) {
            /*
            aqui nos aseguramos que las palabras introducidas sean de una longitud
            entre 3 y 5 caracteres
             */
            do {
                System.out.print((i + 1) + " : ");
                palabras[i] = leer.next();
            } while (palabras[i].length() <= 2 || palabras[i].length() >= 6);

        }

        System.out.println("");
        int fila[] = new int[5];

        for (int i = 0; i < 5; i++) {
            int numeroAleatorio = (int) (Math.random() * 20) + 1;

            for (int j = 0; j < i; j++) {
                if (fila[i] == numeroAleatorio) {
                    /*
                    aqui nos aseguramos que si se repite se debe generar uno 
                    nuevo en el mismo lugar y luego evaluar de nuevo si se repite
                    por eso el j=-1 para que vuelva a evaluar, una vez sea distinto 
                    sale del bucle
                     */
                    numeroAleatorio = (int) (Math.random() * 20) + 1;
                    j = -1;
                }
            }
            //y luego el valor que no se repite respecto de los anteriores se guarda
            fila[i] = numeroAleatorio;
        }

        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {

                if (i < 5 && j < palabras[i].length()) {
                    sopaDeLetras[(fila[i])][j] = palabras[i].substring(j, j + 1).toUpperCase();
                }

            }
        }

        int numero;
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {

                if (sopaDeLetras[i][j] == null) {
                    numero = (int) (Math.random() * 26);
                    sopaDeLetras[i][j] = letras[numero];
                }

                System.out.print(sopaDeLetras[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
