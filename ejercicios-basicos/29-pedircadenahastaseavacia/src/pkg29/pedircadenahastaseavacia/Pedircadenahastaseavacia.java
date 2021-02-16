package pkg29.pedircadenahastaseavacia;
import java.util.Scanner;
public class Pedircadenahastaseavacia
{
    public static void main(String[] args)
    {
        Scanner t = new Scanner(System.in);
        String cadena;
        String cadena_total = "";
        int contador = 1;
        do
        {
            System.out.println("Dame una cadena");
            cadena = t.nextLine();
            cadena_total += contador + ".- " + cadena + "\n";
            contador++;
        }
        while(!cadena.equals(""));
        System.out.println(cadena_total);
    }
}