package pkg6.piramide.invertida.asteriscos;
import java.util.Scanner;
public class PiramideInvertidaAsteriscos {
    public static void main(String[] args) {
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
        /* para que la pirámide parezca tal y sea invertida hay que
           imprimir tantos asteriscos como (altura*2)-1
           cada nueva fila
               reducir número * en 2
               imprimir un espacio delate de * (y +1 más cada nueva fila)
        */
        espacios=0;
        // salto de línea e iniciar número filas
        System.out.println();
        int fila=(altura*2)-1;
        // bucle repite tantas veces como altura, cada vuelta:
        //   sub-bucle 1:
        //      imprime tantos espacios como variable espacios (+1 cada fila)
        //   sub-bucle 2:
        //      imprime tantos asteriscos como (altura*2)-1
        //   reduce fila en 2 (asteriscos disminuyen en valor de 2)
        //   aumenta espacios en 1
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
            fila-=2;
            espacios++;
            System.out.println();
        }
    }
}