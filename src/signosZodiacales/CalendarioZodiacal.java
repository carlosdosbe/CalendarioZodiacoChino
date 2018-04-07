
package signosZodiacales;

import java.text.ParseException;

public class CalendarioZodiacal
{
    private Acuario acuario;
    private Piscis piscis;
    private Aries aries;
    private Tauro tauro;
    private Geminis geminis;
    private Cancer cancer;
    private Leo leo;
    private Virgo virgo;
    private Libra libra;
    private Escorpio escorpio;
    private Sagitario sagitario;
    private Capricornio capricornio;
    
    private int mesCambiado;

    public CalendarioZodiacal() throws ParseException
    {
        acuario = new Acuario();
        piscis =  new Piscis();
        aries = new Aries();
        tauro = new Tauro();
        geminis = new Geminis();
        cancer = new Cancer();
        leo = new Leo();
        virgo = new Virgo();
        libra = new Libra();
        escorpio = new Escorpio();
        sagitario = new Sagitario();
        capricornio = new Capricornio();
        
    }

    public Acuario getAcuario() {
        return acuario;
    }

    public Piscis getPiscis() {
        return piscis;
    }

    public Aries getAries() {
        return aries;
    }

    public Tauro getTauro() {
        return tauro;
    }

    public Geminis getGeminis() {
        return geminis;
    }

    public Cancer getCancer() {
        return cancer;
    }

    public Leo getLeo() {
        return leo;
    }

    public Virgo getVirgo() {
        return virgo;
    }

    public Libra getLibra() {
        return libra;
    }

    public Escorpio getEscorpio() {
        return escorpio;
    }

    public Sagitario getSagitario() {
        return sagitario;
    }

    public Capricornio getCapricornio() {
        return capricornio;
    }

    
    
    
}
