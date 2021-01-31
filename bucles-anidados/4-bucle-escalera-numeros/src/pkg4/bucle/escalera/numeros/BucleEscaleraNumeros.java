package pkg4.bucle.escalera.numeros;
import java.util.Scanner;
public class BucleEscaleraNumeros
{
    public static void main(String[] args)
    {
        // instanciar clase Scanner y declarar altura
        Scanner t = new Scanner(System.in);
        int altura;
        // pedir altura y controlar es entero
        System.out.println("Dame la altura de la pirámide");
        while(t.hasNextInt()==false)
        {
            System.out.println("Eso no era un entero, try again!");
            t.next();
        }
        altura = t.nextInt();
        // salto de línea e iniciar número filas
        System.out.println();
        int fila=1;
        // bucle repite tantas veces como altura, cada vuelta:
        //   bucle:
        //      imprime valor fila(=fila presente) tantas veces como número fila presente
        //   aumenta número fila (nunca más número altura gracias a bucle superior)
        //   salto de línea
        for (int i=0 ; i<altura ; i++)
        {
            for (int j=1 ; j<=fila ; j++)
            {
                System.out.print(j);
            }
            fila++;
            System.out.println();
        }
    }
}