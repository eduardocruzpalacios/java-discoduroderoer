package pkg24.string.a.ascii;
public class StringAAscii {
    public static void main(String[] args) {
        String txt= "La lluvia en Sevilla es una maravilla";
        char caracter;
        int codigo;
        
        for (int i=0 ; i<txt.length() ; i++)
        {
            // guardar char
            caracter = txt.charAt(i);
            // char --> int
            codigo = (int) caracter;
            System.out.print(codigo+" ");
        }
    }
}