package pkg39.relojdigital;
public class Relojdigital
{
    public static void main(String[] args) throws InterruptedException
    {
        // declarar variables
        int horas = 0, minutos = 0, segundos = 0;
        // bucle infinito
        while (true)
        {
            // formato hh:mm:ss
            // si menor que 10, escribimos un cero delante
            if (horas < 10)
            {
                System.out.print("0");
            }
 
            System.out.print(horas + ":");
 
            if (minutos < 10)
            {
                System.out.print("0");
            }
 
            System.out.print(minutos + ":");
 
            if (segundos < 10)
            {
                System.out.print("0");
            }
 
            // después de escribir los segundos, salto de linea
            System.out.println(segundos);
 
            // aumentar tiempo
            segundos++;
 
            // comprobar tiempo, si una es 60, pasa a 0 y aumenta 1 la siguiente
            if (segundos == 60)
            {
                segundos = 0;
                minutos++;
                
                if (minutos == 60)
                {
                    minutos = 0;
                    horas++;
                    
                    if (horas == 24)
                    {
                        horas = 0;
                    }
                }
            }
            Thread.sleep(1000);
        }
    }
}