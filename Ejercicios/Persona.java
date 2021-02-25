
package Libro.Unidad1.Ejercicios;
import java.util.Random;

public class Persona {
    
    private String Nombre, RFC;
    private int Edad;
    private char Sexo;
    private double Peso,Altura;
    
    public void setNombre(String Nombre)
    {
        this.Nombre = Nombre;
    }
    public String getNombre()
    {
        return Nombre;
    }
    
      public void setEdad(int Edad)
    {
        this.Edad = Edad;
    }
        public int getEdad()
    {
        return Edad;
    }
        
    public void setSexo(char Sexo)
    {
        this.Sexo = Sexo;
    }
          public char getSexo()
    {
        return Sexo;
    }
          
    public void setPeso(double Peso)
    {
        this.Peso = Peso;
    }
    public double getPeso()
    {
        return Peso;
    }
    
    public void setAltura(double Altura)
    {
        this.Altura = Altura;
    }
    
    
    
    public Persona()
    {
        Nombre = "";
        Edad=0;
        Sexo= 'H';
        Peso = 0.0;
        Altura = 0.0;
    }
    
    public Persona(String nom,int eda,char sex)
    {
        Nombre = nom;
        Edad = eda;
        Sexo = sex;
        Peso = 0.0;
        Altura = 0.0;
    }
    
    public Persona(String nom,int eda,char sex,double pes,double alt)
    {
        Nombre = nom;
        Edad = eda;
        Sexo = sex;
        Peso = pes;
        Altura = alt;
    }
    
    public int calcularMC()
    {
        double resultado =0;
        
        resultado = (Peso/(Altura*Altura));
        
        if(resultado<20)
        {
            return -1;
        }
        else
        {
            if(resultado>25)
                return 1;
            else
                return 0;
        }            
    }
    
    public boolean esMayorDeEdad()
    {
        if(Edad > 17)
            return true;
        else
            return false;
    }
    
    public void comprobarSexo(char sexo)
    {
        if(sexo == 'H' || sexo == 'M')
        {
            sexo=sexo;
        }
        sexo = 'H';
    } 
    
    public String toString()
    {
        return "Nombre: "+Nombre+"  RFC: "+RFC+"  Edad: "+Edad+"  Sexo: "+Sexo+"  Peso: "+Peso+"  Altura: "+Altura;
    }
    
    Random miAleatorio = new Random();
    public void generaRFC()
    {
        int Numero1= 1+miAleatorio.nextInt(26);
        int Numero2= 1+miAleatorio.nextInt(26);
        int Numero3= 1+miAleatorio.nextInt(26);
        int Numero4= 1+miAleatorio.nextInt(26);
       
        int NumeroRFC= 100000+miAleatorio.nextInt(899999);
        
        char letra1=(char)(Numero1);
        char letra2=(char)(Numero2);
        char letra3=(char)(Numero3);
        char letra4=(char)(Numero4);
        
        System.out.println(letra1+letra2+letra3+letra4+NumeroRFC);
    }
}
