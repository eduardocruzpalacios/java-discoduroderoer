package pkg36.enumdiassemana.tostring;
public enum DiasSemana
{
    LUNES(true),
    MARTES(true),
    MIERCOLES(true),
    JUEVES(true),
    VIERNES(true),
    SABADO(false),
    DOMINGO(false);
     
    private boolean laborable;
    
    // setter establece boolean laborable en true/false según qué día sea
    private DiasSemana(boolean laborable)
    {
        this.laborable = laborable;
    }
 
    @Override
    public String toString()
    {
        if(laborable)
        {
            return "El día "+ this.name().toLowerCase() +" es laborable";
        }
        else
        {
            return "El día "+ this.name().toLowerCase() +" no es laborable";
        }
    }    
}