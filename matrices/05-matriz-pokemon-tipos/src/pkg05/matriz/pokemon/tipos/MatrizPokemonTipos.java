package pkg05.matriz.pokemon.tipos;
import java.util.Scanner;
public class MatrizPokemonTipos
{
    public static void main(String[] args)
    {
        Scanner t = new Scanner(System.in);
 
        // variables
        boolean salir = false;
        int opcion = 0, tipo1, tipo2, tipo3, num_tipos;
 
        // sacar menú y validar opcion usuario (1-5)
        do
        {
            System.out.println("Menú de opciones:");
            System.out.println("1. Mostrar debilidades");
            System.out.println("2. Mostrar eficacias");
            System.out.println("3. Mostrar toda la informacion de un tipo");
            System.out.println("4. Eficacia de un tipo a otro");
            System.out.println("5. Salir");
            System.out.println("Elije una opción");
            
            for (int i=0 ; i<3 ; i++)
            {
                while(t.hasNextInt()==false)
                {
                    System.out.println("Debes introducir un entero, try again");
                    t.next();
                }
                opcion = t.nextInt();
                
                if(opcion<1 || opcion>5)
                {
                    System.out.println("Debes introducir un valor disponible en el menú (1-5)");
                    i--;
                }
                else
                {
                    i+=3;
                }
            }
 
            switch (opcion)
            {
                case 1:
                    // pedir número de tipos y validar (solo 1 o 2 tipos)
                    do
                    {
                        System.out.println("Elije el número de tipos: 1 o 2");
                        while(t.hasNextInt()==false)
                        {
                            System.out.println("Debes introducir un entero, try again");
                            t.next();
                        }
                        num_tipos = t.nextInt();
 
                        if (!(num_tipos == 1 || num_tipos == 2)) {
                            System.out.println("Tienes que introducir 1 o 2");
                        }
 
                    }
                    while (!(num_tipos == 1 || num_tipos == 2));
 
                    // pedir 1 tipo
                    
 
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    salir = true;
                    break;
            }
        }
        while (!salir);
    }
}