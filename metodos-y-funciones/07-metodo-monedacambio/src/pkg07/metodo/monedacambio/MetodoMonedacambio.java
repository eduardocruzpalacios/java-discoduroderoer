package pkg07.metodo.monedacambio;
import java.util.Scanner;
public class MetodoMonedacambio
{
    public static void main(String[] args)
    {
        // pedir cantidad euros y moneda de cambio
        System.out.println("¿Cuántas euros quieres cambiar?");
        double euros = dameNum();
        String monedaCambio = dameMoneda();
        // llamada al método
        eurosCambio(euros, monedaCambio);
    }
    
    // función devuelve Real
    public static double dameNum()
    {
        Scanner t = new Scanner(System.in);
        while (t.hasNextDouble()==false)
        {
            System.out.println("Dame un número");
            t.next();
        }
        return t.nextDouble();
    }
    
    // función devuelve moneda
    public static String dameMoneda()
    {
        Scanner t = new Scanner(System.in, "ISO-8859-1");
        String m;
        boolean salir = false;
        do
        {
            System.out.println("Elige: dólares, yenes o libras");
            m = t.nextLine();
            if ( m.equals("dólares") || m.equals("yenes") || m.equals("libras") )
            {
                salir = true;
            }
        }
        while ( !salir );
    
        return m;
    }
    
    // método devuelve cambio de euros en otra moneda
    public static void eurosCambio(double x, String y)
    {
        switch(y)
        {
            case "dólares":
                double dolares = x * 1.21;
                System.out.println(x + " € = " + dolares + " $");
                break;
            case "libras":
                double libras = x * 0.88;
                System.out.println(x + " € = " + libras + " £");
                break;
            case "yenes":
                double yenes = x * 127.07;
                System.out.println(x + " € = " + yenes + " ¥");
                break;
        }
    }
}