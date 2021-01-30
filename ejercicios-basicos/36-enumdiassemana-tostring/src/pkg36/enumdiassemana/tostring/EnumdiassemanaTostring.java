package pkg36.enumdiassemana.tostring;
import java.util.Scanner;
public class EnumdiassemanaTostring
{
    public static void main(String[] args)
    {
        // instanciar clase Scanner y pedir por pantalla día semana
        Scanner t = new Scanner(System.in);
        System.out.println("Escribe un día de la semana");
        String input = t.next();
        // instanciar clase DiasSemana cuyo valor sea input usuario pasado a mayús
        DiasSemana diaS = DiasSemana.valueOf(input.toUpperCase());
         
        System.out.println(diaS.toString());
    }
}