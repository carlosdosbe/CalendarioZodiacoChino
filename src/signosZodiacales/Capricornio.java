
package signosZodiacales;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Capricornio extends SignoP
{
    //(Diciembre 22 – Enero 19)

    public Capricornio() throws ParseException
    {
        super();
        sdf = new SimpleDateFormat("MM-dd");
        super.dateI = sdf.parse("12-22");
        super.dateF = sdf.parse("01-19");
    }

    // Para este signo se ocupo un caso especial
    public boolean analizarSignoCapri(Date dateUser)
    {
        boolean bandera = false;
        //Menor
        int a = dateUser.compareTo(dateI);
        //System.out.println(a);
        //Mayor
        int b = dateUser.compareTo(dateF);
        //System.out.println(b);
        
        if((a >= 0 && b >= 0) ||  (a == -1 && b == -1) || (a == 0 || b ==0))
        {
            bandera = true;
        }
        else
        {
            bandera = false;
        }   
        
        return bandera;
    }
    
    
    
}
