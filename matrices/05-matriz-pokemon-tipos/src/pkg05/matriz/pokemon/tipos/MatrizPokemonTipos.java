package pkg05.matriz.pokemon.tipos;
import java.util.Scanner;
public class MatrizPokemonTipos
{
    public static void main(String[] args)
    {
        // datos
        double[][] datos =
        {
        
        // datos[atancante][defensor]
        /*ACERO   AGUA   BICHO   DRAGON   ELÉC   FANT   FUEGO   HADA   HIELO   LUCHA   NORMAL   PLANTA   PSI   ROCA   SINIE  TIERRA   VENENO   VOLADOR   */
                                                                                                                                                    // atacante
        { 0.5   , 0.5  ,   1   ,   1    , 0.5  ,  1   ,  0.5   ,  2  ,   2   ,   1   ,    1    ,   1   ,  1   ,  2  ,   1   ,   1   ,    1   ,   1},// ACERO
        {  1    , 0.5  ,   1   ,  0.5   ,  1   ,  1   ,   2    ,  1  ,   1   ,   1   ,    1    ,  0.5  ,  1   ,  2  ,   1   ,   2   ,    1   ,   1},// AGUA
        { 0.5   ,  1   ,   1   ,   1    ,  1   , 0.5  ,  0.5   , 0.5 ,   1   ,  0.5  ,    1    ,   2   ,  2   ,  1  ,   2   ,   1   ,   0.5  ,  0.5},// BICHO
        { 0.5   ,  1   ,   1   ,   2    ,  1   ,  1   ,   1    ,  0  ,   1   ,   1   ,    1    ,   1   ,  1   ,  1  ,   1   ,   1   ,    1   ,   1},// DRAGÓN
        {  1    ,  2   ,   1   ,  0.5   , 0.5  ,  1   ,   1    ,  1  ,   1   ,   1   ,    1    ,  0.5  ,  1   ,  1  ,   1   ,   0   ,    1   ,   2},// ELÉCTRICO
        {  1    ,  1   ,   1   ,   1    ,  1   ,  2   ,   1    ,  1  ,   1   ,   1   ,    0    ,   1   ,  2   ,  1  ,  0.5  ,   1   ,    1   ,   1},// FANTASMA
        {  2    , 0.5  ,   2   ,  0.5   ,  1   ,  1   ,  0.5   ,  1  ,   2   ,   1   ,    1    ,   2   ,  1   , 0.5 ,   1   ,   1   ,    1   ,   1},// FUEGO
        { 0.5   ,  1   ,   1   ,   2    ,  1   ,  1   ,  0.5   ,  1  ,   1   ,   2   ,    1    ,   1   ,  1   ,  1  ,   2   ,   1   ,   0.5  ,   1},// HADA
        { 0.5   , 0.5  ,   1   ,   2    ,  1   ,  1   ,  0.5   ,  1  ,  0.5  ,   1   ,    1    ,   2   ,  1   ,  1  ,   1   ,   2   ,    1   ,   2},// HIELO
        {  2    ,  1   ,  0.5  ,   1    ,  1   ,  0   ,   1    , 0.5 ,   2   ,   1   ,    2    ,   1   , 0.5  ,  2  ,   2   ,   1   ,   0.5  ,  0.5},// LUCHA
        { 0.5   ,  1   ,   1   ,   1    ,  1   ,  0   ,   1    ,  1  ,   1   ,   1   ,    1    ,   1   ,  1   , 0.5 ,   1   ,   1   ,    1   ,   1},// NORMAL
        { 0.5   ,  2   ,  0.5  ,  0.5   ,  1   ,  1   ,  0.5   ,  1  ,   1   ,   1   ,    1    ,  0.5  ,  1   ,  2  ,   1   ,   2   ,   0.5  ,  0.5},// PLANTA
        { 0.5   ,  1   ,   1   ,   1    ,  1   ,  1   ,   1    ,  1  ,   1   ,   2   ,    1    ,   1   , 0.5  ,  1  ,   0   ,   1   ,    2   ,   1},// PSÍQUICO
        { 0.5   ,  1   ,   2   ,   1    ,  1   ,  1   ,   2    ,  1  ,   2   ,  0.5  ,    1    ,   1   ,  1   ,  1  ,   1   ,  0.5  ,    1   ,   2},// ROCA
        {  1    ,  1   ,   1   ,   1    ,  1   ,  2   ,   1    , 0.5 ,   1   ,  0.5  ,    1    ,   1   ,  2   ,  1  ,  0.5  ,   1   ,    1   ,   1},// SINIESTRO
        {  2    ,  1   ,  0.5  ,   1    ,  2   ,  1   ,   2    ,  1  ,   1   ,   1   ,    1    ,  0.5  ,  1   ,  2  ,   1   ,   1   ,    2   ,   0},// TIERRA
        {  0    ,  1   ,   1   ,   1    ,  1   , 0.5  ,   1    ,  2  ,   1   ,   1   ,    1    ,   2   ,  1   , 0.5 ,   1   ,  0.5  ,   0.5  ,   1},// VENENO
        { 0.5   ,  1   ,   2   ,   1    , 0.5  ,  1   ,   1    ,  1  ,   1   ,   2   ,    1    ,   2   ,  1   , 0.5 ,   1   ,   1   ,    1   ,   1}// VOLADOR
        
        };
        
        String[] tipos = // posiciones: 18 (0-17)
        {
                            "ACERO",
                            "AGUA",
                            "BICHO",
                            "DRAGON",
                            "ELECTRICO",
                            "FANTASMA",
                            "FUEGO",
                            "HADA",
                            "HIELO",
                            "LUCHA",
                            "NORMAL",
                            "PLANTA",
                            "PSIQUICO",
                            "ROCA",
                            "SINIESTRO",
                            "TIERRA",
                            "VENENO",
                            "VOLADOR"
        };
        
        // declarar Scanner
        Scanner t = new Scanner(System.in);
 
        // variables
        boolean salir = false;
        int opcion = 0, tipoAtaque, tipoPokemon1, tipoPokemon2;
        double multiplicador = 1;
 
        // inicio programa usuario
        System.out.println("\n - CALCULADORA DAÑO ATAQUES POKÉMON -\n");
        
        do
        {
            // sacar menú y validar opcion usuario (1-5)
            System.out.println("Menú de opciones:");
            System.out.println("\t1. ATAQUE TIPO X --> 1 Pokémon TIPO X");
            System.out.println("\t2. ATAQUE TIPO X --> 1 Pokémon TIPO X e Y");
            System.out.println("\t3. ATAQUE TIPO X --> listado todos los tipos");
            System.out.println("\t4. Salir");
            System.out.println("Elije una opción");
            
            for (int i=0 ; i<3 ; i++)
            {
                while(t.hasNextInt()==false)
                {
                    System.out.println("Debes introducir un entero, try again");
                    t.next();
                }
                opcion = t.nextInt();
                
                if(opcion<1 || opcion>4)
                {
                    System.out.println("Debes introducir un valor disponible en el menú (1-4)");
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
                    
                    System.out.println("\nATAQUE TIPO X --> 1 Pokémon TIPO X\n");
                    // pedir tipo ataque
                    System.out.println("Dame Ataque");
                    tipoAtaque = pedirtipo();
                    // pedir tipo pokemon
                    System.out.println("Dame tipo Pokémon defensor");
                    tipoPokemon1 = pedirtipo();
                    
                    multiplicador *= datos[tipoAtaque][tipoPokemon1];
                    // imprimir multiplicador de daño ataque tipo X --> pokemon tipo X
                    System.out.println("\nAtaque "+tipos[tipoAtaque]+" --> Pokémon "+tipos[tipoPokemon1]);
                    System.out.println("\tDAÑO * "+multiplicador);
                    
                    break;
                    
                case 2:
                    
                    System.out.println("\nATAQUE TIPO X --> 1 Pokémon TIPOS X e Y\n");
                    // pedir tipo ataque
                    System.out.println("Dame tipo Ataque");
                    tipoAtaque = pedirtipo();
                    // pedir tipos pokemon
                    System.out.println("Dame tipo 1 Pokémon defensor");
                    tipoPokemon1 = pedirtipo();
                    System.out.println("Dame tipo 2 Pokémon defensor");
                    tipoPokemon2 = pedirtipo();
                    
                    multiplicador *= datos[tipoAtaque][tipoPokemon1] * datos[tipoAtaque][tipoPokemon2];
                    // imprimir multiplicador de daño ataque tipo X --> pokemon tipos X e Y
                    System.out.print("\nAtaque "+tipos[tipoAtaque]+" --> Pokémon "+tipos[tipoPokemon1]+"-"+tipos[tipoPokemon2]);
                    System.out.println("\tDAÑO * "+multiplicador+"\n");
                    
                    break;
                    
                case 3:
                    
                    System.out.println("\nATAQUE TIPO X --> listado todos los tipos\n");
                    // pedir tipo ataque
                    System.out.println("Dame tipo Ataque");
                    tipoAtaque = pedirtipo();
                    
                    // mostrar multiplicador de ataque
                    System.out.println("Multiplicador de eficacia según el tipo del defensor:");
                    for (int a=0 ; a<datos.length ; a++)
                    {
                        multiplicador *= datos[tipoAtaque][a];
                        System.out.println("\tSi "+tipos[tipoAtaque]+" ataca "+tipos[a]+", daño es * "+multiplicador+"\n");
                        multiplicador = 1;
                    }
                    
                    break;
                   
                case 5:
                    // salir del Switch
                    salir = true;
                    break;
            }
        }
        while (!salir);
    }
    
    // función para pedir un tipo de 1 pokémon
    public static int pedirtipo()
    {
        String[] tipos = // posiciones: 18 (0-17)
        {
                            "ACERO",
                            "AGUA",
                            "BICHO",
                            "DRAGON",
                            "ELECTRICO",
                            "FANTASMA",
                            "FUEGO",
                            "HADA",
                            "HIELO",
                            "LUCHA",
                            "NORMAL",
                            "PLANTA",
                            "PSIQUICO",
                            "ROCA",
                            "SINIESTRO",
                            "TIERRA",
                            "VENENO",
                            "VOLADOR"
        };
        Scanner t = new Scanner(System.in);
        String input;
        int x=0;
        
        System.out.println("Lista de tipos:");
        for (int i=0 ; i<tipos.length ; i++)
        {
            System.out.println("\t"+tipos[i]);
        }
        
        System.out.println("Dame el tipo");
        for (int i=0 ; i<3 ; i++)
        {
            int cuenta = 0;
            input = t.nextLine().toUpperCase();
            for (int j=0 ; j<tipos.length ; j++)
            {
                if(input.equals(tipos[j]))
                {
                    System.out.println("Has elegido el tipo "+tipos[j]);
                    x=j;
                    i+=3;
                }
                else
                {
                    cuenta++;
                }
            }
            if(cuenta==18)
            {
                System.out.println("El tipo introducido no está en la lista");
                i--;
            }
        }
        return x;
    }
}