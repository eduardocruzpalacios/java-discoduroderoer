package pkg20.primo.noprimo.usandoraizcuadrada;
import java.util.Scanner;
public class PrimoNoprimoUsandoraizcuadrada {
    public static void main(String[] args) {
        // instanciar clase Scanner
        Scanner t = new Scanner(System.in);
        // declarar dónde se guarda input usuario
        int input;
        // pedir entero y controlar usuario introduce entero
        System.out.println("Dame un entero");
        while ( t.hasNextFloat() == false )
        {
            System.out.println("eso no era un entero, try again");
            t.next();
        }
        input = t.nextInt();
        // si input es <= 1, no es primo
        if (input<=1)
        {
            System.out.println(input+" no es primo");
        }
        /* si input > 1
            calculamos raizCuadrada
            dividimos input / raiz y raiz-- hasta 1 y contamos cuántos restos de divisiones no son 0
                si cuenta = 0, input es primo
                si cuenta > 0, input no es primo
        */
        else
        {
            int raiz = (int) Math.sqrt(input);
            int cuenta=0;
            for (int i= raiz ; i > 1 ; i--)
            {
                if (input%i == 0)
                {
                    cuenta++;
                }
            }
            if (cuenta == 0)
            {
                System.out.println(input+" sí es primo");
            }
            else
            {
                System.out.println(input+" no es primo");
            }
        } 
    }
}