package pkg11.matrices.encuesta.estadisticas;
public class MatricesEncuestaEstadisticas
{
    public static void main(String[] args)
    {
        int tamano = 10;
        
        int[] sexo = new int[tamano]; // 1 masculino, 2 femenino
        int[] trabajo = new int[tamano]; // 1 sí trabaja, 2 no
        int[] sueldo = new int[tamano]; // si no se trabaja, sueldo es 0
        
        int hombres=0, mujeres=0, hombresTrabajan=0, mujeresTrabajan=0, sueldoHombres=0, sueldoMujeres=0;
        
        // rellenar vectores y variables
        for (int i=0 ; i<tamano ; i++)
        {
            sexo[i] = (int) (Math.random()*2)+1;
            trabajo[i] = (int) (Math.random()*2)+1;
            
            if ( sexo[i]==1 )
            {
                hombres++;
                if (trabajo[i]==1 )
                {
                    // sueldo automático 600-2000
                    sueldo[i] = (int) Math.floor(Math.random()*1400+600);
                    sueldoHombres = sueldoHombres + sueldo[i];
                    hombresTrabajan++;
                }
            }
            
            else if ( sexo[i]==2 )
            {
                mujeres++;
                if (trabajo[i]==1 )
                {
                    // sueldo automático 600-2000
                    sueldo[i] = (int) Math.floor(Math.random()*1400+600);
                    sueldoMujeres = sueldoMujeres + sueldo[i];
                    mujeresTrabajan++;
                }
            }
           
            if ( trabajo[i]==2 )
            {
                sueldo[i]=0;
            }
            
        }
        // imprimir valores
        for (int i=0 ; i<tamano ; i++)
        {
            System.out.print(sexo[i]+"\t");
            System.out.print(trabajo[i]+"\t");
            System.out.print(sueldo[i]+"\n");
        }
        
        System.out.println();
        
        // casting
        double a = (double) tamano;
        double h = (double) hombres;
        double m = (double) mujeres;
        double ht = (double) hombresTrabajan;
        double mt = (double) mujeresTrabajan;
        double sht = (double) sueldoHombres/ht;
        double smt = (double) sueldoMujeres/mt;
        
        System.out.println("HOMBRES -->  "+h*a+" %");
        System.out.println("MUJERES -->  "+m*a+" %");
        
        System.out.println("HOMBRES TRABAJAN / TOTAL -->  "+ht*a+" %");
        System.out.println("MUJERES TRABAJAN /TOTAL -->  "+mt*a+" %");
        
        System.out.println("SUELDO MEDIO HOMBRES TRABAJAN / TOTAL -->  "+sht+" €");
        System.out.println("SUELDO MEDIO MUJERES TRABAJAN / TOTAL -->  "+smt+" €");
        }
    }