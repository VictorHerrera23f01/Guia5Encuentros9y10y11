/*
 Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito,
cuántos de 2 dígitos, etcétera (hasta 5 dígitos). 
 */

package Guia5Encuentros9y10y11;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[]args){
        Scanner leer=new Scanner(System.in);
        
        int n;
        System.out.print("Ingrese la cantidad de numeros a evaluar: ");
        n=leer.nextInt();
        
        int vector[]=new int[n];
        int cociente, digitos,long1=0,long2=0,long3=0,long4=0,long5=0;
        
        for(int i=0; i<n; i++){
            digitos=0;
            vector[i]= (int)(Math.random()*100000);
            System.out.println(vector[i]);
            
            while(vector[i]>0){
                cociente=vector[i]/10;
                vector[i]=cociente;
                digitos++;                
            }
            
            switch (digitos) {
                case 1:
                    long1++;
                case 2:
                    long2++;
                case 3:
                    long3++;
                case 4:
                    long4++;
                case 5:
                    long5++;
            }
        }
        
        System.out.println("Numeros con digito 1: "+long1);
        System.out.println("Numeros con digito 2: "+long2);
        System.out.println("Numeros con digito 3: "+long3);
        System.out.println("Numeros con digito 4: "+long4);
        System.out.println("Numeros con digito 5: "+long5);
    }
}
