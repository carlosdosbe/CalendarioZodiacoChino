
package signosZodiacales;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Leo extends SignoP
{
    //(Julio 23–Agosto 22)
    
    public Leo() throws ParseException 
    {
        super();
        sdf = new SimpleDateFormat("MM-dd");
        super.dateI = sdf.parse("07-23");
        super.dateF = sdf.parse("08-22");
    }

    @Override
    public boolean analizarSigno(Date dateUser)
    {
        return super.analizarSigno(dateUser);
    }
    
    
    
}
