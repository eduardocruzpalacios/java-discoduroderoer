package pkg18.pedir2int.generaraleatorioenmedio;
import java.util.Scanner;
public class Pedir2intGeneraraleatorioenmedio
{
    public static void main(String[] args)
    {
        Scanner t = new Scanner(System.in);
        double input1,input2,random;
        
        System.out.println("Dame número 1");
        while ( t.hasNextFloat() == false )
        {
            System.out.println("eso no era un número, try again");
            t.next();
        }
        input1 = t.nextFloat();
        
        System.out.println("Dame número 2");
        while ( t.hasNextFloat() == false )
        {
            System.out.println("eso no era un número, try again");
            t.next();
        }
        input2 = t.nextFloat();
        
        for ( int i=1 ; i<11 ; i++ )
        {
            random = Math.floor(Math.random()*(input1-input2)+input2);
            System.out.println("Número aleatorio "+i+" entre "+input1+" y "+input2+": "+random);
        }
    }
}