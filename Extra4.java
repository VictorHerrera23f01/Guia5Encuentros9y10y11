/*
Los profesores del curso de programación de Egg necesitan llevar un registro de las notas 
adquiridas por sus 10 alumnos para luego obtener una cantidad de aprobados y desaprobados. 
Durante el período de cursado cada alumno obtiene 4 notas, 2 por trabajos prácticos 
evaluativos y 2 por parciales. Las ponderaciones de cada nota son:

Primer trabajo práctico evaluativo 10%
Segundo trabajo práctico evaluativo 15%
Primer Integrador 25%
Segundo integrador 50%

Una vez cargadas las notas, se calcula el promedio y se guarda en el arreglo. Al final 
del programa los profesores necesitan obtener por pantalla la cantidad de aprobados y 
desaprobados, teniendo en cuenta que solo aprueban los alumnos con promedio mayor o 
igual al 7 de sus notas del curso.

 */
package Guia5Encuentros9y10y11;
import java.util.Scanner;

public class Extra4 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        float suma;
        float alumnos[] = new float[10];
        int aprobados = 0, desaprobados = 0;

        for (int i = 0; i < 10; i++) {
            
            System.out.println("Alumno " + (i + 1));
            suma=0;
            
            for (int j = 0; j < 4; j++) {
                System.out.print("Nota " + (j + 1) + " : ");
                
                switch (j){
                    case 0: suma += (leer.nextFloat()*0.10);continue;
                    case 1: suma += (leer.nextFloat()*0.15);continue;
                    case 2: suma += (leer.nextFloat()*0.25);continue;
                    case 3: suma += (leer.nextFloat()*0.50);
                    System.out.println("Promedio: "+suma+" \n");continue;
                }                
            }
            
            if (suma >= 7.0) {
                aprobados++;
            } else{
                desaprobados++;
            }
            
        }
        
        System.out.println("Aprobados: "+aprobados);
        System.out.println("Desaprobados: "+desaprobados);

    }
}
