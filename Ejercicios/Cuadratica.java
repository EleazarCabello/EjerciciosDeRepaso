/*
Pedir los coeficientes de una ecuacion de 2º grado, y muestre sus soluciones.
Si no existen debe indicarlo.
 */
package Libro.Unidad1.Ejercicios;

import java.util.Scanner;
public class Cuadratica {
    public static void main(String[] args)
    {
        double a,b,c,determinante,x1,x2;
        Scanner miScanner=new Scanner(System.in);
        
        System.out.println("Capture el coeficinete a:");
        a=miScanner.nextDouble();
        System.out.println("Capture el coeficinete b:");
        b=miScanner.nextDouble();
        System.out.println("Capture el coeficinete c:");
        c=miScanner.nextDouble();
        
        //determinante=Math.pow(b,2)-(4*a*c);
        determinante=(b*b)-(4*a*c);
        
        if(determinante < 0)
            System.out.println("No existen soluciones reales para el problema");
        else
        {
            x1=(-b + Math.sqrt(determinante)/(2*a));
            x2=(-b - Math.sqrt(determinante)/(2*a));
            System.out.println("Solucion de x1:"+x1);
            System.out.println("Solucion de x2:"+x2);
        }
        
    }
}
