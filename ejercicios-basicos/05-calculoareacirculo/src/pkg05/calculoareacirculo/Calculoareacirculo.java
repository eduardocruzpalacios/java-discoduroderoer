package pkg05.calculoareacirculo;
import javax.swing.JOptionPane;
public class Calculoareacirculo {
    public static void main(String[] args) {
        // pedir radio
        String input = JOptionPane.showInputDialog("Introduce un radio");
        // String --> double
        double radio = Double.parseDouble(input);
  
        // calcular radio usando métodos clase Math
        double area = ( Math.PI ) * ( Math.pow(radio,2) );
  
        System.out.println("El area del circulo es "+area);
    }
}