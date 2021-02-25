
package EjerciciosDeLogica;
import java.util.Scanner;
import java.util.Random;

public class AdivinaNumero {
    public static void main(String[] args)
    {
    int numero;
    Scanner scanner = new Scanner(System.in);
    Random Aleatorio = new Random();
    
    int NumeroBuscar = Aleatorio.nextInt(99)+1;
    
             System.out.println("Ingrese un numero entre 1 y 100 asta que encuentres el valor aletorio");
            numero= scanner.nextInt();
            
        while(numero != NumeroBuscar)
        {
            
            if(numero>NumeroBuscar)
            {
                 System.out.println("menor");
                  numero= scanner.nextInt();
            }
            else
            {
                System.out.println("mayor");
                 numero= scanner.nextInt();
            }
        }
        System.out.println("Felicidades el numero correcto era "+NumeroBuscar);
    }
}
