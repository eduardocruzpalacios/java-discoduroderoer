package pkg02.matriz.pedirtamano.rellenarnumerosautomaticos;
import java.util.Scanner;
public class MatrizPedirtamanoRellenarnumerosautomaticos {
    public static void main(String[] args) {
        // instanciar clase Scanner y declarar columnas
        Scanner t = new Scanner(System.in);
        int columnas=0;
        // iniciar programa usuario
        System.out.println(" - INICIO PROGRAMA -\n\nVamos a crear una matriz de 5 filas y n columnas\n");
        // pedir columnas de matriz al usuario, bucle infinito hasta int >=1
        for ( int i=0 ; i<3 ; i++)
        {
            System.out.println("¿Cuántas columnas le asignamos a la matriz?");
            while(t.hasNextInt()==false)
            {
                System.out.println("eso no era un entero, try again");
                t.next();
            }
            columnas = t.nextInt();
            if (columnas < 1)
            {
                System.out.println("el número de columnas debe ser >= 1");
                i--;
            }
            else
            {
                i+=3;
                System.out.println("Gracias, la matriz será de 5x"+columnas+":\n");
            }
        }
        // declarar matriz y su tamaño
        int[][] matriz = new int[5][columnas];
        // rellenar matriz con números aleatorios entre 0 y 10
        for ( int a=0 ; a<matriz.length ; a++ )
        {
            for ( int b=0 ; b<matriz[a].length ; b++)
            {
                // casting double --> int
                matriz[a][b] = (int) (Math.random()*10);
            }
        }
        // mostrar matriz
        for ( int a=0 ; a<matriz.length ; a++ )
        {
            for ( int b=0 ; b<matriz[a].length ; b++)
            {
                System.out.print(matriz[a][b]+"\t");
            }
            System.out.println();
        }
        // finalizar programa usuario
        System.out.println("\n - FIN PROGRAMA -");
    }
}