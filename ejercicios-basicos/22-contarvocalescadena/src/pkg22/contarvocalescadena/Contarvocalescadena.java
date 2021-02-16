package pkg22.contarvocalescadena;
public class Contarvocalescadena
{
    public static void main(String[] args)
    {
        // declarar variables
        String t = "La lluvia en Sevilla es una maravilla";
        char a; // comparar si es vocal
        int cuenta=0;
        // bucle recorre cadena, si un caracter es vocal suma1 a cuenta
        for ( int i=0 ; i<t.length() ; i++ )
        {
            a = t.charAt(i);
            if ( a=='a' || a=='e' || a=='i' || a=='o' || a=='u' )
            {
                cuenta++;
            }
        }
        // imprime cuenta
        System.out.println("En la cadena \""+t+"\" hay "+cuenta+" vocales");
    }
}