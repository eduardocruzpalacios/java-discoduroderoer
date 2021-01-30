package pkg06.pedirnumero.esparoimpar;
import java.util.Scanner;
public class PedirnumeroEsparoimpar {
    public static void main(String[] args) {
        // pedir número
        Scanner t = new Scanner(System.in);
        System.out.println("Introduce un número");
        while (t.hasNextDouble()==false)
        {
            System.out.println("Introduce un número");
            t.next();
        }
        double num = t.nextDouble();
        
        if(num%2==0)
        {
            System.out.println(num+" es par");
        }
        else
        {
            System.out.println(num+" es impar");
        }
    }
}