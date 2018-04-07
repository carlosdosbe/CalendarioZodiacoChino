
package signosZodiacales;

import java.text.ParseException;
import java.util.Date;

public class ValidarSignosZ
{
    private boolean bandera = false;
    private CalendarioZodiacal calendarioZodiacal;

    public ValidarSignosZ() throws ParseException
    {
        calendarioZodiacal = new CalendarioZodiacal();
    }    
    
    public String validarSignoZodiacal(Date date)
    {
        //Comparando para obtener un signo zodiacal
        boolean banderaTemp = false; 
        String signo = null;
        
        if (bandera == false)
        {
            banderaTemp = calendarioZodiacal.getAcuario().analizarSigno(date);
            if (banderaTemp == true)
            {
                bandera = true;
                signo = "Acuario";
            }
        }      
        
        
        if(bandera == false)
        {
            banderaTemp = calendarioZodiacal.getPiscis().analizarSigno(date);
            if (banderaTemp == true)
            {
                bandera = true;
                signo = "Piscis";
            }
        }
        
        if(banderaTemp == false)
        {
            banderaTemp = calendarioZodiacal.getAries().analizarSigno(date);
            if (banderaTemp == true)
            {
                bandera = true;
                signo = "Aries";
            }
        }
        
        if(banderaTemp == false)
        {
            banderaTemp = calendarioZodiacal.getTauro().analizarSigno(date);
            if (banderaTemp == true)
            {
                bandera = true;
                signo = "Tauro";
            }
        }
        
        if(banderaTemp == false)
        {
            banderaTemp = calendarioZodiacal.getGeminis().analizarSigno(date);
            if (banderaTemp == true)
            {
                bandera = true;
                signo = "Geminis";
            }
        }
        
        if(banderaTemp == false)
        {
            banderaTemp = calendarioZodiacal.getCancer().analizarSigno(date);
            if (banderaTemp == true)
            {
                bandera = true;
                signo = "Cancer";
            }
        }
        
        if(banderaTemp == false)
        {
            banderaTemp = calendarioZodiacal.getLeo().analizarSigno(date);
            if (banderaTemp == true)
            {
                bandera = true;
                signo = "Leo";
            }
        }
        
        if(banderaTemp == false)
        {
            banderaTemp = calendarioZodiacal.getVirgo().analizarSigno(date);
            if (banderaTemp == true)
            {
                bandera = true;
                signo = "Virgo";
            }
        }
        
        if(banderaTemp == false)
        {
            banderaTemp = calendarioZodiacal.getLibra().analizarSigno(date);
            if (banderaTemp == true)
            {
                bandera = true;
                signo = "Libra";
            }
        }
        
        if(banderaTemp == false)
        {
            banderaTemp = calendarioZodiacal.getEscorpio().analizarSigno(date);
            if (banderaTemp == true)
            {
                bandera = true;
                signo = "Escorpio";
            }
        }
        
        if(banderaTemp == false)
        {
            banderaTemp = calendarioZodiacal.getSagitario().analizarSigno(date);
            if (banderaTemp == true)
            {
                bandera = true;
                signo = "Sagitario";
            }
        }
        
        if(banderaTemp == false)
        {
            banderaTemp = calendarioZodiacal.getCapricornio().analizarSignoCapri(date);
            if (banderaTemp == true)
            {
                bandera = true;
                signo = "Capricornio";
            }
        }
        return signo;
    }
}
