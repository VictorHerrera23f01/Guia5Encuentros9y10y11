/*
Crear una función rellene un vector con números aleatorios, pasándole un arreglo por 
parámetro. Después haremos otra función o procedimiento que imprima el vector.
*/
package Guia5Encuentros9y10y11;
import java.util.Scanner;

public class Extra3 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int n=3;
        int vector[]=new int [n];
        
        llenadoDeVector(vector,n);
        imprimirVector(vector,n);
    }
    
    public static void llenadoDeVector (int vector[],int n){
        for (int i = 0; i < n; i++) {
            vector[i]= (int)(Math.random()*10);
        }
    }
    public static void imprimirVector (int vector[],int n){
        for (int i = 0; i < n; i++) {
            System.out.print("["+vector[i]+"]");
        }
    }
}
