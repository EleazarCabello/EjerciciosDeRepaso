
package Libro.Unidad1.Ejercicios;


public class Cuenta {
    
    private String Titular;
    private double Cantidad;
    
    //Propiedades
    public String getTitular()
    {
        return Titular;
    }
    public void setTitular(String Titular)
    {
        this.Titular = Titular;
    }
         
     public double getCantidad()
    {
        return Cantidad;
    }
    public void setCantidad(double Cantidad)
    {
        this.Cantidad = Cantidad;
    }
    
    //Constructor
    public Cuenta(String titu,double cant )
    {
        Titular = titu;
        Cantidad = cant;
    }
    public Cuenta()
    {
    }
    
    public String ToString()
    {
        return ("Titular: "+Titular+"  Saldo: "+Cantidad);
    }
    
    public double Ingresar(double Numero)
    {
        if(Numero>0)
            return Cantidad = Cantidad + Numero;
        else
            return Cantidad;
    }
    
    public double retirar(double Numero)
    {
        Cantidad = Cantidad - Numero; 
        if(Cantidad <0)
            return 0;
        else
            return Cantidad;
    }
}
