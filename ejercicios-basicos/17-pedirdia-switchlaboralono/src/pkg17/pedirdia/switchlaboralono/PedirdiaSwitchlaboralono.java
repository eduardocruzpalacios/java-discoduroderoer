package pkg17.pedirdia.switchlaboralono;
import java.util.Scanner;
public class PedirdiaSwitchlaboralono
{
    public static void main(String[] args)
    {
        // declarar variables
        Scanner t = new Scanner(System.in, "ISO-8859-1"); // "ISO-8859-1" soluciona el problema de caracteres
        String input;
        // comienza el programa para el usuario
        System.out.println("Introduce un día de la semana y te diré si es laboral o no");
        // pedimos día de la semana y lo convertirmos a minúsculas
        input = t.nextLine().toLowerCase();
        // condicional
        switch(input)
        {
            case "lunes":
            case "martes":
            case "miercoles":
            case "miércoles":
            case "jueves":
            case "viernes":
                System.out.println(input+" es un día laboral");
                break;
            case "sabado":
            case "sábado":
            case "domingo":
                System.out.println(input+" no es un día laboral");
                break;
            default:
                System.out.println("Quizá no se introdujó un día de la semana");
        }
        t.close();
    }
}