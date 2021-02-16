package pkg02.metodo.numerosaleatorios;
import java.util.Scanner;
public class MetodoNumerosaleatorios
{
    public static void main(String[] args) 
    {
        int nA, extremo1, extremo2;
        
        System.out.println("¿Cuántos números aleatorios generamos?");
        nA = dameInt();
        
        System.out.println("Dame un extremo");
        extremo1 = dameInt();
        
        System.out.println("Dame otro extremo");
        extremo2 = dameInt();
        
        aleatoriosEntre(extremo1,extremo2,nA);
    }
    
    // función devuelve int
    public static int dameInt()
    {
        Scanner t = new Scanner(System.in);
        while (t.hasNextInt()==false)
        {
            System.out.println("Dame un entero");
            t.next();
        }
        return t.nextInt();
    }
    
    // método genera n aleatorios entre min y max
    public static void aleatoriosEntre(int min, int max, int n)
    {
        // declarar y definir tamaño(= número aleatorios) donde guardar los aleatorios
        int[] vector = new int[n];
        
        // localizar mínimo y máximo
        if (min>max)
        {
            int aux = min;
            min = max;
            max = aux;
        }
        
        // generar aleatorios dentro de vector entre min y max
        for (int i=0 ; i<vector.length ; i++)
        {
            vector[i] = (int) (Math.random()* max)+min + ((int) Math.random()*min ) ;
            
            System.out.println(vector[i]);
        }
    }
}