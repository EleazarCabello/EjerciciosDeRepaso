
package Libro.Unidad1.Ejercicios;
import java.util.Scanner;

public class TestCuenta {
    static public void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        
       Cuenta UsuarioPedro = new Cuenta("Pedro",300);
       Cuenta UsuarioFernando = new Cuenta("Fernando",300);
       
       UsuarioPedro.Ingresar(300);
       UsuarioFernando.Ingresar(400);
       
       UsuarioPedro.retirar(500);
       UsuarioFernando.retirar(100);
       
       System.out.println(UsuarioPedro.ToString()+"  ");
       System.out.println(UsuarioFernando.ToString());
    }
}
