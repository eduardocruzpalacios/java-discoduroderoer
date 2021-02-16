package pkg03.imprimir.cadena;
import javax.swing.JOptionPane;
public class ImprimirCadena
{
    public static void main(String[] args)
    {
        String name = JOptionPane.showInputDialog("Dame tu nombre");
        System.out.println("Bienvenido "+name);
    }
}