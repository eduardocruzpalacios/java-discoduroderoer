package pkg33.cadena.metodosubstring;
public class CadenaMetodosubstring
{
    public static void main(String[] args)
    {
         // Dado un String, extraer 4º y 5º letra usando método substring
        String cadena = "12345";
        
        String subcadena = cadena.substring(3,5);
        
        System.out.println(subcadena);
    }
}