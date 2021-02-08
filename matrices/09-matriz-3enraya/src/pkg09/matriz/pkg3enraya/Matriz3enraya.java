package pkg09.matriz.pkg3enraya;
import java.util.Scanner;
public class Matriz3enraya
{
    public static void main(String[] args)
    {
        // definir e iniciar matriz del tablero de juego
        char[][] tablero =
        {
            {'-','-','-'},
            {'-','-','-'},
            {'-','-','-'}
        };
        
        // variables
        boolean salir = false;
        boolean pj;
        int columna;
        int fila;
        
        // iniciar programa usuario
        System.out.println("\n - INICIO -");
        
        // decidir quién comienza la partida al azar
        if(genBool())
        {
            pj=true;
        }
        else
        {
            pj=false;
        }
        
        // partida
        do
        {
            mostrarTablero(tablero);
            
            informarTurno(pj);
            
            do
            {
                System.out.println("La posición que introduzcas debe estar vacía");
                System.out.println("Dame columna");
                columna = dameIntEntre(0,2);
                System.out.println("Dame fila");
                fila = dameIntEntre(0,2);
            }
            while( checkVacio(tablero,columna,fila) == false );
            
            if (pj == true)
            {
                tablero[columna][fila] = 'O';
            }
            else
            {
                tablero[columna][fila] = 'X';
            }
            
            // chequear fin partida
            if ( check3raya(tablero) == true )
            {
                salir = true;
                dimeGanador(tablero);
            }
            
            if ( checkTablero(tablero) == true )
                {
                    salir = true;
                    System.out.println("\nNo quedan posiciones sin colocar y nadie ha ganado\n");
                    mostrarTablero(tablero);
                }
            
            // cambiar jugador
            pj = !pj;
        }
        while(!salir);
        
        // finalizar programa usuario
        System.out.println("\n - FIN -\n");
    }
    
    public static boolean genBool()
    {
        int x = (int) (Math.random()*2)+1;
        return x != 1; // if 1 -> false | if 2 -> true
    }
    
    public static void mostrarTablero(char[][] x)
    {
        System.out.println();
        for (int i=0 ; i<x.length; i++)
        {
            for (int j=0 ; j<x[i].length; j++)
            {
                System.out.print(x[i][j]+"\t");
            }
            System.out.println();
        }
    }
    
    public static void informarTurno(boolean x)
    {
        if(x==true)
        {
            System.out.println("\nEs el turno del jugador 2 (O)\n");
        }
        else
        {
            System.out.println("\nEs el turno del jugador 1 (X)\n");
        }
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
        
        do
        {
            System.out.println("El número debe estar entre "+a+" y "+b);
            input = dameInt();
        }
        while (input<a || input>b);
        
        return input;
    }
    
    public static boolean checkVacio(char[][] x, int a, int b)
    {
        if (x[a][b] == '-')
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public static boolean checkTablero(char[][] x)
    {
        boolean lleno = false;
        int vacios = 0;
        for (int i=0 ; i<x.length; i++)
        {
            for (int j=0 ; j<x[i].length; j++)
            {
                if (x[i][j] == '-')
                {
                    vacios++;
                }
            }
        }
        if (vacios==0)
        {
            lleno = true;
        }
        return lleno;
    }
    
    public static boolean check3raya(char[][] x)
    {
        // filas pj 1
        if ( x[0][0]=='X' && x[0][1]=='X' && x[0][2]=='X' )
        {
            return true;
        }
        
        if ( x[1][0]=='X' && x[1][1]=='X' && x[1][2]=='X' )
        {
            return true;
        }
        
        if ( x[2][0]=='X' && x[2][1]=='X' && x[2][2]=='X' )
        {
            return true;
        }
        
        // columnas pj 1
        if ( x[0][0]=='X' && x[1][0]=='X' && x[2][0]=='X' )
        {
            return true;
        }
        
        if ( x[0][1]=='X' && x[1][1]=='X' && x[2][1]=='X' )
        {
            return true;
        }
        
        if ( x[0][2]=='X' && x[1][2]=='X' && x[2][2]=='X' )
        {
            return true;
        }
        
        // diagonales pj 1
        if ( x[0][0]=='X' && x[1][1]=='X' && x[2][2]=='X' )
        {
            return true;
        }
        
        if ( x[0][2]=='X' && x[1][1]=='X' && x[2][0]=='X' )
        {
            return true;
        }
        
        // filas pj 2
        if ( x[0][0]=='O' && x[0][1]=='O' && x[0][2]=='O' )
        {
            return true;
        }
        
        if ( x[1][0]=='O' && x[1][1]=='O' && x[1][2]=='O' )
        {
            return true;
        }
        
        if ( x[2][0]=='O' && x[2][1]=='O' && x[2][2]=='O' )
        {
            return true;
        }
        
        // columnas pj 2
        if ( x[0][0]=='O' && x[1][0]=='O' && x[2][0]=='O' )
        {
            return true;
        }
        
        if ( x[0][1]=='O' && x[1][1]=='O' && x[2][1]=='O' )
        {
            return true;
        }
        
        if ( x[0][2]=='O' && x[1][2]=='O' && x[2][2]=='O' )
        {
            return true;
        }
        
        // diagonales pj 2
        if ( x[0][0]=='O' && x[1][1]=='O' && x[2][2]=='O' )
        {
            return true;
        }
        
        if ( x[0][2]=='O' && x[1][1]=='O' && x[2][0]=='O' )
        {
            return true;
        }
        
        return false;
    }
    
    public static void dimeGanador(char[][] x)
    {
        // filas pj 1
        if ( x[0][0]=='X' && x[0][1]=='X' && x[0][2]=='X' )
        {
            System.out.println("\nHa ganado el jugador 1\n");
            mostrarTablero(x);
        }
        
        if ( x[1][0]=='X' && x[1][1]=='X' && x[1][2]=='X' )
        {
            System.out.println("\nHa ganado el jugador 1\n");
            mostrarTablero(x);
        }
        
        if ( x[2][0]=='X' && x[2][1]=='X' && x[2][2]=='X' )
        {
            System.out.println("\nHa ganado el jugador 1\n");
            mostrarTablero(x);
        }
        
        // columnas pj 1
        if ( x[0][0]=='X' && x[1][0]=='X' && x[2][0]=='X' )
        {
            System.out.println("\nHa ganado el jugador 1\n");
            mostrarTablero(x);
        }
        
        if ( x[0][1]=='X' && x[1][1]=='X' && x[2][1]=='X' )
        {
            System.out.println("\nHa ganado el jugador 1\n");
            mostrarTablero(x);
        }
        
        if ( x[0][2]=='X' && x[1][2]=='X' && x[2][2]=='X' )
        {
            System.out.println("\nHa ganado el jugador 1\n");
            mostrarTablero(x);
        }
        
        // diagonales pj 1
        if ( x[0][0]=='X' && x[1][1]=='X' && x[2][2]=='X' )
        {
            System.out.println("\nHa ganado el jugador 1\n");
            mostrarTablero(x);
        }
        
        if ( x[0][2]=='X' && x[1][1]=='X' && x[2][0]=='X' )
        {
            System.out.println("\nHa ganado el jugador 1\n");
            mostrarTablero(x);
        }
        
        // filas pj 2
        if ( x[0][0]=='O' && x[0][1]=='O' && x[0][2]=='O' )
        {
            System.out.println("\nHa ganado el jugador 2\n");
            mostrarTablero(x);
        }
        
        if ( x[1][0]=='O' && x[1][1]=='O' && x[1][2]=='O' )
        {
            System.out.println("\nHa ganado el jugador 2\n");
            mostrarTablero(x);
        }
        
        if ( x[2][0]=='O' && x[2][1]=='O' && x[2][2]=='O' )
        {
            System.out.println("\nHa ganado el jugador 2\n");
            mostrarTablero(x);
        }
        
        // columnas pj 2
        if ( x[0][0]=='O' && x[1][0]=='O' && x[2][0]=='O' )
        {
            System.out.println("\nHa ganado el jugador 2\n");
            mostrarTablero(x);
        }
        
        if ( x[0][1]=='O' && x[1][1]=='O' && x[2][1]=='O' )
        {
            System.out.println("\nHa ganado el jugador 2\n");
            mostrarTablero(x);
        }
        
        if ( x[0][2]=='O' && x[1][2]=='O' && x[2][2]=='O' )
        {
            System.out.println("\nHa ganado el jugador 2\n");
            mostrarTablero(x);
        }
        
        // diagonales pj 2
        if ( x[0][0]=='O' && x[1][1]=='O' && x[2][2]=='O' )
        {
            System.out.println("\nHa ganado el jugador 2\n");
            mostrarTablero(x);
        }
        
        if ( x[0][2]=='O' && x[1][1]=='O' && x[2][0]=='O' )
        {
            System.out.println("\nHa ganado el jugador 2\n");
            mostrarTablero(x);
        }
    }
    
}