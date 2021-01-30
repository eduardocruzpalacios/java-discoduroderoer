package pkg27.pedirint.hasta.pkg1;
import java.util.Scanner;
public class PedirintHasta1
{
    public static void main(String[] args)
    {
        // declarar
        int input;
        Scanner t = new Scanner(System.in);
        int cuenta_error=0; // cuenta no entero metido por usuario
        int cuenta=0; // cuenta entero no -1 metido por usuario
        // inicio programa usuario
        System.out.println("INICIO PROGRAMA\n");
        /*
        bucle pide input
            si no es entero, cuenta 1 intento y vuelve a pedir
            si es entero no -1, cuenta 1 y resta-1 a i haciendo bucle infinito hasta introducir -1
            si es -1, suma 3 a i haciendo bucle termine
        */
        for ( int i=0 ; i<2; i++ )
        {
            System.out.println("Introduce un entero, si es -1, el programa finaliza");
            while( ( t.hasNextInt() ) == false )
            {
                System.out.println("Eso no era un entero, inténtelo de nuevo");
                t.next();
                cuenta_error++;
            }
            input = t.nextInt();
            if (input != -1)
            {
                cuenta++;
            }
            if (input == -1)
            {
                i+= 3;
            }
            i--;
        }
        System.out.println("\n Antes de introducir -1, se han introducido "+cuenta_error+" valores que no eran enteros");
        System.out.println("\n Antes de introducir -1, se han introducido "+cuenta+" enteros que no eran -1");
        System.out.println("\n FIN PROGRAMA");
    }
}