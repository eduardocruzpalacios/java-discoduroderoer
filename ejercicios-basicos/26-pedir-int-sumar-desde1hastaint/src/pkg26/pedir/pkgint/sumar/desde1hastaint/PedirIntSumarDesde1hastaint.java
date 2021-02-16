package pkg26.pedir.pkgint.sumar.desde1hastaint;
import java.util.Scanner;
public class PedirIntSumarDesde1hastaint
{
    public static void main(String[] args)
    {
        Scanner t = new Scanner(System.in);
        int num;
        
        System.out.println("Dame un entero mayor que 1");
         
        do
        {
           //Pedimos el primer número
           num=t.nextInt();
           if(num<=1)
           {
               System.out.println("valor in correcto, try again");
           }
             
        }while(!(num>1)); //condición para salir
         
        int suma=0;
         
        //Realizamos la suma
        for ( int i=1 ; i<=num ; i++)
        {
            suma+=i;
        } 
             
        System.out.println("La suma es: "+suma);
    }
}