package pkg04.matriz4x4.menu.operaciones;
import java.util.Scanner;
public class Matriz4x4MenuOperaciones
{
    public static void main(String[] args)
    {
        // instanciar clase Scanner
        Scanner t = new Scanner(System.in);
        // declar matriz y su tamaño
        int[][] m = new int[4][4];
        boolean rellena = false;
        int opcion;
        // inicio programa
        System.out.println(" - INICIO PROGRAMA -\n");
        for (int a=0 ; a<3 ; a++)
        {
            // sacar menú
            System.out.println("MENÚ:");
            System.out.println("\t1.- Rellenar matriz");
            System.out.println("\t2.- Sumar valores 1 fila");
            System.out.println("\t3.- Sumar valores 1 columna");
            System.out.println("\t4.- Sumar valores diagonal");
            System.out.println("\t5.- Sumar valores diagonal inversa");
            System.out.println("\t6.- Media valores matriz");
            System.out.println("\t7.- Salir del programa");
            System.out.println("\nElige una opción: 1, 2, 3, 4, 5, 6 y 7.");
            // asegurarse input es int
            while(t.hasNextInt()==false)
            {
                System.out.println("Debes introducir un número entero, try again");
                t.next();
            }
            opcion = t.nextInt();
            // asegurarse matriz rellena antes de operar
            if (opcion > 1 && opcion < 7 && rellena == false)
            {
                System.out.println("Para operar con la matriz, debes rellenarla antes.");
            }
            // salir bucle infinito
            else if (opcion == 7)
            {
                System.out.println("Elegiste salir del programa, adiós.");
                a+=4;
            }
            // rellenar matriz
            else if (opcion == 1 && rellena == false)
            {
                System.out.println("Elegiste rellenar matriz, vamos a ello.");
                for (int b=0 ; b<m.length ; b++)
                {
                    for (int c=0 ; c<m[b].length ; c++)
                    {
                        System.out.println("Dame matriz["+b+"]["+c+"]");
                        while(t.hasNextInt()==false)
                        {
                            System.out.println("Debes introducir un número entero, try again");
                            t.next();
                        }
                        m[b][c] = t.nextInt();
                    }
                }
                rellena = true;
            }
            // asegurarse matriz solo se rellena 1 vez
            else if (opcion == 1 && rellena == true)
            {
                System.out.println("La matriz ya estaba rellena, try again");
            }
            // operar con matriz después de que esté rellena
            if (opcion > 1 && opcion < 7 && rellena == true)
            {
                // imprimir matriz
                System.out.println("Tu matriz es:\n");
                for (int b=0 ; b<m.length ; b++)
                {
                    for (int c=0 ; c<m[b].length ; c++)
                    {
                        System.out.print(m[b][c]+"\t");
                    }
                    System.out.println();
                }
                System.out.println();
                
                if(opcion == 2)
                {
                    System.out.println("Elegiste 2.- Sumar valores 1 fila");
                    int fila=0;
                    System.out.println("¿De qué fila quieres que se sumen sus valores?");
                    
                    for (int e=0 ; e<3 ; e++)
                    {
                        while(t.hasNextInt()==false)
                        {
                            System.out.println("Debes introducir un número entero, try again");
                            t.next();
                        }
                       fila = t.nextInt();
                       if ( fila<1 || fila >4 )
                       {
                           e--;
                           fila=0;
                           System.out.println("Debes elegir una fila 1-4");
                       }
                       else {e+=4;}
                    }
                    
                    if(fila==1)
                    {
                        int suma = m[0][0] + m[0][1] + m[0][2] + m[0][3];
                        System.out.println("La suma de la fila 1 es "+suma);
                    }
                    
                    if(fila==2)
                    {
                        int suma = m[1][0] + m[1][1] + m[1][2] + m[1][3];
                        System.out.println("La suma de la fila 2 es "+suma);
                    }
                    
                    if(fila==3)
                    {
                        int suma = m[2][0] + m[2][1] + m[2][2] + m[2][3];
                        System.out.println("La suma de la fila 3 es "+suma);
                    }
                    
                    if(fila==4)
                    {
                        int suma = m[3][0] + m[3][1] + m[3][2] + m[3][3];
                        System.out.println("La suma de la fila 4 es "+suma);
                    }
                    
                }
                if(opcion == 3)
                {
                    System.out.println("Elegiste 3.- Sumar valores 1 columna");
                    int columna=0;
                    System.out.println("¿De qué columna quieres que se sumen sus valores?");
                    
                    for (int e=0 ; e<3 ; e++)
                    {
                        while(t.hasNextInt()==false)
                        {
                            System.out.println("Debes introducir un número entero, try again");
                            t.next();
                        }
                       columna = t.nextInt();
                       if ( columna<1 || columna >4 )
                       {
                           e--;
                           columna=0;
                           System.out.println("Debes elegir una fila 1-4");
                       }
                       else {e+=4;}
                    }
                    
                    if(columna==1)
                    {
                        int suma = m[0][0] + m[1][0] + m[2][0] + m[3][0];
                        System.out.println("La suma de la columna 1 es "+suma);
                    }
                    
                    if(columna==2)
                    {
                        int suma = m[0][1] + m[1][1] + m[2][1] + m[3][1];
                        System.out.println("La suma de la columna 2 es "+suma);
                    }
                    
                    if(columna==3)
                    {
                        int suma = m[0][2] + m[1][2] + m[2][2] + m[3][2];
                        System.out.println("La suma de la columna 3 es "+suma);
                    }
                    
                    if(columna==4)
                    {
                        int suma = m[0][3] + m[1][3] + m[2][3] + m[3][3];
                        System.out.println("La suma de la columna 4 es "+suma);
                    }
                }
                if(opcion == 4)
                {
                    System.out.println("Elegiste 4.- Sumar valores diagonal");
                    int suma = m[0][0] + m[1][1] + m[2][2] + m[3][3];
                    System.out.println("La suma de los valores de la diagonal es "+suma);
                }
                if(opcion == 5)
                {
                    System.out.println("Elegiste 5.- Sumar valores diagonal inversa");
                    int suma = m[0][3] + m[1][2] + m[2][1] + m[3][0];
                    System.out.println("La suma de los valores de la diagonal inversa es "+suma);
                }
                if(opcion == 6)
                {
                    System.out.println("Elegiste 6.- Media valores matriz");
                    int suma=0;
                    int divisor=0;
                    int media=0;
                    for (int b=0 ; b<m.length ; b++)
                    {
                        for (int c=0 ; c<m[b].length ; c++)
                        {
                            suma += m[b][c];
                            divisor++;
                        }
                    }
                    media = suma/divisor;
                    // System.out.println("La suma de los valores de la matriz es "+suma);
                    // System.out.println("El número de valores (divisor) de la matriz es "+divisor);
                    System.out.println("La media de los valores de la matriz es "+media);
                }
            }
            // asegurarse input usuario está en el menú
            else if (opcion<1 || opcion >7)
            {
                System.out.println("NO elegiste una opción del menú, try again");
            }
            // este decremento hace buble infinito a menos meter salir
            a--;
        }
        // fin programa
        System.out.println("\n - FIN PROGRAMA -");
    }
}