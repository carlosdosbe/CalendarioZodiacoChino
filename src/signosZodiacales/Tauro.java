
package signosZodiacales;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Tauro extends SignoP
{
    //(Abril 20 – Mayo 20)
    
    public Tauro() throws ParseException
    {
        super();
        sdf = new SimpleDateFormat("MM-dd");
        dateI = sdf.parse("04-20");
        dateF = sdf.parse("05-20");
    }

    @Override
    public boolean analizarSigno(Date dateUser)
    {
        return super.analizarSigno(dateUser);
    }    
    
}
