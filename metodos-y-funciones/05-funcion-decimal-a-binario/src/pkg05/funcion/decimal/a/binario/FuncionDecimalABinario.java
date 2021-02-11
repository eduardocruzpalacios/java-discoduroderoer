package pkg05.funcion.decimal.a.binario;
import java.util.Scanner;
public class FuncionDecimalABinario
{
    public static void main(String[] args)
    {
        // almacenar número en base decimal
        double decimal = dameNum();
        
        // double --> String
        String binario = decimalABinario(decimal);
        
        // imprimir binario
        System.out.println("\nNúmero en base decimal: "+decimal);
        System.out.println("Número en base binaria: "+binario);
    }
    
    // función devuelve real
    public static double dameNum()
    {
        Scanner t = new Scanner(System.in);
        System.out.println("Dame un número");
        while (t.hasNextDouble() == false)
        {
            System.out.println("eso no era un número, try again");
            t.next();
        }
        return t.nextDouble();
    }
    
    // función recibe número en base decimal y lo pasa a binario
    public static String decimalABinario(double x)
    {
        String binarioReves = "";
        int y;
        do
        {
            // si PAR
           if ( x % 2 == 0 )
           {
                binarioReves += "0";
                y = (int) x/2;
                x = (double) y;        
           }
           // si IMPAR
           else
           {
               binarioReves += "1";
               y = (int) x/2;
               x = (double) y;
           }
        }
        while(x >= 1);
        
        String binario = "";
        
        // calcular longitud binario - 1
        int longitudBinario = binarioReves.length() - 1;
        
        // darle l vuelta al String y guardarlo en otro
        for (int i = longitudBinario ; i >= 0 ; i--)
        {
            binario += binarioReves.charAt(longitudBinario);
            longitudBinario--;
        }
        
        return binario;
    }
    
}