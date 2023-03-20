package Guia5Encuentros9y10y11;
import java.util.Scanner;

public class Extra6v1{
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        String palabras[] = new String[5];
        String sopaDeLetras[][] = new String[20][20];
        String letras[] = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};

        // Leer 5 palabras de longitud entre 3 y 5 caracteres
        for (int i = 0; i < 5; i++) {
            String palabra;
            do {
                System.out.print((i + 1) + " : ");
                palabra = leer.next();
            } while (palabra.length() <= 2 || palabra.length() >= 6);
            palabras[i] = palabra.toUpperCase();
        }

        // Asignar aleatoriamente una fila para cada palabra
        int filas[] = new int[5];
        for (int i = 0; i < 5; i++) {
            int fila;
            do {
                fila = (int) (Math.random() * 20);
            } while (filaEnUso(filas, fila));
            filas[i] = fila;
        }

        // Insertar palabras en la sopa de letras
        for (int i = 0; i < 5; i++) {
            int fila = filas[i];
            for (int j = 0; j < palabras[i].length(); j++) {
                sopaDeLetras[fila][j] = palabras[i].substring(j, j + 1);
            }
        }

        // Rellenar espacios vacíos con letras aleatorias
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                if (sopaDeLetras[i][j] == null) {
                    int letra = (int) (Math.random() * 26);
                    sopaDeLetras[i][j] = letras[letra];
                }
                System.out.print(sopaDeLetras[i][j] + " ");
            }
            System.out.println("");
        }
    }

    // Comprobar si una fila ya se encuentra en uso
    public static boolean filaEnUso(int filas[], int fila) {
        for (int i = 0; i < filas.length; i++) {
            if (filas[i] == fila) {
                return true;
            }
        }
        return false;
    }
}

