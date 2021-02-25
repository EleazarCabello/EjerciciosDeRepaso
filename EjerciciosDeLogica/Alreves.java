
package EjerciciosDeLogica;
import java.util.Scanner;

public class Alreves {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int Numero;
        String Dijito1;
        String Dijito2;
        String Dijito3;
        String Dijito4;
        String NumeroString;
        int caracteres = 0;
        
         System.out.println("Escriba un numero entre 0 y 9,999");
         Numero = scanner.nextInt();
         
         NumeroString = Integer.toString(Numero);
         
         for(int x=0; x< NumeroString.length();x++)
         {
             caracteres = caracteres +1;
         }
      
         if(caracteres==1)
         {
             Dijito1= NumeroString.split("")[0];
             System.out.println(Dijito1);
         }
         else
         {
              if(caracteres==2)
              {
                  Dijito1= NumeroString.split("")[0];
                  Dijito2= NumeroString.split("")[1];
                   System.out.println(Dijito2+Dijito1);
              }
              else
              {
                  if(caracteres==3)
                  {
                      Dijito1= NumeroString.split("")[0];
                      Dijito2= NumeroString.split("")[1];
                        Dijito3= NumeroString.split("")[2];
                         System.out.println(Dijito3+Dijito2+Dijito1);           
                  }else
                  {
                      Dijito1= NumeroString.split("")[0];
                        Dijito2= NumeroString.split("")[1];
                        Dijito3= NumeroString.split("")[2];
                        Dijito4= NumeroString.split("")[3];
         
                    System.out.println(Dijito4+Dijito3+Dijito2+Dijito1);
                  }
              }
         }
         
         
    }
}
