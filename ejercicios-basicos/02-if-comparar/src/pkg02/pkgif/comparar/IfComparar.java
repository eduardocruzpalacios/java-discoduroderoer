package pkg02.pkgif.comparar;
public class IfComparar {
    public static void main(String[] args) {
        double num1 = 15.4;
        double num2 = 15.4;
        
        if (num1>num2)
        {
            System.out.println(num1+" es mayor que "+num2);
        }
        else if (num1<num2)
        {
            System.out.println(num1+" es menor que "+num2);
        }
        else
        {
            System.out.println(num1+" y "+num2+" son iguales");
        }
    }
}