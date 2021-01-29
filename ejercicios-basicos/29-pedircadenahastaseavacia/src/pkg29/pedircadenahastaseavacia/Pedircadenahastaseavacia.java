package pkg29.pedircadenahastaseavacia;
import java.util.Scanner;
public class Pedircadenahastaseavacia {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        String cadena;
        
        do
        {
            System.out.println("Dame una cadena");
            cadena = t.nextLine();
        }
        while(!cadena.equals(""));
    }
}