
package signosZodiacales;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Aries extends SignoP
{
    // Marzo 21 –Abril 19
       
    public Aries() throws ParseException
    {
        super();
        sdf = new SimpleDateFormat("MM-dd");
        dateI = sdf.parse("03-21");
        dateF = sdf.parse("04-19");
    }

    @Override
    public boolean analizarSigno(Date dateUser)
    {
        return super.analizarSigno(dateUser);
    }

    
    
}
