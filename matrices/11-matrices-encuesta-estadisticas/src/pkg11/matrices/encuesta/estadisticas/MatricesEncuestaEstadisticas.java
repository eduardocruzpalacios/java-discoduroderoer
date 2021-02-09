package pkg11.matrices.encuesta.estadisticas;
public class MatricesEncuestaEstadisticas
{
    public static void main(String[] args)
    {
        int tamano = 10;
        
        int[] sexo = new int[tamano]; // 1 masculino, 2 femenino
        int[] trabajo = new int[tamano]; // 1 sí trabaja, 2 no
        int[] sueldo = new int[tamano]; // si no se trabaja, sueldo es 0
        
        int hombres=0, mujeres=0, hombresTrabajan=0, mujeresTrabajan=0, sueldoMedioHombresTrabajan=0, sueldoMedioMujeresTrabajan=0;
        
        for (int i=0 ; i<tamano ; i++)
        {
            // rellenar vectores
            sexo[i] = (int) (Math.random()*2)+1;
            trabajo[i] = (int) (Math.random()*2)+1;
           
            if ( trabajo[i]==2 )
            {
                sueldo[i]=0;
            }
            else if (trabajo[i]==1 )
            {
                // sueldo automático 600-2000
                sueldo[i] = (int) Math.floor(Math.random()*1400+600);
                // calcular
                if ( sexo[i]==1 )
                {
                    sueldoMedioHombresTrabajan = sueldoMedioHombresTrabajan + sueldo[i];
                }
                else if ( sexo[i]==2 )
                {
                    sueldoMedioMujeresTrabajan = sueldoMedioMujeresTrabajan + sueldo[i];
                }
            }
            // calcular
            if ( sexo[i]==1 )
            {
                hombres++;
            }
            else if ( sexo[i]==2 )
            {
                mujeres++;
            }
            if ( sexo[i]==1 && trabajo[i]==1)
            {
                hombresTrabajan++;
            }
            else if ( sexo[i]==2 && trabajo[i]==1)
            {
                mujeresTrabajan++;
            }
        }
        
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
        double sht = (double) sueldoMedioHombresTrabajan/ht;
        double smt = (double) sueldoMedioMujeresTrabajan/mt;
        
        System.out.println("HOMBRES -->  "+h*a+" %");
        System.out.println("MUJERES -->  "+m*a+" %");
        
        System.out.println("HOMBRES TRABAJAN -->  "+ht*a+" %");
        System.out.println("MUJERES TRABAJAN -->  "+mt*a+" %");
        
        System.out.println("SUELDO MEDIO HOMBRES TRABAJAN -->  "+sht+" €");
        System.out.println("SUELDO MEDIO MUJERES TRABAJAN -->  "+smt+" €");
    }
}