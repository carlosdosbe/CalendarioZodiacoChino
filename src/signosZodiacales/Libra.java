
package signosZodiacales;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Libra extends SignoP
{
    //(Septiembre 23 – Octubre 22)
    
    public Libra() throws ParseException
    {
        super();
        sdf = new SimpleDateFormat("MM-dd");
        super.dateI = sdf.parse("09-23");
        super.dateF = sdf.parse("10-22");
    }
    
}
