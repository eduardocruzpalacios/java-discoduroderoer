package pkg01.metodos.calcular.area.figuras;
import java.util.Scanner;
public class MetodosCalcularAreaFiguras
{
    public static void main(String[] args)
    {
        int opcion=0;
        do
        {
            System.out.println("MENU - CALCULAR ÁREA\n");
            System.out.println("1. Círculo");
            System.out.println("2. Triángulo");
            System.out.println("3. Cuadrado");
            System.out.println("4. Salir");
            System.out.println("\nElige: 1, 2, 3 o 4");
            opcion = dameIntEntre(1,4);
            
            switch(opcion)
            {
                case 1:
                    circulo();
                    break;
                case 2:
                    triangulo();
                    break;
                case 3:
                    cuadrado();
                    break;
                default:
                    System.out.println("SALIR");
                    break;
            }
        }
        while(opcion !=4);
    }
    
    public static void circulo()
    {
        System.out.println("CÍRCULO\n");
        System.out.println("Dame el radio");
        double radio = dameReal();
        System.out.println("el área del círculo es "+(radio*radio*Math.PI));
    }
    
    public static void triangulo()
    {
        System.out.println("TRIÁNGULO\n");
        System.out.println("Dame la base");
        double base = dameReal();
        System.out.println("Dame la altura");
        double altura = dameReal();
        System.out.println("el área del triángulo es "+(base*altura/2));
    }
    
    public static void cuadrado()
    {
        System.out.println("CUADRADO\n");
        System.out.println("Dame un lado");
        double lado = dameReal();
        System.out.println("el área del cuadrado es "+lado*lado);
    }
    
    public static int dameIntEntre(int a, int b)
    {
        int input;
        
        do
        {
            System.out.println("Dame un número entre "+a+" y "+b);
            input = (int) dameReal();
        }
        while (input<a || input>b);
        
        return input;
    }
    
    public static double dameReal()
    {
        Scanner t = new Scanner(System.in);
        
        while(t.hasNextDouble()==false)
        {
            System.out.println("Debes introducir un número, try again");
            t.next();
        }
        return t.nextInt();
    }
}