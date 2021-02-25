
package EjerciciosDeLogica;
import java.util.Scanner;

public class Ordenar3 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        
        double Valor1,Valor2,Valor3;
        
        System.out.println("Captura el primer valor: ");
        Valor1 =scanner.nextDouble();
        
        System.out.println("Captura el segundo valor: ");
        Valor2 =scanner.nextDouble();
        
        System.out.println("Captura el tercer valor: ");
        Valor3 =scanner.nextDouble();
        
        if(Valor1 > Valor2)
        {
            if(Valor1 > Valor3)
            {
               if(Valor2 > Valor3)
                    System.out.println(Valor1+", "+Valor2+", "+Valor3);
               else
                   System.out.println(Valor1+", "+Valor3+", "+Valor2);
            }
            else
            if(Valor3 > Valor2)
            {
                if(Valor2 > Valor1)
                    System.out.println(Valor3+", "+Valor2+", "+Valor1);
                else
                     System.out.println(Valor3+", "+Valor1+", "+Valor2);
            }
        }
        else
        {
            if(Valor2 > Valor3)
            {
                if(Valor3 > Valor1)
                    System.out.println(Valor2+", "+Valor3+", "+Valor1);
                else
                    System.out.println(Valor2+", "+Valor1+", "+Valor3);
            }
            else
            {
                if(Valor2 > Valor1)
                    System.out.println(Valor3+", "+Valor2+", "+Valor1);
                else
                    System.out.println(Valor3+", "+Valor1+", "+Valor2);
            }
        }
    }
}
