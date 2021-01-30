package pkg21.numerosprimos1a100;
public class Numerosprimos1a100
{
    public static void main(String[] args)
    {
        for(int i=1;i<101;i++)
        {
            // si <= 1, no es primo
            if (i<=1)
            {
                System.out.println(i+" no es primo");
            }
            /* si > 1
                calculamos raizCuadrada
                dividimos i / raiz y raiz-- hasta 1 y contamos cuántos restos de divisiones no son 0
                    si cuenta = 0, i es primo
                    si cuenta > 0, i no es primo
            */
            else
            {
                int raiz = (int) Math.sqrt(i);
                int cuenta=0;
                for (int j= raiz ; j > 1 ; j--)
                {
                    if (i%j == 0)
                    {
                        cuenta++;
                    }
                }
                if (cuenta == 0)
                {
                    System.out.println(i+" sí es primo");
                }
                else
                {
                    System.out.println(i+" no es primo");
                }
            }
        }
    }
}