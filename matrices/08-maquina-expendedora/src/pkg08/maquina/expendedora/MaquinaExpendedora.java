package pkg08.maquina.expendedora;
import java.util.Scanner;
public class MaquinaExpendedora
{
    public static void main(String[] args)
    {   // datos
        String[][] golosinas =
        {
            {"KitKat","Chicles de fresa","Lacasitos","Palotes"},
            {"Kinder Bueno","Bolsa variada Haribo","Chetoos","Twix"},
            {"Kinder Bueno","M&M'S","Papa Delta","Chicles de menta"},
            {"Lacasitos","Crunch","Milkybar","KitKat"}
        };
 
        double[][] precio =
        {
            {1.1,0.8,1.5,0.9},
            {1.8,1,1.2,1},
            {1.8,1.3,1.2,0.8},
            {1.5,1.1,1.1,1.1}
        };
        
        int[][] cantidad =
        {
            {5,5,5,5},
            {5,5,5,5},
            {5,5,5,5},
            {5,5,5,5}
        };
        // instanciar clase Scanner
        Scanner t = new Scanner(System.in);
        // variables
        boolean salir = false;
        int opcion;
        int columna;
        int fila;
        int pedidas=0;
        double gasto=0;
        String pass;
        int reponer;
        // iniciar programa usuario
        System.out.println("\n - MÁQUINA EXPENDEDORA -");
        
        do
        {
            menu();
            opcion = dameIntEntre(1,4);
            
            switch (opcion)
            {
                case 1:
                    imprimirPrograma1();
                    System.out.println("Dame columna");
                    columna = dameIntEntre(1,4);
                    columna--;
                    System.out.println("Dame fila");
                    fila = dameIntEntre(1,4);
                    fila--;
                    System.out.println("Has elegido 1 "+golosinas[fila][columna]);
                    if (cantidad[fila][columna]>0)
                    {
                        pedidas++;
                        System.out.println("Has comprado "+pedidas+" golosinas");
                        gasto += precio[fila][columna];
                        System.out.println("Ya has gastado "+gasto+"€");
                        cantidad[fila][columna] = cantidad[fila][columna] - 1;
                        System.out.println("Quedan "+cantidad[fila][columna]+" "+golosinas[fila][columna]);
                    }
                    else
                    {
                        System.out.println("No quedan golosinas en esa localización de la máquina expendedora");
                    }
                    break;
                case 2:
                    imprimirPrograma2();
                    for ( int a=0 ; a<golosinas.length ; a++ )
                    {
                        for ( int b=0 ; b<golosinas[a].length ; b++ )
                        {
                            System.out.print("Columna/Fila: "+(a+1)+"/"+(b+1));
                            System.out.print(" - Golosina: "+golosinas[a][b]);
                            System.out.print(" - Precio: "+precio[a][b]);
                            System.out.print(" - Cantidad: "+cantidad[a][b]);
                            System.out.print("\t");
                        }
                        System.out.println("\n");
                    }
                    break;
                case 3:
                    imprimirPrograma3();
                    pass = t.nextLine();
                    if( checkPassword(pass) )
                    {
                        System.out.println("Contraseña CORRECTA");
                        System.out.println("Ahora debes introducir qué golosina quieres reponer");
                        System.out.println("Dame columna");
                        columna = dameIntEntre(1,4);
                        columna--;
                        System.out.println("Dame fila");
                        fila = dameIntEntre(1,4);
                        fila--;
                        System.out.println("¿Cuántas golosinas "+golosinas[fila][columna]+" quieres añair a la máquina");
                        reponer = dameIntPositivo();
                        System.out.println("Antes había "+cantidad[fila][columna]+" "+golosinas[fila][columna]);
                        cantidad[fila][columna] += reponer;
                        System.out.println("Ahora hay "+cantidad[fila][columna]+" "+golosinas[fila][columna]);
                    }
                    else
                    {
                        System.out.println("Contraseña INCORRECTA");
                    }    
                    break;
                case 4:
                    salir = true;
                    break;
            }
            
        }
        while(!salir);
        
        // finalizar programa usuario
        System.out.println("\n - FIN PROGRAMA -\n");
    }
    
    // método sacar menú
    public static void menu()
    {
        System.out.println("\nMENÚ");
        System.out.println("\t1. Pedir golosina (comprar)");
        System.out.println("\t2. Mostrar golosinas");
        System.out.println("\t3. Reponer golosinas");
        System.out.println("\t4. Apagar máquina expendedora");
        System.out.println("\nElige una opción del menú: 1, 2, 3 o 4");
    }
    
    // función pedir int y garantizar es input es int
    public static int dameInt()
    {
        Scanner t = new Scanner(System.in);
        while(t.hasNextInt()==false)
        {
            System.out.println("Debes introducir un número entero, try again");
            t.next();
        }
        return t.nextInt();
    }
    
    // función pedir int y garantizar input es int y está entre un rango de valores
    public static int dameIntEntre(int a,int b)
    {
        int input;
        // poner el valor valor mínimo como rango inferior
        if (a>b)
        {
            int auxiliar = b;
            b = a;
            a = auxiliar;
        }
        input = dameInt();
        while (input<a || input>b)
        {
            System.out.println("El número debe estar entre "+a+" y "+b);
            input = dameInt();
        }
        return input;
    }
    
    // función pedir int que garantiza input es int e int > 0
    public static int dameIntPositivo()
    {
        int input;
        input = dameInt();
        while (input<=0)
        {
            System.out.println("Tu reposición debe ser >= 0");
            input = dameInt();
        }
        return input;
    }
    
    // info programa 1
    public static void imprimirPrograma1()
    {
        System.out.println("\nHas elegido pedir una golosina");
        System.out.println("¿Qué golosina quieres?");
    }
    
    // info programa 2
    public static void imprimirPrograma2()
    {
        System.out.println("\nHas elegido mostrar golosinas\n");
    }
    
    // info programa 3
    public static void imprimirPrograma3()
    {
        System.out.println("\nHas elegido reponer golosinas");
        System.out.println("Esta opción es exclusiva de personal autorizado");
        System.out.println("Introduce la contraseña");
    }
    
    // función comprobar password
    public static boolean checkPassword(String x)
    {
        return x.equals("MaquinaExpendedora2021");
    }
}