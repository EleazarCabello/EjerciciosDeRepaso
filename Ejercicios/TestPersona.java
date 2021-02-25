
package Libro.Unidad1.Ejercicios;
import java.util.Scanner;

public class TestPersona {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        
        String nombre ="";
        int edad = 0;
        char sexo=' ';
        double peso=0;
        double altura=0;
        
        System.out.println("Capture el nombre.");
        nombre = scanner.next();
        
        System.out.println("Capture la edad.");
        edad = scanner.nextInt();
         
        System.out.println("Capture el sexo.");
        sexo = scanner.next().charAt(0);
        
        System.out.println("Capture el peso.");
        peso =scanner.nextDouble();
        
        System.out.println("Capture la altura.");
        altura =scanner.nextDouble();
        
       Persona miPersona1 = new Persona(nombre,edad, sexo,peso, altura);
       Persona miPersona2 = new Persona(nombre,edad,sexo);
       Persona miPersona3 = new Persona();
       
       miPersona3.setNombre(nombre);
       miPersona3.setEdad(edad);
       miPersona3.setSexo(sexo);
       miPersona3.setPeso(peso);
       miPersona3.setAltura(altura);
       
       int r = miPersona1.calcularMC();
       System.out.println("OBJETO1");
       if(r==1)
       {
            System.out.println("Tiene sobrepeso");
       }
       else
           if(r==0)
                System.out.println("Esta en el peso ideal");
           else
                System.out.println("Esta por debajo del peso ideal");
       
       r = miPersona2.calcularMC();
       System.out.println("OBJETO2");
       if(r==1)
       {
            System.out.println("Tiene sobrepeso");
       }
       else
           if(r==0)
                System.out.println("Esta en el peso ideal");
       else
                System.out.println("Esta por debajo del peso ideal");
       
         r = miPersona3.calcularMC();
         System.out.println("OBJETO3");
       if(r==1)
       {
            System.out.println("Tiene sobrepeso");
       }
       else
           if(r==0)
                System.out.println("Esta en el peso ideal");
       else
                System.out.println("Esta por debajo del peso ideal");
       
       
       boolean MayorOMenor = miPersona1.esMayorDeEdad();
       System.out.println("OBJETO1");
       if(MayorOMenor)
           System.out.println("Es mayor de edad");
       else
           System.out.println("No es mayor de edad");
       
       MayorOMenor = miPersona2.esMayorDeEdad();
       System.out.println("OBJETO2");
       if(MayorOMenor)
           System.out.println("Es mayor de edad");
       else
           System.out.println("No es mayor de edad");
       
       MayorOMenor = miPersona3.esMayorDeEdad();
       System.out.println("OBJETO3");
       if(MayorOMenor)
           System.out.println("Es mayor de edad");
       else
           System.out.println("No es mayor de edad");
       
       miPersona1.generaRFC();
       miPersona2.generaRFC();
       miPersona3.generaRFC();
       
       System.out.println(miPersona1.toString());
       System.out.println(miPersona2.toString());
        System.out.println(miPersona3.toString());
    }
}
