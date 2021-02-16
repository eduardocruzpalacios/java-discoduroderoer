package pkg15.pedir.pkgint.dowhile;
import java.util.Scanner;
public class PedirIntDowhile
{
    public static void main(String[] args)
    {
        Scanner t = new Scanner(System.in);
        
        float num;
        
        do
        {
            num = t.nextFloat();
        }
        while (num >= 0);
        
        System.out.println(num);
    }
}