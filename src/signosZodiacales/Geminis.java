
package signosZodiacales;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Geminis extends SignoP
{
    //(Mayo 21 – Junio 20)
    Date dateI;
    Date dateF;
    
    /*
    sdf = new SimpleDateFormat("MM-dd");
        dateI = sdf.parse("05-21");
        dateF = sdf.parse("06-20");
    */

    public Geminis() throws ParseException
    {
        super();
        sdf = new SimpleDateFormat("MM-dd");
        super.dateI = sdf.parse("05-21");
        super.dateF = sdf.parse("06-20");
        
    }

    @Override
    public boolean analizarSigno(Date dateUser) {
        return super.analizarSigno(dateUser); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
    
}
