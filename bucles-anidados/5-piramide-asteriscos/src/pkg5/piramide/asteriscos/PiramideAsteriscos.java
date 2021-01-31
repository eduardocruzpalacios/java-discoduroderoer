package pkg5.piramide.asteriscos;
import java.util.Scanner;
public class PiramideAsteriscos
{
    public static void main(String[] args)
    {
        // instanciar clase Scanner y declarar altura y espacios
        Scanner t = new Scanner(System.in);
        int altura;
        int espacios;
        // pedir altura y controlar es entero
        System.out.println("Dame la altura de la pirámide");
        while(t.hasNextInt()==false)
        {
            System.out.println("Eso no era un entero, try again!");
            t.next();
        }
        altura = t.nextInt();
        /* para que la pirámide parezca tal hay que imprimir tantos espacios
           delante del primer asterisco como altura-1
           y en cada nueva fila poner un espacio menos
           así parece que es una pirámide
           cuando hemos rellenado la parte izquierda de espacios
        */
        espacios=altura-1;
        // salto de línea e iniciar número filas
        System.out.println();
        int fila=1;
        // bucle repite tantas veces como altura, cada vuelta:
        //   sub-bucle 1:
        //      imprime tantos espacios como altura-1
        //   sub-bucle 2:
        //      imprime tantos asteriscos como valor fila
        //   aumenta fila en 2 (asteriscos aumentan en valor de 2)
        //   reduce espacios en 1
        //   salto de línea
        for (int i=0 ; i<altura ; i++)
        {
            for (int k=1 ; k<=espacios ; k++)
            {
                System.out.print(" ");
            }
            
            for (int j=1 ; j<=fila ; j++)
            {
                System.out.print("*");
            }
            fila+=2;
            espacios--;
            System.out.println();
        }
    }
}