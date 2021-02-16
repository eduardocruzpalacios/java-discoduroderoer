package pkg06.funcion.contar.cifras;
import java.util.Scanner;
public class FuncionContarCifras
{
    public static void main(String[] args)
    {
        int input = dameInt();
        int cifras = dameCifras(input);
        
        System.out.println("\n" + input + " tiene " + cifras + " cifras");
    }
    
    // función devuelve int > 0
    public static int dameInt()
    {
        Scanner t = new Scanner(System.in);
        int x;
        do
        {
            System.out.println("Dame un entero>0 y te diré cuántas cifras tiene");
            while (t.hasNextDouble()==false)
            {
                System.out.println("Debes darme un entero");
                t.next();
            }
            x = t.nextInt();
        }
        while(x<=0);
        return x;
    }
    
    public static int dameCifras(int x)
    {
        // int --> String
        String cadena = Integer.toString(x);
        
        return cadena.length();
    }
}