package pkg37.enummes;
import java.util.Scanner;
public class Enummes
{
    public static void main(String[] args)
    {
        Scanner t = new Scanner(System.in);
        
        // instanciar enum Meses con nombre mes3 y tenga propiedades MARZO (orden 3, numDias 31)
        Meses mes3 = Meses.MARZO;
        // imprimir instania Meses llamada mes3 OR llamar método .toString()
        System.out.println(mes3);
        
        // instanciar enum Meses como ARrray y almacenar sus valores
        Meses[] meses = Meses.values();
        // pedir un número de días
        System.out.println("Escribe un numero de días");
        int dias = t.nextInt();
        // recorrer Array de enum Meses
        //    si número días coincide con un mes, imprimir .toString()
        for(int i=0;i<meses.length;i++)
        {
            if(meses[i].getNumDias()==dias)
            {
                System.out.println(meses[i].toString());
            }
        }
    }
}