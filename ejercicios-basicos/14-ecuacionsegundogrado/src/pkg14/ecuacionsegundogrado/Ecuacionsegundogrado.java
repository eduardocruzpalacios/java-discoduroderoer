package pkg14.ecuacionsegundogrado;
import java.util.Scanner;
public class Ecuacionsegundogrado
{
    public static void main(String[] args)
    {
        // declarar variables
        double a, b, c, discriminante, raiz, x1, x2;
        Scanner t = new Scanner(System.in);
        // inicio programa para el usuario
        System.out.println("- PROGRAMA ECUACIONES 2º GRADO -\n");
        System.out.println("UNA ECUACIÓN DE 2º GRADO TIENE LA SIGUIENTE FORMA:\nax^2 + bx + c = f(x)\n");
        // petición a, b y c
        System.out.println("Te pediré a, b y c. Te devolveré x");
        System.out.println("Introduce a:");
        while ((t.hasNextDouble()) == false)
        {
            System.out.println("Eso no era un número, inténtelo de nuevo");
            t.next();
        }
        a = t.nextDouble();
        System.out.println("Introduce b:");
        while ((t.hasNextDouble()) == false)
        {
            System.out.println("Eso no era un número, inténtelo de nuevo");
            t.next();
        }
        b = t.nextDouble();
        System.out.println("Introduce c:");
        while ((t.hasNextDouble()) == false)
        {
            System.out.println("Eso no era un número, inténtelo de nuevo");
            t.next();
        }
        c = t.nextDouble();
        // impresión por pantalla ecuación 2º grado + info solución
        System.out.println("\nLa ecuación de 2º grado es:\n");
        System.out.println("("+a+"x^2) + ("+b+"x) + ("+c+") = f(x)");
        System.out.println("\nEl/los resultados de una ecuación de 2º grado se consiguen con la fórmula cuadrática:\n");
        System.out.println("x = ( (-b) +- raiz(b^2 - 4ac) ) / (2a)");
        // cálculo discriminante ; Δ = b^2 - 4ac
        discriminante = (b*b) - (4*a*c);
        // comprobar discriminante (Δ)
        System.out.println("\nSe procede a calcular Δ, el DISCRIMINANTE (lo que está dentro de la raíz cuadrada)");
        System.out.println("\nΔ = (b^2) - (4*a*c)");
        System.out.println("\nEn función del resultado de Δ:");
        System.out.println("\tΔ < 1 ; nº soluciones = 0");
        System.out.println("\tΔ = 0 ; nº soluciones = 1");
        System.out.println("\tΔ > 1 ; nº soluciones = 2");
        System.out.println("\nΔ = "+discriminante+"\n");
        if(discriminante==0.0)
        {
            System.out.println("Δ = 0 ; existe 1 única solución (de multiplicidad 2)\n");
            // cálculo de x1 (x2 daría el mismo resultado porque la raíz cuadrada es de 0)
            x1 = ( (b*-1) + 0 )/ ( 2*a );
            // impresión de resultado
            System.out.println("x = "+x1);
            System.out.println("\n- FIN PROGRAMA -");
        }
        else if(discriminante<0)
        {
            System.out.println("Δ < 0 ; NO existen soluciones (reales) ; no puede factorizarse");
            System.out.println("\n- FIN PROGRAMA -");
        }
        else
        {
            System.out.println("Δ > 0 ; existen 2 soluciones (reales) distintas (de multiplicidad 1)\n");
            // cálculo de x1 y x2
            x1 = ((b*-1) + (Math.sqrt(discriminante)))/(2*a);
            x2 = ((b*-1) - (Math.sqrt(discriminante)))/(2*a);
            // impresión de resultado
            System.out.println("x1 = "+x1);
            System.out.println("x2 = "+x2);
            System.out.println("\n- FIN PROGRAMA -");
        }
        t.close();
    }
}