package pkg04.metodo.factorial;
import java.util.Scanner;
public class MetodoFactorial
{
    public static void main(String[] args)
    {
        factorial(dameInt());
    }
    
    // función devuelve int > 0
    public static int dameInt()
    {
        Scanner t = new Scanner(System.in);
        int x;
        do
        {
            System.out.println("Dame un entero>0 y te daré su factorial");
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
    
    // método calcular factorial
    public static void factorial(int x)
    {
        System.out.print("El factorial de "+x);
        for (int i = x-1 ; i > 0 ; i--)
        {
            x = x * i;
        }
        System.out.println(" es "+x);
    }
    
}