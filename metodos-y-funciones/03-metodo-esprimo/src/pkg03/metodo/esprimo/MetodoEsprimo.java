package pkg03.metodo.esprimo;
import java.util.Scanner;
public class MetodoEsprimo
{
    public static void main(String[] args)
    {
        System.out.println("Dame un número");
        double input = dameNum();
        
        if (esPrimo(input))
        {
            System.out.println("ese número SÍ es primo");
        }
        
        else
        {
            System.out.println("ese número NO es primo");
        }
    }
    
    // función devuelve Real
    public static double dameNum()
    {
        Scanner t = new Scanner(System.in);
        while (t.hasNextDouble()==false)
        {
            System.out.println("Dame un número");
            t.next();
        }
        return t.nextDouble();
    }
    
    // método
    public static boolean esPrimo (double x)
    {
        int cuenta=0;
        x = Math.sqrt(x);
        
        for (double i = x; i>0 ; i--)
        {
            if (i%2 == 0) // si divisible entre 2, aumenta cuenta
            {
                cuenta++;
            }
        }
        
        if (cuenta>1) // es divisible entre más números a parte de 1
        {
            return false;
        }
        
        else
        {
            return true;
        }
        
    }
}