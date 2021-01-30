package pkg09.pedirprecio.calculariva;
import java.util.Scanner;
public class PedirprecioCalculariva {
    public static void main(String[] args) {
        final double iva = 1.21;
        // pedir precio
        Scanner t = new Scanner(System.in);
        System.out.println("Introduce un precio SIN IVA");
        while (t.hasNextDouble()==false)
        {
            System.out.println("debes escribir un número");
            t.next();
        }
        double precio_sin_iva = t.nextDouble();
        
        double precio_con_iva = precio_sin_iva*iva;
        
        System.out.println("precio con IVA: "+precio_con_iva);
    }
}