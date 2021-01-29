package pkg35.enumdiassemana.switchdialaboral;
import java.util.Scanner;
public class EnumdiassemanaSwitchdialaboral
{
    public static void main(String[] args)
    {
        Scanner t = new Scanner(System.in);
        System.out.println("Escribe un día de la semana");
        String dia = t.next();
         
        DiasSemana diaS = DiasSemana.valueOf(dia.toUpperCase());
         
        switch(diaS){
            case LUNES:
            case MARTES:
            case MIERCOLES:
            case JUEVES:
            case VIERNES:
                System.out.println("El dia "+diaS.name().toLowerCase()+" es laborable");
                break;
            case SABADO:
            case DOMINGO:
                System.out.println("El dia "+diaS+" no es laborable");
                break;
        }
    }
}