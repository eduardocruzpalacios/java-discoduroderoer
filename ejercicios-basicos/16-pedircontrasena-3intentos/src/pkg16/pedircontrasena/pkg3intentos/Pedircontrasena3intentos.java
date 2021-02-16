package pkg16.pedircontrasena.pkg3intentos;
import java.util.Scanner;
public class Pedircontrasena3intentos
{
    public static void main(String[] args)
    {
        Scanner t = new Scanner(System.in);
        
        String pass1, pass2;
        
        System.out.println("Establece tu password");
        pass1 = t.nextLine();
        
        System.out.println("Introduce tu password");
        
        for (int i=1 ; i<= 3 ; i++)
        {
            pass2 = t.nextLine();
            
            if (pass2.equals(pass1))
            {
                System.out.println("Enhorabuena");
                i+=3;
            }
            else
            {
                System.out.println("error. Intentos: "+i);
            }
        }
    }
}