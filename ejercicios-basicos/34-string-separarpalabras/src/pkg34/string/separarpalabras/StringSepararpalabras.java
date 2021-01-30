package pkg34.string.separarpalabras;
public class StringSepararpalabras {
    public static void main(String[] args)
    {
        String frase = "Escribe una frase. Hola, Bb + Aa [jj, 447]";
         
        // Arrray de String guarda palabras de frase
        String palabras[] = frase.split("[ ,.]");
         
        for(int i=0;i<palabras.length;i++)
        {
            System.out.println(palabras[i]);
        }
    }
}