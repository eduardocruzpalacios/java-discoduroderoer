package pkg03.matrices.sumar;
public class MatricesSumar
{
    public static void main(String[] args)
    {
        // tamaño matrices
        int tm = 3;
        // declarar matrices y su tamaño
        int[][] matriz1 = new int[tm][tm];
        int[][] matriz2 = new int[tm][tm];
        int[][] matriz3 = new int[tm][tm];
        // iniciar programa usuario
        System.out.println(" - INICIO PROGRAMA -\n");
        // rellenar matrices 1 y 2 con números aleatorios 0-10, sumarlas en matriz3
        for ( int a=0 ; a<matriz1.length ; a++ )
        {
            for ( int b=0 ; b<matriz1[a].length ; b++)
            {
                // casting double --> int
                matriz1[a][b] = (int) (Math.random()*10);
                matriz2[a][b] = (int) (Math.random()*10);
                // matriz3 = matriz1+matriz2
                matriz3[a][b] = matriz1[a][b]+matriz2[a][b];
            }
        }
        // mostrar matriz1
        System.out.println("MATRIZ 1\n");
        for ( int a=0 ; a<matriz1.length ; a++ )
        {
            for ( int b=0 ; b<matriz1[a].length ; b++)
            {
                System.out.print(matriz1[a][b]+"\t");
            }
            System.out.println();
        }
        // mostrar matriz2
        System.out.println("\nMATRIZ 2\n");
        for ( int a=0 ; a<matriz2.length ; a++ )
        {
            for ( int b=0 ; b<matriz2[a].length ; b++)
            {
                System.out.print(matriz2[a][b]+"\t");
            }
            System.out.println();
        }
        // mostrar matriz3
        System.out.println("\nMATRIZ 3 = MATRIZ 1 + MATRIZ 2\n");
        for ( int a=0 ; a<matriz3.length ; a++ )
        {
            for ( int b=0 ; b<matriz3[a].length ; b++)
            {
                System.out.print(matriz3[a][b]+"\t");
            }
            System.out.println();
        }
        // finalizar programa usuario
        System.out.println("\n - FIN PROGRAMA -");
    }
}