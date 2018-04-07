
package signosZodiacales;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Escorpio extends SignoP
{
    //(Octubre 23 – Noviembre 21)

    public Escorpio() throws ParseException
    {
        super();
        sdf = new SimpleDateFormat("MM-dd");
        super.dateI = sdf.parse("10-23");
        super.dateF = sdf.parse("11-21");
    }

    @Override
    public boolean analizarSigno(Date dateUser)
    {
        return super.analizarSigno(dateUser); 
    }
    
    
    
}
