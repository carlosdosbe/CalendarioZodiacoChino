
package signosZodiacales;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Piscis extends SignoP
{
    //(Febrero 19 – Marzo 20)

    public Piscis() throws ParseException
    {
        super();
        sdf = new SimpleDateFormat("MM-dd");
        dateI = sdf.parse("02-19");
        dateF = sdf.parse("03-20");
    }

    @Override
    public boolean analizarSigno(Date dateUser)
    {
        return super.analizarSigno(dateUser);
    }

    
    
}
