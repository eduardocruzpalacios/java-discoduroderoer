package pkg13.pedir.tamanoarray.pedirvaloresposiciones;
import java.util.Scanner;
public class PedirTamanoarrayPedirvaloresposiciones
{
    public static void main(String[] args)
    {
        // pedir nº posiciones Array
        Scanner t = new Scanner(System.in);
        System.out.println("Dame un entero que será el número de ventas");
        // declarar variable donde guardar input usuario
        int n;
        // asegurarse usuario da entero
        while (t.hasNextInt() == false)
        {
            System.out.println("Eso NO era un ENTERO");
            t.next();
        }
        n = t.nextInt();
        
        float[] ventas = new float[n];
        float suma=0;
        // recorrer Array y meter inputs usuario en posiciones asegurándose son float y sumando las ventas
        for ( int i=0 ; i<ventas.length ; i++ )
        {
            System.out.println("Dame la venta "+(i+1));
            while (t.hasNextFloat() == false)
            {
                System.out.println("Eso NO era un número");
                t.next();
            }
            ventas[i] = t.nextFloat();
            suma += ventas[i];
        }
        
        System.out.println("La suma de las ventas es: "+suma);
    }
}