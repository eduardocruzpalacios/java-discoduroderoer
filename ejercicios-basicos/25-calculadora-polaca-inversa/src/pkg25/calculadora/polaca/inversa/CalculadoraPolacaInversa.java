package pkg25.calculadora.polaca.inversa;
import java.util.Scanner;
public class CalculadoraPolacaInversa
{
    public static void main(String[] args)
    {
        Scanner t = new Scanner(System.in);
        Scanner t2 = new Scanner(System.in);
        int num1, num2;
        String signo = "";
        // pedir número 1 y 2 controlar que sean enteros
        System.out.println("Dame 1 entero");
        while (t.hasNextInt() == false)
        {
            System.out.println("Eso NO era un ENTERO");
            t.next();
        }
        num1 = t.nextInt();
        System.out.println("Dame otro entero");
        while (t.hasNextInt() == false)
        {
            System.out.println("Eso NO era un ENTERO");
            t.next();
        }
        num2 = t.nextInt();
        // imprimir números de usuario
        System.out.println("Enteros introducidos: "+num1+" y "+num2);
        // declarar signos validos y boolean de control
        String[] signos = {"+","-","*","/","%","^"};
        boolean a = false;
        // bucle infinito no acaba hasta que usuario meta signo válido
        while (a == false)
        {
            System.out.println("Dame un signo: + - * / ^ %");
            signo = t2.nextLine();
            for (int i=0 ; i<signos.length ; i++)
            {
                if ( signo.equals(signos[i]) )
                {
                    a=true;
                }
            }
        }
        // hace la operación pertinente según qué signo
        if (signo.equals("+"))
        {
            System.out.println("La suma de los números es "+(num1+num2));
        }
        
        if (signo.equals("-"))
        {
            System.out.println("La resta de los números es "+(num1-num2));
        }
        
        if (signo.equals("*"))
        {
            System.out.println("La multiplicación de los números es "+(num1*num2));
        }
        
        if (signo.equals("/"))
        {
            System.out.println("La división de los números es "+(num1/num2));
        }
        
        if (signo.equals("^"))
        {
            System.out.println(num1+" elevado a "+num2+" es "+Math.pow( (double) num1, (double) num2 ) );
        }
        
        if (signo.equals("%"))
        {
            System.out.println("El resto de la división de los números es "+(num1%num2));
        }
    }
}