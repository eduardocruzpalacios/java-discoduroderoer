package pkg05.calculoareacirculo;
import java.util.Scanner;
public class Calculoareacirculo {
    public static void main(String[] args) {
        // pedir radio
        Scanner t = new Scanner(System.in);
        System.out.println("Introduce un radio");
        while (t.hasNextDouble()==false)
        {
            System.out.println("Introduce un radio (DEBE SER UN NÚMERO)");
            t.next();
        }
        double radio = t.nextDouble();
  
        // calcular radio usando métodos clase Math
        double area = ( Math.PI ) * ( Math.pow(radio,2) );
  
        System.out.println("El area del circulo es "+area);
        t.close();
    }
}