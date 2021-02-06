package pkg07.matriz3x3automaticasinrepetir.sumarfilaocolumnaaleatoria;
import java.util.Arrays;
public class Matriz3x3automaticasinrepetirSumarfilaocolumnaaleatoria
{
    public static void main(String[] args) {
        // matriz 3x3 de momento posiciones vacías
        int[][] matriz = new int [3][3];
        
        // vector mismo tamaño número posiciones matriz
        int[] numeros = generarNumerosAleatoriosSinRepetir(matriz.length*matriz[0].length);
         
        // bucle recorre matriz y le asigna una posición igual al vector
        for ( int i=0 ; i<matriz.length ; i++ )
        {
            for ( int j=0 ; j<matriz[0].length ; j++ )
            {
                matriz[i][j] = numeros[ ( matriz.length * i ) + j ];
                /* posiciones que se rellenan con numeros[ ( matriz.length * i ) + j ]
                j es 0-2 porque en bucle 2 condición es j<matriz[0].length y no j<matriz[i].length
                
                (3 * 0) + 0 = 0
                (3 * 0) + 1 = 1
                (3 * 0) + 2 = 2
                
                (3 * 1) + 0 = 3
                (3 * 1) + 1 = 4
                (3 * 1) + 2 = 5
                
                (3 * 2) + 0 = 6
                (3 * 2) + 1 = 7
                (3 * 2) + 2 = 8
                
                */
                System.out.print(matriz[i][j]+"\t");
            }
            System.out.println("\n");
        }
        
        // elegir fila (0) o columna(1) -- elegir nº fila o columna
        int foc = (int) (Math.random()*2);
        int p = (int) ((Math.random()*3)+1);
        // sumar
        int suma=0;
         System.out.print("Suma de la ");
        if (foc == 0)
        {
            System.out.print("Fila ");
        }
        else
        {
            System.out.print("Columna ");
        }
        
        System.out.print(p+": ");
        
        if ( foc == 0 && p == 1 )
        {
            suma += matriz[0][0] + matriz[0][1] + matriz[0][2];
        }
        else if ( foc == 0 && p == 2 )
        {
            suma += matriz[1][0] + matriz[1][1] + matriz[1][2];
        }
        else if ( foc == 0 && p == 3 )
        {
            suma += matriz[2][0] + matriz[2][1] + matriz[2][2];
        }
        else if ( foc == 1 && p == 1 )
        {
            suma += matriz[0][0] + matriz[1][0] + matriz[2][0];
        }
        else if ( foc == 1 && p == 2 )
        {
            suma += matriz[0][1] + matriz[1][1] + matriz[2][1];
        }
        else if ( foc == 1 && p == 3 )
        {
            suma += matriz[0][2] + matriz[1][2] + matriz[2][2];
        }
        System.out.println(suma);
    }
    
    // función que pide longitud y devuelve vector con números aleatorios que no se repiten 
    public static int[] generarNumerosAleatoriosSinRepetir(int longitud){
            // cuenta números no iguales
            int numero_elementos = 0;
            // definir vector que la función devolverá
            int numeros[] = new int[longitud];
            // declarar donde se guardará cada aleatorio generado y boolean de control
            int aleatorio;
            boolean encontrado;
            
            // RECOMENDACIÓN: rellenar Array con un número nunca va a generarse (este caso es -1)
            Arrays.fill(numeros, -1);
             
            // Cuando número elementos = longitud Array, salir bucle
            while (numero_elementos<longitud)
            {
                // genera aleatorio
                aleatorio = (int) (Math.random()*10);
                // desactiva boolean control
                encontrado=false;            
 
                // buscar si número existe, si es repetido activa boolean control
                for( int i=0 ; i<numeros.length && !encontrado ; i++ )
                {
                    if(aleatorio==numeros[i])
                    {
                        encontrado=true;
                    }
                }
                 
                // si no repetido (boolean control sigue desactivado), se añade a vector e incrementa cuenta
                if(!encontrado)
                {
                    numeros[numero_elementos] = aleatorio;
                    numero_elementos++;
                }
            }
             
            return numeros;
    }
}