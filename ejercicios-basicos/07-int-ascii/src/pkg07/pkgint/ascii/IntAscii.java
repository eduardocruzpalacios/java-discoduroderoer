package pkg07.pkgint.ascii;
import javax.swing.JOptionPane;
public class IntAscii
{
    public static void main(String[] args)
    {
        String texto = JOptionPane.showInputDialog("Introduce un código de la tabla ASCII");
        System.out.println("Texto introducido por usuario: "+texto);
        // String --> int
        int codigo = Integer.parseInt(texto);
        System.out.println("int (from String): "+codigo);
        // int --> char
        char caracter = (char) codigo;
        
        System.out.println("Cáracter de la tabla ASCII que viene del código "+codigo+": "+caracter);
    }   
}