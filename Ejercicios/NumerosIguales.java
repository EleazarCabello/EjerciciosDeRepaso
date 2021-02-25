//Capture 2 numeros e imprima un letlero que diga si los nimeros son iguales
package Libro.Unidad1.Ejercicios;
import java.util.Scanner;

public class NumerosIguales {
    public static void main(String[] args)
    {
        double No1,No2;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Capture el primer valor");
        No1 =scanner.nextDouble();
        
        System.out.println("Capture el primer valor");
        No2 =scanner.nextDouble();
        
        if(No1==No2)
             System.out.println("Los numeros son iguales");
        else
             System.out.println("Los numeros son diferentes");
    }
}
