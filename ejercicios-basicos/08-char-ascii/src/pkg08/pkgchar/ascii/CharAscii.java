package pkg08.pkgchar.ascii;
import java.util.Scanner;
public class CharAscii {
    public static void main(String[] args) {
        // pedir char por teclado
        Scanner t = new Scanner(System.in);
        System.out.println("Introduce un carácter de la tabla ASCII");
        
        String caracter = t.nextLine();
        
        while ( caracter.length() > 1 )
        {
            System.out.println("Introduce UN SOLO carácter");
            caracter = t.nextLine();
        }
        
        System.out.println("String: "+caracter);
        
        // String --> char
        char a = caracter.charAt(0);
        System.out.println("char: "+a);
        // char --> int
        int b = (int) a;
        System.out.println("código tabla ASCII de "+a+": "+b);
    }
}