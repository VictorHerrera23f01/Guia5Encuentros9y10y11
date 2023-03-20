/*
 Realizar un programa que llene una matriz de tamaño NxM con valores 
aleatorios y muestre la suma de sus elementos.

*/
package Guia5Encuentros9y10y11;
import java.util.Scanner;

public class Extra5 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int filas,columnas,suma=0;
        System.out.print("Ingrese la cantidad de filas: ");
        filas=leer.nextInt();
        System.out.print("Ingrese la cantidad de columnas: ");
        columnas=leer.nextInt();
        
        int matriz [][]= new int [filas][columnas];
        
        for(int i=0; i<filas; i++){
            for(int j=0; j<columnas; j++){
                matriz[i][j]= (int)(Math.random()*10);
                suma+=matriz[i][j];
                System.out.print("["+matriz[i][j]+"]");
            }
            System.out.println("");
        }
    }
}
