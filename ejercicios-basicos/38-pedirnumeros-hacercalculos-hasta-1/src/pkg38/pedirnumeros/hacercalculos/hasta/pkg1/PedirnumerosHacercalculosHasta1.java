package pkg38.pedirnumeros.hacercalculos.hasta.pkg1;
import java.util.Scanner;
public class PedirnumerosHacercalculosHasta1
{
    public static void main(String[] args)
    {
        // declarar
        int input; // lo que mete el usuario
        Scanner t = new Scanner(System.in);
        int cuenta_error=0; // cuenta no entero metido por usuario
        int cuenta=0; // cuenta entero no -1 metido por usuario
        int mayor=-999999999;
        int menor=999999999;
        int suma_total=0;
        int suma_positivos=0;
        int suma_negativos=0;
        int media=0;
        String a = " (-1 no entra en este cálculo)";
        // inicio programa usuario
        System.out.println("INICIO PROGRAMA\n");
        /*
        bucle pide input
            si es entero no -1, cuenta intentos, calcula suma, suma+, suma-, mayor, menor y media
            si es -1, suma 3 a i haciendo bucle termine
        */
        for ( int i=0 ; i<2; i++ )
        {
            System.out.println("Introduce un entero, si es -1, el programa finaliza");
            // si no es entero, vacía buffer, cuenta 1 intento y vuelve a pedir
            while( ( t.hasNextInt() ) == false )
            {
                System.out.println("Eso no era un entero, inténtelo de nuevo");
                t.next();
                cuenta_error++;
            }
            input = t.nextInt();
            // calcular suma total (no tiene en cuenta -1)
            if(input != -1)
                {
                    suma_total += input;
                }
            // calcular suma positivos
            if (input > 0)
            {
                suma_positivos += input;
            }
            // calcular suma negativos (no tiene en cuenta 0 y -1)
            if (input < -1)
            {
                suma_negativos += input;
            }
            // determinar mayor introducido (no tiene en cuenta -1)
            if (mayor<input && input!= -1)
            {
                mayor = input;
            }
            // determinar menor introducido (no tiene en cuenta -1)
            if (menor>input && input!= -1)
            {
                menor = input;
            }
            if (input != -1)
            {
                cuenta++;
                media = suma_total/cuenta;
            }
            if (input == -1)
            {
                i+= 3;
            }
            i--;
        }
        System.out.println("\n Se han introducido "+cuenta_error+" valores que no eran enteros");
        System.out.println("\n Se han introducido "+cuenta+" enteros que no eran -1");
        System.out.println("\n El entero mayor introducido es "+mayor+a);
        System.out.println("\n El entero menor introducido es "+menor+a);
        System.out.println("\n La suma total de los enteros introducidos es "+suma_total+a);
        System.out.println("\n La suma total de los enteros positivos introducidos es "+suma_positivos+a);
        System.out.println("\n La suma total de los enteros negativos introducidos es "+suma_negativos+a);
        System.out.println("\n La media de los números introducidos es "+media+a);
        System.out.println("\n FIN PROGRAMA");
    }
}