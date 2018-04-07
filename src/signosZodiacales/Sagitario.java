
package signosZodiacales;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Sagitario extends SignoP
{
    //(Noviembre 22 - Diciembre 21)

    public Sagitario() throws ParseException
    {
        super();
        sdf = new SimpleDateFormat("MM-dd");
        super.dateI = sdf.parse("11-22");
        super.dateF = sdf.parse("12-21");
    }

    @Override
    public boolean analizarSigno(Date dateUser)
    {
        return super.analizarSigno(dateUser);
    }
    
    
}
