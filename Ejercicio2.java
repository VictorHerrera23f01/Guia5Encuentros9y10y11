/*
Realizar un algoritmo que rellene un vector de tamaño N c on valores aleatorios y le 
pida al usuario un numero a buscar en el vector. El programa mostrará donde se 
encuentra el numero y si s e encuentra repetido
 */

package Guia5Encuentros9y10y11;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[]args){
        Scanner leer=new Scanner(System.in);
        
        int n,valor,pocision=0,repetido=0;
        
        System.out.print("Ingrese el tamaño del vector: ");
        n=leer.nextInt();
        
        int vector []= new int [n];
        
        for(int i=0; i<n; i++){
            vector[i]=(int) (Math.random()*10);
            System.out.print(vector[i]+" ");
        }
        
        System.out.print("\nIngrese un valor a buscar dentro del vector: ");
        valor=leer.nextInt();
        System.out.println("");
        
        for(int i=0; i<n; i++){
            if(vector[i]==valor){
                pocision=i;
                repetido++;
                System.out.println("Se encuentra en la pocision "+pocision);
            }
        }
        
        System.out.println("El numero "+valor+" se ha repetido "+repetido+" veces");
    }
}
