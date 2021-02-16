package pkg32.pedirstring.soniguales;
import java.util.Scanner;
public class PedirstringSoniguales
{
    public static void main(String[] args)
    {
        Scanner t = new Scanner(System.in);
        
        System.out.println("Dame texto 1");
        String texto1 = t.nextLine();
        System.out.println("Dame texto 2");
        String texto2 = t.nextLine();
        
        if( texto1.equals(texto2) )
        {
            System.out.println("Las cadenas son iguales");
        }
        else
        {
            System.out.println("Las cadenas NO son iguales");
        }
    }
}