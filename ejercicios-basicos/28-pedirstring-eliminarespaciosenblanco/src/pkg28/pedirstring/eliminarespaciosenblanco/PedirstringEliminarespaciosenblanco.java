package pkg28.pedirstring.eliminarespaciosenblanco;
import java.util.Scanner;
public class PedirstringEliminarespaciosenblanco
{
    public static void main(String[] args)
    {
        // declarar variable e instanciar clase
        String cadena;
        Scanner t = new Scanner (System.in);
        // inicio programa usuario
        System.out.println("Dame una cadena y cambiaré \' \' por \'_\'");
        // pedir input usuario
        cadena = t.nextLine();
        // imprimir input usuario sin espacios en blanco
        System.out.println(cadena.replaceAll(" ","_"));
    }
}