
package signosZodiacales;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Virgo extends SignoP
{
    //(Agosto 23 – Septiembre 22)

    public Virgo() throws ParseException 
    {
        super();
        sdf = new SimpleDateFormat("MM-dd");
        super.dateI = sdf.parse("08-23");
        super.dateF = sdf.parse("09-22");
    }

    @Override
    public boolean analizarSigno(Date dateUser)
    {
        return super.analizarSigno(dateUser);
    }
    
    
    
}
