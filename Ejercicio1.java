/*

Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y 
los muestre por pantalla en orden descendente.

 */
package Guia5Encuentros9y10y11;

public class Ejercicio1 {
    public static void main(String[]args){
        
        int vector [] = new int [100];
        
        for(int i=0; i<100; i++){
            vector[i]=i;
        }
        for(int j=99; j>=0; j--){
            System.out.println(vector[j]);
        }
    }
}
