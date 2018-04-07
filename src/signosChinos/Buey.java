package signosChinos;


public class Buey
{
    private final int[] years;
    private String description = ("Características del signo del Buey\n" +
            "¡Símbolo del trabajo y la honradez! El Buey representa en la mitología china la prosperidad\n");

    public Buey()
    {
        this.years = new int[]{
            1901, 1913, 1925, 1937,
            1949, 1961, 1973, 1985, 
            1997, 2009
        };
    }

    public int[] getYears()
    {
        return years;
    }
    
    
}
