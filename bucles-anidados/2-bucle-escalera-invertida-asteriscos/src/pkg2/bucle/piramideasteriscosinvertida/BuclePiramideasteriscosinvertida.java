package pkg2.bucle.piramideasteriscosinvertida;
import java.util.Scanner;
public class BuclePiramideasteriscosinvertida
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
        int fila=altura;
        // bucle repite tantas veces como altura, cada vuelta:
        //   bucle:
        //      imprime tantos astericos en misma línea como fila(=altura)
        //   disminuye número fila (hasta 1 porque hay tantas filas como altura)
        //   salto de línea
        for (int i=0 ; i<altura ; i++)
        {
            for (int j=0 ; j<fila ; j++)
            {
                System.out.print("*");
            }
            fila--;
            System.out.println();
        }
    }
}