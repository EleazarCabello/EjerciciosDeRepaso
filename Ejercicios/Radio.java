/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libro.Unidad1.Ejercicios;
import java.util.Scanner;

public class Radio {
    public static void main(String[] args)
    {
        double radio,area;
        Scanner miScanner = new Scanner(System.in);
        
        System.out.println("Capture el radio del circulo");
        radio=miScanner.nextDouble();
        area=Math.PI*Math.pow(radio,2);
        
        System.out.println("El area del circulo es: "+area);
    }
}
