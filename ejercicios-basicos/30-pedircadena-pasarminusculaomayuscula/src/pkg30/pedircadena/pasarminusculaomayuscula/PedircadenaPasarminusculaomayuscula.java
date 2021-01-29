package pkg30.pedircadena.pasarminusculaomayuscula;
import javax.swing.JOptionPane;
public class PedircadenaPasarminusculaomayuscula
{
    public static void main(String[] args)
    {
        String input;
        String output = "";
        
        input = JOptionPane.showInputDialog(null,"Por favor, introduce una frase","Introducción",JOptionPane.INFORMATION_MESSAGE);
         
        // true/false = input a mayúsculas/minúsculas
        boolean isMayus;
        // DIFERENCIA se usa para convertir minúscula a mayúscula. 32 es distancia en tabla ascii de 'a' a 'A' y con el resto de letras
        final int DIFERENCIA = 32;
         
        String[] opciones = {"Mayusculas", "Minusculas"};
        int eleccion=JOptionPane.showOptionDialog(null,"Elige tu opción","Eleccion",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,null,opciones,opciones[0]);
         
        isMayus = (eleccion == JOptionPane.YES_OPTION);
         
        char caracterActual;
         
        for(int i=0;i<input.length();i++)
        {
            // obtener caracter posición i
            caracterActual = input.charAt(i);
             
            if(isMayus)
            {
                // Si esta entre esos valores, lo cambia a mayúscula
                // Puedes sustituir 97 por 'a' y así con todos los caracteres
                if(caracterActual>=97 && caracterActual<=122)
                {
                    output+=(char)(caracterActual-DIFERENCIA);
                }
                else
                {
                    // Si no es un caracter alfabético en minúscula, lo agregamos sin hacer nada
                    output+=caracterActual;
                }
            }
            else
            {
                // Si esta entre esos valores, cambiar a minúscula
                // Puedes sustituir 65 por 'A' y así con todos los caracteres
                if(caracterActual>=65 && caracterActual<=90)
                {
                    output+=(char)(caracterActual+DIFERENCIA);
                }
                else
                {
                    // Si no es un caracter alfabetico en minuscula, lo agregamos sin hacerle nada
                    output+=caracterActual;
                }
            }
        }
        // Mostrar cadena resultante
        JOptionPane.showMessageDialog(null,output,"Resultado",JOptionPane.INFORMATION_MESSAGE);
    }
}