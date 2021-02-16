package pkg23.cadenareemplazarcaracteres;
public class Cadenareemplazarcaracteres
{
    public static void main(String[] args)
    {
        // declarar e iniciar cadena
        String cadena1 = "La lluvia en Sevilla es una maravilla";
        String cadena2 = cadena1.replaceAll("a","e");
        System.out.println(cadena2);
    }
}