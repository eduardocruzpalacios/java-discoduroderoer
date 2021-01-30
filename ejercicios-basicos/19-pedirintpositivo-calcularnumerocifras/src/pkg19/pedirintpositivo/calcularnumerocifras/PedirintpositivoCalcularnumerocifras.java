package pkg19.pedirintpositivo.calcularnumerocifras;
import java.util.Scanner;
public class PedirintpositivoCalcularnumerocifras {
    public static void main(String[] args) {
        // declarar e iniciar
        Scanner t = new Scanner(System.in);
        int input;
        String cifras="";
        // pedir entero > 0
        System.out.println("Introduce un entero > 0");
        // bucle infinito hasta usuario introduce entero > 0
        for ( int i=0 ; i<2 ; i++ )
        {
            while ( t.hasNextInt() == false )
            {
                System.out.println("El valor introducido no es un entero");
                t.next();
            }
            input = t.nextInt();
            if (input>0)
            {
                // int --> String
                cifras = Integer.toString(input);
                System.out.println(input+" tiene "+cifras.length()+" cifras.");
                i+=2;
            }
            else
            {
                System.out.println("El valor introducido no es un entero positivo");
                i--;
            }
        }
        t.close();
    }
}